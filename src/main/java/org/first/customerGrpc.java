package org.first;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class customerGrpc {

  private customerGrpc() {}

  public static final String SERVICE_NAME = "customer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.first.User.LoginRequest,
      org.first.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = org.first.User.LoginRequest.class,
      responseType = org.first.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.first.User.LoginRequest,
      org.first.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<org.first.User.LoginRequest, org.first.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = customerGrpc.getLoginMethod) == null) {
      synchronized (customerGrpc.class) {
        if ((getLoginMethod = customerGrpc.getLoginMethod) == null) {
          customerGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<org.first.User.LoginRequest, org.first.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.first.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.first.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new customerMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.first.User.Empty,
      org.first.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = org.first.User.Empty.class,
      responseType = org.first.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.first.User.Empty,
      org.first.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<org.first.User.Empty, org.first.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = customerGrpc.getLogoutMethod) == null) {
      synchronized (customerGrpc.class) {
        if ((getLogoutMethod = customerGrpc.getLogoutMethod) == null) {
          customerGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<org.first.User.Empty, org.first.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.first.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.first.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new customerMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static customerStub newStub(io.grpc.Channel channel) {
    return new customerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static customerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new customerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static customerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new customerFutureStub(channel);
  }

  /**
   */
  public static abstract class customerImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(org.first.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.first.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(org.first.User.Empty request,
        io.grpc.stub.StreamObserver<org.first.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.first.User.LoginRequest,
                org.first.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.first.User.Empty,
                org.first.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class customerStub extends io.grpc.stub.AbstractStub<customerStub> {
    private customerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private customerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected customerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new customerStub(channel, callOptions);
    }

    /**
     */
    public void login(org.first.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.first.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(org.first.User.Empty request,
        io.grpc.stub.StreamObserver<org.first.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class customerBlockingStub extends io.grpc.stub.AbstractStub<customerBlockingStub> {
    private customerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private customerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected customerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new customerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.first.User.APIResponse login(org.first.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.first.User.APIResponse logout(org.first.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class customerFutureStub extends io.grpc.stub.AbstractStub<customerFutureStub> {
    private customerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private customerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected customerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new customerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.first.User.APIResponse> login(
        org.first.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.first.User.APIResponse> logout(
        org.first.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final customerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(customerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((org.first.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.first.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((org.first.User.Empty) request,
              (io.grpc.stub.StreamObserver<org.first.User.APIResponse>) responseObserver);
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

  private static abstract class customerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    customerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.first.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("customer");
    }
  }

  private static final class customerFileDescriptorSupplier
      extends customerBaseDescriptorSupplier {
    customerFileDescriptorSupplier() {}
  }

  private static final class customerMethodDescriptorSupplier
      extends customerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    customerMethodDescriptorSupplier(String methodName) {
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
      synchronized (customerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new customerFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
