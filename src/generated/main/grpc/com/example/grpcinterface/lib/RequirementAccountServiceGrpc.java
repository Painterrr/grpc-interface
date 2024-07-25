package com.example.grpcinterface.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: grpcinterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RequirementAccountServiceGrpc {

  private RequirementAccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RequirementAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpcinterface.lib.AccountIdReq,
      com.example.grpcinterface.lib.PhoneResp> getGetPhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPhone",
      requestType = com.example.grpcinterface.lib.AccountIdReq.class,
      responseType = com.example.grpcinterface.lib.PhoneResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpcinterface.lib.AccountIdReq,
      com.example.grpcinterface.lib.PhoneResp> getGetPhoneMethod() {
    io.grpc.MethodDescriptor<com.example.grpcinterface.lib.AccountIdReq, com.example.grpcinterface.lib.PhoneResp> getGetPhoneMethod;
    if ((getGetPhoneMethod = RequirementAccountServiceGrpc.getGetPhoneMethod) == null) {
      synchronized (RequirementAccountServiceGrpc.class) {
        if ((getGetPhoneMethod = RequirementAccountServiceGrpc.getGetPhoneMethod) == null) {
          RequirementAccountServiceGrpc.getGetPhoneMethod = getGetPhoneMethod =
              io.grpc.MethodDescriptor.<com.example.grpcinterface.lib.AccountIdReq, com.example.grpcinterface.lib.PhoneResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcinterface.lib.AccountIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcinterface.lib.PhoneResp.getDefaultInstance()))
              .setSchemaDescriptor(new RequirementAccountServiceMethodDescriptorSupplier("getPhone"))
              .build();
        }
      }
    }
    return getGetPhoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RequirementAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequirementAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequirementAccountServiceStub>() {
        @java.lang.Override
        public RequirementAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequirementAccountServiceStub(channel, callOptions);
        }
      };
    return RequirementAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RequirementAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequirementAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequirementAccountServiceBlockingStub>() {
        @java.lang.Override
        public RequirementAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequirementAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return RequirementAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RequirementAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RequirementAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RequirementAccountServiceFutureStub>() {
        @java.lang.Override
        public RequirementAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RequirementAccountServiceFutureStub(channel, callOptions);
        }
      };
    return RequirementAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPhone(com.example.grpcinterface.lib.AccountIdReq request,
        io.grpc.stub.StreamObserver<com.example.grpcinterface.lib.PhoneResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhoneMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RequirementAccountService.
   */
  public static abstract class RequirementAccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RequirementAccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RequirementAccountService.
   */
  public static final class RequirementAccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RequirementAccountServiceStub> {
    private RequirementAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequirementAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequirementAccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPhone(com.example.grpcinterface.lib.AccountIdReq request,
        io.grpc.stub.StreamObserver<com.example.grpcinterface.lib.PhoneResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPhoneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RequirementAccountService.
   */
  public static final class RequirementAccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RequirementAccountServiceBlockingStub> {
    private RequirementAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequirementAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequirementAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpcinterface.lib.PhoneResp getPhone(com.example.grpcinterface.lib.AccountIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPhoneMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RequirementAccountService.
   */
  public static final class RequirementAccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RequirementAccountServiceFutureStub> {
    private RequirementAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RequirementAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RequirementAccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpcinterface.lib.PhoneResp> getPhone(
        com.example.grpcinterface.lib.AccountIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPhoneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PHONE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PHONE:
          serviceImpl.getPhone((com.example.grpcinterface.lib.AccountIdReq) request,
              (io.grpc.stub.StreamObserver<com.example.grpcinterface.lib.PhoneResp>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetPhoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpcinterface.lib.AccountIdReq,
              com.example.grpcinterface.lib.PhoneResp>(
                service, METHODID_GET_PHONE)))
        .build();
  }

  private static abstract class RequirementAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RequirementAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpcinterface.lib.interfaceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RequirementAccountService");
    }
  }

  private static final class RequirementAccountServiceFileDescriptorSupplier
      extends RequirementAccountServiceBaseDescriptorSupplier {
    RequirementAccountServiceFileDescriptorSupplier() {}
  }

  private static final class RequirementAccountServiceMethodDescriptorSupplier
      extends RequirementAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RequirementAccountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RequirementAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RequirementAccountServiceFileDescriptorSupplier())
              .addMethod(getGetPhoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
