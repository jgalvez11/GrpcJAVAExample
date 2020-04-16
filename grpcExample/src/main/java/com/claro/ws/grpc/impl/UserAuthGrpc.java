package com.claro.ws.grpc.impl;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: grpcExample.proto")
public final class UserAuthGrpc {

  private UserAuthGrpc() {}

  public static final String SERVICE_NAME = "UserAuth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.claro.ws.grpc.impl.GrpcExample.LoginRequest,
      com.claro.ws.grpc.impl.GrpcExample.ApiResponse> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogIn",
      requestType = com.claro.ws.grpc.impl.GrpcExample.LoginRequest.class,
      responseType = com.claro.ws.grpc.impl.GrpcExample.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.claro.ws.grpc.impl.GrpcExample.LoginRequest,
      com.claro.ws.grpc.impl.GrpcExample.ApiResponse> getLogInMethod() {
    io.grpc.MethodDescriptor<com.claro.ws.grpc.impl.GrpcExample.LoginRequest, com.claro.ws.grpc.impl.GrpcExample.ApiResponse> getLogInMethod;
    if ((getLogInMethod = UserAuthGrpc.getLogInMethod) == null) {
      synchronized (UserAuthGrpc.class) {
        if ((getLogInMethod = UserAuthGrpc.getLogInMethod) == null) {
          UserAuthGrpc.getLogInMethod = getLogInMethod =
              io.grpc.MethodDescriptor.<com.claro.ws.grpc.impl.GrpcExample.LoginRequest, com.claro.ws.grpc.impl.GrpcExample.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.claro.ws.grpc.impl.GrpcExample.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.claro.ws.grpc.impl.GrpcExample.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAuthMethodDescriptorSupplier("LogIn"))
              .build();
        }
      }
    }
    return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.claro.ws.grpc.impl.GrpcExample.Empty,
      com.claro.ws.grpc.impl.GrpcExample.ApiResponse> getLogOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogOut",
      requestType = com.claro.ws.grpc.impl.GrpcExample.Empty.class,
      responseType = com.claro.ws.grpc.impl.GrpcExample.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.claro.ws.grpc.impl.GrpcExample.Empty,
      com.claro.ws.grpc.impl.GrpcExample.ApiResponse> getLogOutMethod() {
    io.grpc.MethodDescriptor<com.claro.ws.grpc.impl.GrpcExample.Empty, com.claro.ws.grpc.impl.GrpcExample.ApiResponse> getLogOutMethod;
    if ((getLogOutMethod = UserAuthGrpc.getLogOutMethod) == null) {
      synchronized (UserAuthGrpc.class) {
        if ((getLogOutMethod = UserAuthGrpc.getLogOutMethod) == null) {
          UserAuthGrpc.getLogOutMethod = getLogOutMethod =
              io.grpc.MethodDescriptor.<com.claro.ws.grpc.impl.GrpcExample.Empty, com.claro.ws.grpc.impl.GrpcExample.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.claro.ws.grpc.impl.GrpcExample.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.claro.ws.grpc.impl.GrpcExample.ApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAuthMethodDescriptorSupplier("LogOut"))
              .build();
        }
      }
    }
    return getLogOutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAuthStub>() {
        @java.lang.Override
        public UserAuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAuthStub(channel, callOptions);
        }
      };
    return UserAuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAuthBlockingStub>() {
        @java.lang.Override
        public UserAuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAuthBlockingStub(channel, callOptions);
        }
      };
    return UserAuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAuthFutureStub>() {
        @java.lang.Override
        public UserAuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAuthFutureStub(channel, callOptions);
        }
      };
    return UserAuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserAuthImplBase implements io.grpc.BindableService {

    /**
     */
    public void logIn(com.claro.ws.grpc.impl.GrpcExample.LoginRequest request,
        io.grpc.stub.StreamObserver<com.claro.ws.grpc.impl.GrpcExample.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     */
    public void logOut(com.claro.ws.grpc.impl.GrpcExample.Empty request,
        io.grpc.stub.StreamObserver<com.claro.ws.grpc.impl.GrpcExample.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogOutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.claro.ws.grpc.impl.GrpcExample.LoginRequest,
                com.claro.ws.grpc.impl.GrpcExample.ApiResponse>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getLogOutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.claro.ws.grpc.impl.GrpcExample.Empty,
                com.claro.ws.grpc.impl.GrpcExample.ApiResponse>(
                  this, METHODID_LOG_OUT)))
          .build();
    }
  }

  /**
   */
  public static final class UserAuthStub extends io.grpc.stub.AbstractAsyncStub<UserAuthStub> {
    private UserAuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAuthStub(channel, callOptions);
    }

    /**
     */
    public void logIn(com.claro.ws.grpc.impl.GrpcExample.LoginRequest request,
        io.grpc.stub.StreamObserver<com.claro.ws.grpc.impl.GrpcExample.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logOut(com.claro.ws.grpc.impl.GrpcExample.Empty request,
        io.grpc.stub.StreamObserver<com.claro.ws.grpc.impl.GrpcExample.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserAuthBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserAuthBlockingStub> {
    private UserAuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.claro.ws.grpc.impl.GrpcExample.ApiResponse logIn(com.claro.ws.grpc.impl.GrpcExample.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.claro.ws.grpc.impl.GrpcExample.ApiResponse logOut(com.claro.ws.grpc.impl.GrpcExample.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogOutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAuthFutureStub extends io.grpc.stub.AbstractFutureStub<UserAuthFutureStub> {
    private UserAuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.claro.ws.grpc.impl.GrpcExample.ApiResponse> logIn(
        com.claro.ws.grpc.impl.GrpcExample.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.claro.ws.grpc.impl.GrpcExample.ApiResponse> logOut(
        com.claro.ws.grpc.impl.GrpcExample.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_IN = 0;
  private static final int METHODID_LOG_OUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG_IN:
          serviceImpl.logIn((com.claro.ws.grpc.impl.GrpcExample.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.claro.ws.grpc.impl.GrpcExample.ApiResponse>) responseObserver);
          break;
        case METHODID_LOG_OUT:
          serviceImpl.logOut((com.claro.ws.grpc.impl.GrpcExample.Empty) request,
              (io.grpc.stub.StreamObserver<com.claro.ws.grpc.impl.GrpcExample.ApiResponse>) responseObserver);
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

  private static abstract class UserAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.claro.ws.grpc.impl.GrpcExample.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAuth");
    }
  }

  private static final class UserAuthFileDescriptorSupplier
      extends UserAuthBaseDescriptorSupplier {
    UserAuthFileDescriptorSupplier() {}
  }

  private static final class UserAuthMethodDescriptorSupplier
      extends UserAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAuthFileDescriptorSupplier())
              .addMethod(getLogInMethod())
              .addMethod(getLogOutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
