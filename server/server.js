import grpc from "@grpc/grpc-js";
import protoLoader from "@grpc/proto-loader";
import crypto from "crypto";

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

const getTime = function () {
  const time = new Date().toISOString();
  return {
    current_time: time,
  };
};

const getHash = function (user) {
  let data = undefined;

  if (!userKeys.keys().includes(user)) {
    data = Math.random().toString(36).slice(3, 7);
    userKeys[user] = data;
  } else {
    data = userKeys[user];
  }

  return {
    key: crypto.createHash("md5").update(data).digest("hex"),
    user: user,
  };
};

const server = new grpc.Server();

server.addService(protoDescriptor.OmegapointServer.service, {
  GetTime: getTime,
  GetSecretMessage: getHash,
});

server.bindAsync(
  "0.0.0.0:1337",
  grpc.ServerCredentials.createInsecure(),
  () => {
    console.log("Listening on port 1337");
    server.start();
  }
);
