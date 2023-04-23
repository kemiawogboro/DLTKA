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
 * <pre>
 *smart survey report service definition with client streaming rpc method
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smartsurveyrep.proto")
public final class ReportGrpc {

  private ReportGrpc() {}

  public static final String SERVICE_NAME = "smartsurvey.Report";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.examples.smartsurvey.reportRequest,
      grpc.examples.smartsurvey.reportResponse> getAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alert",
      requestType = grpc.examples.smartsurvey.reportRequest.class,
      responseType = grpc.examples.smartsurvey.reportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.examples.smartsurvey.reportRequest,
      grpc.examples.smartsurvey.reportResponse> getAlertMethod() {
    io.grpc.MethodDescriptor<grpc.examples.smartsurvey.reportRequest, grpc.examples.smartsurvey.reportResponse> getAlertMethod;
    if ((getAlertMethod = ReportGrpc.getAlertMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getAlertMethod = ReportGrpc.getAlertMethod) == null) {
          ReportGrpc.getAlertMethod = getAlertMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.smartsurvey.reportRequest, grpc.examples.smartsurvey.reportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartsurvey.Report", "alert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.smartsurvey.reportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.smartsurvey.reportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportMethodDescriptorSupplier("alert"))
                  .build();
          }
        }
     }
     return getAlertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.examples.smartsurvey.reportRequest,
      grpc.examples.smartsurvey.reportResponse> getAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alarm",
      requestType = grpc.examples.smartsurvey.reportRequest.class,
      responseType = grpc.examples.smartsurvey.reportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.examples.smartsurvey.reportRequest,
      grpc.examples.smartsurvey.reportResponse> getAlarmMethod() {
    io.grpc.MethodDescriptor<grpc.examples.smartsurvey.reportRequest, grpc.examples.smartsurvey.reportResponse> getAlarmMethod;
    if ((getAlarmMethod = ReportGrpc.getAlarmMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getAlarmMethod = ReportGrpc.getAlarmMethod) == null) {
          ReportGrpc.getAlarmMethod = getAlarmMethod = 
              io.grpc.MethodDescriptor.<grpc.examples.smartsurvey.reportRequest, grpc.examples.smartsurvey.reportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartsurvey.Report", "alarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.smartsurvey.reportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.examples.smartsurvey.reportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportMethodDescriptorSupplier("alarm"))
                  .build();
          }
        }
     }
     return getAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportStub newStub(io.grpc.Channel channel) {
    return new ReportStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReportBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReportFutureStub(channel);
  }

  /**
   * <pre>
   *smart survey report service definition with client streaming rpc method
   * </pre>
   */
  public static abstract class ReportImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportRequest> alert(
        io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAlertMethod(), responseObserver);
    }

    /**
     * <pre>
     * smart survey report service definition with server streaming rpc method
     * </pre>
     */
    public void alarm(grpc.examples.smartsurvey.reportRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlertMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.examples.smartsurvey.reportRequest,
                grpc.examples.smartsurvey.reportResponse>(
                  this, METHODID_ALERT)))
          .addMethod(
            getAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.examples.smartsurvey.reportRequest,
                grpc.examples.smartsurvey.reportResponse>(
                  this, METHODID_ALARM)))
          .build();
    }
  }

  /**
   * <pre>
   *smart survey report service definition with client streaming rpc method
   * </pre>
   */
  public static final class ReportStub extends io.grpc.stub.AbstractStub<ReportStub> {
    private ReportStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportRequest> alert(
        io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAlertMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * smart survey report service definition with server streaming rpc method
     * </pre>
     */
    public void alarm(grpc.examples.smartsurvey.reportRequest request,
        io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *smart survey report service definition with client streaming rpc method
   * </pre>
   */
  public static final class ReportBlockingStub extends io.grpc.stub.AbstractStub<ReportBlockingStub> {
    private ReportBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * smart survey report service definition with server streaming rpc method
     * </pre>
     */
    public java.util.Iterator<grpc.examples.smartsurvey.reportResponse> alarm(
        grpc.examples.smartsurvey.reportRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *smart survey report service definition with client streaming rpc method
   * </pre>
   */
  public static final class ReportFutureStub extends io.grpc.stub.AbstractStub<ReportFutureStub> {
    private ReportFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ALARM = 0;
  private static final int METHODID_ALERT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALARM:
          serviceImpl.alarm((grpc.examples.smartsurvey.reportRequest) request,
              (io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportResponse>) responseObserver);
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
        case METHODID_ALERT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.alert(
              (io.grpc.stub.StreamObserver<grpc.examples.smartsurvey.reportResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.examples.smartsurvey.SmartSurveyRepServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Report");
    }
  }

  private static final class ReportFileDescriptorSupplier
      extends ReportBaseDescriptorSupplier {
    ReportFileDescriptorSupplier() {}
  }

  private static final class ReportMethodDescriptorSupplier
      extends ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportFileDescriptorSupplier())
              .addMethod(getAlertMethod())
              .addMethod(getAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
