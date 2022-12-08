import grpc from "@grpc/grpc-js";
import protoLoader from "@grpc/proto-loader";

const protoFile =
  import.meta.url.substring(
    "file://".length,
    import.meta.url.lastIndexOf("/")
  ) + "/../workshop.proto";

const packageDefinition = protoLoader.loadSync(protoFile, {
  keepCase: true,
  longs: String,
  enums: String,
  defaults: true,
  oneofs: true,
});

const protoDescriptor = grpc.loadPackageDefinition(packageDefinition);

const client = new protoDescriptor.OmegapointServer(
  "localhost:1337",
  grpc.credentials.createInsecure()
);

client.GetTime({}, function (err, resp) {
  console.log(resp.current_time);
});
