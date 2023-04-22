package grpc.examples.smartsurvey;

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
    comments = "Source: smartsurvey.proto")
public final class CheckinGrpc {

  private CheckinGrpc() {}

  public static final String SERVICE_NAME = "smartsurvey.Checkin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.examples.smartsurvey.loginRequest,
      grpc.examples.smartsurvey.loginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = grpc.examples.smartsurvey.loginRequest.class,
      responseType = grpc.examples.smartsurvey.loginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.examples.smartsurvey.loginRequest,
      grpc.examples.smartsurvey.loginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<grpc.examples.smartsurvey.loginRequest, grpc.examples.smartsurvey.loginResponse> getLoginMethod;
    if ((getLoginMethod = CheckinGrpc.getLoginMethod) == null) {
      synchronized (CheckinGrpc.class) {
        if ((getLoginMethod = CheckinGrpc.getLoginMethod) == null) {
          CheckinGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.smartsurvey.loginRequest, grpc.examples.smartsurvey.loginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartsurvey.Checkin", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.smartsurvey.loginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.smartsurvey.loginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckinMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckinStub newStub(io.grpc.Channel channel) {
    return new CheckinStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckinBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CheckinBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckinFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CheckinFutureStub(channel);
  }

  /**
   */
  public static abstract class CheckinImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(grpc.examples.smartsurvey.loginRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.loginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.examples.smartsurvey.loginRequest,
                grpc.examples.smartsurvey.loginResponse>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class CheckinStub extends io.grpc.stub.AbstractStub<CheckinStub> {
    private CheckinStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckinStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckinStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckinStub(channel, callOptions);
    }

    /**
     */
    public void login(grpc.examples.smartsurvey.loginRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.loginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CheckinBlockingStub extends io.grpc.stub.AbstractStub<CheckinBlockingStub> {
    private CheckinBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckinBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckinBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckinBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.examples.smartsurvey.loginResponse login(grpc.examples.smartsurvey.loginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CheckinFutureStub extends io.grpc.stub.AbstractStub<CheckinFutureStub> {
    private CheckinFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckinFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckinFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckinFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.examples.smartsurvey.loginResponse> login(
        grpc.examples.smartsurvey.loginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckinImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckinImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((grpc.examples.smartsurvey.loginRequest) request,
              (io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.loginResponse>) responseObserver);
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

  private static abstract class CheckinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckinBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.examples.smartsurvey.SmartSurveyServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Checkin");
    }
  }

  private static final class CheckinFileDescriptorSupplier
      extends CheckinBaseDescriptorSupplier {
    CheckinFileDescriptorSupplier() {}
  }

  private static final class CheckinMethodDescriptorSupplier
      extends CheckinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckinMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckinGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckinFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
