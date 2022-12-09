import grpc from "@grpc/grpc-js";
import protoLoader from "@grpc/proto-loader";
import crypto from "crypto";

const port = 1337;
const data = "aHR0cHM6Ly9pLmt5bS1jZG4uY29tL2VudHJpZXMvaWNvbnMvb3JpZ2luYWwvMDAwLzAyOC8yMzAvZnJlZGFnLmpwZw==";

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

const protoDescriptor = grpc.loadPackageDefinition(packageDefinition);

const getTime = function(_, callback) {
  const time = new Date().toISOString();
  const res = {
    currentTime: time,
  };

  callback(null, res);
};

const userKeys = {};

const getSecret = function(call, callback) {
  const user = call.request.user;
  let data = undefined;

  if (!Object.keys(userKeys).includes(user)) {
    data = Math.random().toString(36).slice(2, 5);
    data = crypto.createHash("md5").update(data).digest("hex");
    userKeys[user] = data;
  } else {
    data = userKeys[user];
  }

  const res = {
    secret: data,
  };

  callback(null, res);
};

const secretData = function(call, callback) {
  const tryKey = call.request.key;
  const user = call.request.user;

  const res = {
    keyIsCorrect: false,
    data: null,
  };

  if (crypto.createHash("md5").update(tryKey).digest("hex") === userKeys[user]) {
    console.log(`User ${user} have solved the secret hash! Their password was ${tryKey}`);
    res.keyIsCorrect = true;
    res.data = atob(data);
  }

  callback(null, res);
};

const server = new grpc.Server();

server.addService(protoDescriptor.WorkshopService.service, {
  GetCurrentTime: getTime,
  GetSecret: getSecret,
  GetSecretData: secretData
});

server.bindAsync(
  `0.0.0.0:${port}`,
  grpc.ServerCredentials.createInsecure(),
  () => {
    console.log(`Listening on port ${port}`);
    server.start();
  }
);
