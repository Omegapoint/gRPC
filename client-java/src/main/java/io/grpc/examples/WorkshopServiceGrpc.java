package io.grpc.examples;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: workshop.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkshopServiceGrpc {

  private WorkshopServiceGrpc() {}

  public static final String SERVICE_NAME = "WorkshopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Workshop.TimeRequest,
      Workshop.TimeResponse> getGetCurrentTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentTime",
      requestType = Workshop.TimeRequest.class,
      responseType = Workshop.TimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Workshop.TimeRequest,
      Workshop.TimeResponse> getGetCurrentTimeMethod() {
    io.grpc.MethodDescriptor<Workshop.TimeRequest, Workshop.TimeResponse> getGetCurrentTimeMethod;
    if ((getGetCurrentTimeMethod = WorkshopServiceGrpc.getGetCurrentTimeMethod) == null) {
      synchronized (WorkshopServiceGrpc.class) {
        if ((getGetCurrentTimeMethod = WorkshopServiceGrpc.getGetCurrentTimeMethod) == null) {
          WorkshopServiceGrpc.getGetCurrentTimeMethod = getGetCurrentTimeMethod =
              io.grpc.MethodDescriptor.<Workshop.TimeRequest, Workshop.TimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Workshop.TimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Workshop.TimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkshopServiceMethodDescriptorSupplier("GetCurrentTime"))
              .build();
        }
      }
    }
    return getGetCurrentTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Workshop.GetSecretRequest,
      Workshop.GetSecretResponse> getGetSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecret",
      requestType = Workshop.GetSecretRequest.class,
      responseType = Workshop.GetSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Workshop.GetSecretRequest,
      Workshop.GetSecretResponse> getGetSecretMethod() {
    io.grpc.MethodDescriptor<Workshop.GetSecretRequest, Workshop.GetSecretResponse> getGetSecretMethod;
    if ((getGetSecretMethod = WorkshopServiceGrpc.getGetSecretMethod) == null) {
      synchronized (WorkshopServiceGrpc.class) {
        if ((getGetSecretMethod = WorkshopServiceGrpc.getGetSecretMethod) == null) {
          WorkshopServiceGrpc.getGetSecretMethod = getGetSecretMethod =
              io.grpc.MethodDescriptor.<Workshop.GetSecretRequest, Workshop.GetSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Workshop.GetSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Workshop.GetSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkshopServiceMethodDescriptorSupplier("GetSecret"))
              .build();
        }
      }
    }
    return getGetSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Workshop.GetSecretDataRequest,
      Workshop.GetSecretDataResponse> getGetSecretDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecretData",
      requestType = Workshop.GetSecretDataRequest.class,
      responseType = Workshop.GetSecretDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Workshop.GetSecretDataRequest,
      Workshop.GetSecretDataResponse> getGetSecretDataMethod() {
    io.grpc.MethodDescriptor<Workshop.GetSecretDataRequest, Workshop.GetSecretDataResponse> getGetSecretDataMethod;
    if ((getGetSecretDataMethod = WorkshopServiceGrpc.getGetSecretDataMethod) == null) {
      synchronized (WorkshopServiceGrpc.class) {
        if ((getGetSecretDataMethod = WorkshopServiceGrpc.getGetSecretDataMethod) == null) {
          WorkshopServiceGrpc.getGetSecretDataMethod = getGetSecretDataMethod =
              io.grpc.MethodDescriptor.<Workshop.GetSecretDataRequest, Workshop.GetSecretDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecretData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Workshop.GetSecretDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Workshop.GetSecretDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkshopServiceMethodDescriptorSupplier("GetSecretData"))
              .build();
        }
      }
    }
    return getGetSecretDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkshopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkshopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkshopServiceStub>() {
        @Override
        public WorkshopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkshopServiceStub(channel, callOptions);
        }
      };
    return WorkshopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkshopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkshopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkshopServiceBlockingStub>() {
        @Override
        public WorkshopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkshopServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkshopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkshopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkshopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkshopServiceFutureStub>() {
        @Override
        public WorkshopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkshopServiceFutureStub(channel, callOptions);
        }
      };
    return WorkshopServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WorkshopServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get current time in ISO 8601 format.
     * </pre>
     */
    public void getCurrentTime(Workshop.TimeRequest request,
                               io.grpc.stub.StreamObserver<Workshop.TimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentTimeMethod(), responseObserver);
    }

    /**
     */
    public void getSecret(Workshop.GetSecretRequest request,
                          io.grpc.stub.StreamObserver<Workshop.GetSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretMethod(), responseObserver);
    }

    /**
     */
    public void getSecretData(Workshop.GetSecretDataRequest request,
                              io.grpc.stub.StreamObserver<Workshop.GetSecretDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretDataMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentTimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Workshop.TimeRequest,
                Workshop.TimeResponse>(
                  this, METHODID_GET_CURRENT_TIME)))
          .addMethod(
            getGetSecretMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Workshop.GetSecretRequest,
                Workshop.GetSecretResponse>(
                  this, METHODID_GET_SECRET)))
          .addMethod(
            getGetSecretDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Workshop.GetSecretDataRequest,
                Workshop.GetSecretDataResponse>(
                  this, METHODID_GET_SECRET_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class WorkshopServiceStub extends io.grpc.stub.AbstractAsyncStub<WorkshopServiceStub> {
    private WorkshopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WorkshopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkshopServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get current time in ISO 8601 format.
     * </pre>
     */
    public void getCurrentTime(Workshop.TimeRequest request,
                               io.grpc.stub.StreamObserver<Workshop.TimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecret(Workshop.GetSecretRequest request,
                          io.grpc.stub.StreamObserver<Workshop.GetSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecretData(Workshop.GetSecretDataRequest request,
                              io.grpc.stub.StreamObserver<Workshop.GetSecretDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WorkshopServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkshopServiceBlockingStub> {
    private WorkshopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WorkshopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkshopServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get current time in ISO 8601 format.
     * </pre>
     */
    public Workshop.TimeResponse getCurrentTime(Workshop.TimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Workshop.GetSecretResponse getSecret(Workshop.GetSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public Workshop.GetSecretDataResponse getSecretData(Workshop.GetSecretDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WorkshopServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WorkshopServiceFutureStub> {
    private WorkshopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WorkshopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkshopServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get current time in ISO 8601 format.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Workshop.TimeResponse> getCurrentTime(
        Workshop.TimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Workshop.GetSecretResponse> getSecret(
        Workshop.GetSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Workshop.GetSecretDataResponse> getSecretData(
        Workshop.GetSecretDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_TIME = 0;
  private static final int METHODID_GET_SECRET = 1;
  private static final int METHODID_GET_SECRET_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkshopServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkshopServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_TIME:
          serviceImpl.getCurrentTime((Workshop.TimeRequest) request,
              (io.grpc.stub.StreamObserver<Workshop.TimeResponse>) responseObserver);
          break;
        case METHODID_GET_SECRET:
          serviceImpl.getSecret((Workshop.GetSecretRequest) request,
              (io.grpc.stub.StreamObserver<Workshop.GetSecretResponse>) responseObserver);
          break;
        case METHODID_GET_SECRET_DATA:
          serviceImpl.getSecretData((Workshop.GetSecretDataRequest) request,
              (io.grpc.stub.StreamObserver<Workshop.GetSecretDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WorkshopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkshopServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Workshop.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkshopService");
    }
  }

  private static final class WorkshopServiceFileDescriptorSupplier
      extends WorkshopServiceBaseDescriptorSupplier {
    WorkshopServiceFileDescriptorSupplier() {}
  }

  private static final class WorkshopServiceMethodDescriptorSupplier
      extends WorkshopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkshopServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WorkshopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkshopServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentTimeMethod())
              .addMethod(getGetSecretMethod())
              .addMethod(getGetSecretDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
