package Omegapoint;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: workshop.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OmegapointServerGrpc {

  private OmegapointServerGrpc() {}

  public static final String SERVICE_NAME = "Omegapoint.OmegapointServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Omegapoint.Workshop.TimeRequest,
      Omegapoint.Workshop.TimeResponse> getGetTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTime",
      requestType = Omegapoint.Workshop.TimeRequest.class,
      responseType = Omegapoint.Workshop.TimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Omegapoint.Workshop.TimeRequest,
      Omegapoint.Workshop.TimeResponse> getGetTimeMethod() {
    io.grpc.MethodDescriptor<Omegapoint.Workshop.TimeRequest, Omegapoint.Workshop.TimeResponse> getGetTimeMethod;
    if ((getGetTimeMethod = OmegapointServerGrpc.getGetTimeMethod) == null) {
      synchronized (OmegapointServerGrpc.class) {
        if ((getGetTimeMethod = OmegapointServerGrpc.getGetTimeMethod) == null) {
          OmegapointServerGrpc.getGetTimeMethod = getGetTimeMethod =
              io.grpc.MethodDescriptor.<Omegapoint.Workshop.TimeRequest, Omegapoint.Workshop.TimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.TimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.TimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OmegapointServerMethodDescriptorSupplier("GetTime"))
              .build();
        }
      }
    }
    return getGetTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Omegapoint.Workshop.TimeRequest,
      Omegapoint.Workshop.TimeResponse> getStreamTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTime",
      requestType = Omegapoint.Workshop.TimeRequest.class,
      responseType = Omegapoint.Workshop.TimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Omegapoint.Workshop.TimeRequest,
      Omegapoint.Workshop.TimeResponse> getStreamTimeMethod() {
    io.grpc.MethodDescriptor<Omegapoint.Workshop.TimeRequest, Omegapoint.Workshop.TimeResponse> getStreamTimeMethod;
    if ((getStreamTimeMethod = OmegapointServerGrpc.getStreamTimeMethod) == null) {
      synchronized (OmegapointServerGrpc.class) {
        if ((getStreamTimeMethod = OmegapointServerGrpc.getStreamTimeMethod) == null) {
          OmegapointServerGrpc.getStreamTimeMethod = getStreamTimeMethod =
              io.grpc.MethodDescriptor.<Omegapoint.Workshop.TimeRequest, Omegapoint.Workshop.TimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.TimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.TimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OmegapointServerMethodDescriptorSupplier("StreamTime"))
              .build();
        }
      }
    }
    return getStreamTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Omegapoint.Workshop.UserSecret,
      Omegapoint.Workshop.SecretMessage> getGetSecretMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecretMessage",
      requestType = Omegapoint.Workshop.UserSecret.class,
      responseType = Omegapoint.Workshop.SecretMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Omegapoint.Workshop.UserSecret,
      Omegapoint.Workshop.SecretMessage> getGetSecretMessageMethod() {
    io.grpc.MethodDescriptor<Omegapoint.Workshop.UserSecret, Omegapoint.Workshop.SecretMessage> getGetSecretMessageMethod;
    if ((getGetSecretMessageMethod = OmegapointServerGrpc.getGetSecretMessageMethod) == null) {
      synchronized (OmegapointServerGrpc.class) {
        if ((getGetSecretMessageMethod = OmegapointServerGrpc.getGetSecretMessageMethod) == null) {
          OmegapointServerGrpc.getGetSecretMessageMethod = getGetSecretMessageMethod =
              io.grpc.MethodDescriptor.<Omegapoint.Workshop.UserSecret, Omegapoint.Workshop.SecretMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecretMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.UserSecret.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.SecretMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OmegapointServerMethodDescriptorSupplier("GetSecretMessage"))
              .build();
        }
      }
    }
    return getGetSecretMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Omegapoint.Workshop.SecretKey,
      Omegapoint.Workshop.SuccessfullMessage> getAccessSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccessSecret",
      requestType = Omegapoint.Workshop.SecretKey.class,
      responseType = Omegapoint.Workshop.SuccessfullMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Omegapoint.Workshop.SecretKey,
      Omegapoint.Workshop.SuccessfullMessage> getAccessSecretMethod() {
    io.grpc.MethodDescriptor<Omegapoint.Workshop.SecretKey, Omegapoint.Workshop.SuccessfullMessage> getAccessSecretMethod;
    if ((getAccessSecretMethod = OmegapointServerGrpc.getAccessSecretMethod) == null) {
      synchronized (OmegapointServerGrpc.class) {
        if ((getAccessSecretMethod = OmegapointServerGrpc.getAccessSecretMethod) == null) {
          OmegapointServerGrpc.getAccessSecretMethod = getAccessSecretMethod =
              io.grpc.MethodDescriptor.<Omegapoint.Workshop.SecretKey, Omegapoint.Workshop.SuccessfullMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccessSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.SecretKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Omegapoint.Workshop.SuccessfullMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OmegapointServerMethodDescriptorSupplier("AccessSecret"))
              .build();
        }
      }
    }
    return getAccessSecretMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OmegapointServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OmegapointServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OmegapointServerStub>() {
        @java.lang.Override
        public OmegapointServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OmegapointServerStub(channel, callOptions);
        }
      };
    return OmegapointServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OmegapointServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OmegapointServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OmegapointServerBlockingStub>() {
        @java.lang.Override
        public OmegapointServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OmegapointServerBlockingStub(channel, callOptions);
        }
      };
    return OmegapointServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OmegapointServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OmegapointServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OmegapointServerFutureStub>() {
        @java.lang.Override
        public OmegapointServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OmegapointServerFutureStub(channel, callOptions);
        }
      };
    return OmegapointServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OmegapointServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTime(Omegapoint.Workshop.TimeRequest request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.TimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTimeMethod(), responseObserver);
    }

    /**
     */
    public void streamTime(Omegapoint.Workshop.TimeRequest request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.TimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTimeMethod(), responseObserver);
    }

    /**
     */
    public void getSecretMessage(Omegapoint.Workshop.UserSecret request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.SecretMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretMessageMethod(), responseObserver);
    }

    /**
     */
    public void accessSecret(Omegapoint.Workshop.SecretKey request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.SuccessfullMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccessSecretMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Omegapoint.Workshop.TimeRequest,
                Omegapoint.Workshop.TimeResponse>(
                  this, METHODID_GET_TIME)))
          .addMethod(
            getStreamTimeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                Omegapoint.Workshop.TimeRequest,
                Omegapoint.Workshop.TimeResponse>(
                  this, METHODID_STREAM_TIME)))
          .addMethod(
            getGetSecretMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Omegapoint.Workshop.UserSecret,
                Omegapoint.Workshop.SecretMessage>(
                  this, METHODID_GET_SECRET_MESSAGE)))
          .addMethod(
            getAccessSecretMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Omegapoint.Workshop.SecretKey,
                Omegapoint.Workshop.SuccessfullMessage>(
                  this, METHODID_ACCESS_SECRET)))
          .build();
    }
  }

  /**
   */
  public static final class OmegapointServerStub extends io.grpc.stub.AbstractAsyncStub<OmegapointServerStub> {
    private OmegapointServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmegapointServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OmegapointServerStub(channel, callOptions);
    }

    /**
     */
    public void getTime(Omegapoint.Workshop.TimeRequest request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.TimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamTime(Omegapoint.Workshop.TimeRequest request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.TimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecretMessage(Omegapoint.Workshop.UserSecret request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.SecretMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accessSecret(Omegapoint.Workshop.SecretKey request,
        io.grpc.stub.StreamObserver<Omegapoint.Workshop.SuccessfullMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccessSecretMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OmegapointServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<OmegapointServerBlockingStub> {
    private OmegapointServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmegapointServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OmegapointServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public Omegapoint.Workshop.TimeResponse getTime(Omegapoint.Workshop.TimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<Omegapoint.Workshop.TimeResponse> streamTime(
        Omegapoint.Workshop.TimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Omegapoint.Workshop.SecretMessage getSecretMessage(Omegapoint.Workshop.UserSecret request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public Omegapoint.Workshop.SuccessfullMessage accessSecret(Omegapoint.Workshop.SecretKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccessSecretMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OmegapointServerFutureStub extends io.grpc.stub.AbstractFutureStub<OmegapointServerFutureStub> {
    private OmegapointServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmegapointServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OmegapointServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Omegapoint.Workshop.TimeResponse> getTime(
        Omegapoint.Workshop.TimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Omegapoint.Workshop.SecretMessage> getSecretMessage(
        Omegapoint.Workshop.UserSecret request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Omegapoint.Workshop.SuccessfullMessage> accessSecret(
        Omegapoint.Workshop.SecretKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccessSecretMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TIME = 0;
  private static final int METHODID_STREAM_TIME = 1;
  private static final int METHODID_GET_SECRET_MESSAGE = 2;
  private static final int METHODID_ACCESS_SECRET = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OmegapointServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OmegapointServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TIME:
          serviceImpl.getTime((Omegapoint.Workshop.TimeRequest) request,
              (io.grpc.stub.StreamObserver<Omegapoint.Workshop.TimeResponse>) responseObserver);
          break;
        case METHODID_STREAM_TIME:
          serviceImpl.streamTime((Omegapoint.Workshop.TimeRequest) request,
              (io.grpc.stub.StreamObserver<Omegapoint.Workshop.TimeResponse>) responseObserver);
          break;
        case METHODID_GET_SECRET_MESSAGE:
          serviceImpl.getSecretMessage((Omegapoint.Workshop.UserSecret) request,
              (io.grpc.stub.StreamObserver<Omegapoint.Workshop.SecretMessage>) responseObserver);
          break;
        case METHODID_ACCESS_SECRET:
          serviceImpl.accessSecret((Omegapoint.Workshop.SecretKey) request,
              (io.grpc.stub.StreamObserver<Omegapoint.Workshop.SuccessfullMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OmegapointServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OmegapointServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Omegapoint.Workshop.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OmegapointServer");
    }
  }

  private static final class OmegapointServerFileDescriptorSupplier
      extends OmegapointServerBaseDescriptorSupplier {
    OmegapointServerFileDescriptorSupplier() {}
  }

  private static final class OmegapointServerMethodDescriptorSupplier
      extends OmegapointServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OmegapointServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OmegapointServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OmegapointServerFileDescriptorSupplier())
              .addMethod(getGetTimeMethod())
              .addMethod(getStreamTimeMethod())
              .addMethod(getGetSecretMessageMethod())
              .addMethod(getAccessSecretMethod())
              .build();
        }
      }
    }
    return result;
  }
}
