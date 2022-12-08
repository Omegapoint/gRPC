import grpc from "@grpc/grpc-js";
import protoLoader from "@grpc/proto-loader";
import crypto from "crypto";

const port = 1337;

const protoFile =
  import.meta.url.substring(
    "file://".length,
    import.meta.url.lastIndexOf("/")
  ) + "/workshop.proto";

const packageDefinition = protoLoader.loadSync(protoFile, {
  keepCase: true,
  longs: String,
  enums: String,
  defaults: true,
  oneofs: true,
});

const userKeys = {};

const protoDescriptor = grpc.loadPackageDefinition(packageDefinition);

const getTime = function (_, callback) {
  const time = new Date().toISOString();
  const res = {
    current_time: time,
  };

  callback(null, res);
};

const getHash = function (call, callback) {
  const user = call.request.user;
  let data = undefined;

  if (!userKeys.keys().includes(user)) {
    data = Math.random().toString(36).slice(3, 7);
    userKeys[user] = data;
  } else {
    data = userKeys[user];
  }

  callback(null, {
    key: crypto.createHash("md5").update(data).digest("hex"),
    user: user,
  });
};

const hasKey = function (call, callback) {
  const tryKey = call.request.key;

  if (false === true /* wrong key */) {
    call.close();
  } else {
    callback(null, {
      message: Buffer.from(
        "REVUIMOEUiBGUkVEQUcgTUlOQSBCRUtBTlRBCg==",
        "base64"
      ),
    });
  }
};

const server = new grpc.Server();

server.addService(protoDescriptor.OmegapointServer.service, {
  GetTime: getTime,
  GetSecretMessage: getHash,
});

server.bindAsync(
  `0.0.0.0:${port}`,
  grpc.ServerCredentials.createInsecure(),
  () => {
    console.log(`Listening on port ${port}`);
    server.start();
  }
);
