package bw.project.smartfarming;

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
    comments = "Source: agriculture.proto")
public final class SmartAutoSystemGrpc {

  private SmartAutoSystemGrpc() {}

  public static final String SERVICE_NAME = "smart_farm.SmartAutoSystem";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bw.project.smartfarming.TractorRequest,
      bw.project.smartfarming.TractorReply> getTractorSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tractorSensor",
      requestType = bw.project.smartfarming.TractorRequest.class,
      responseType = bw.project.smartfarming.TractorReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bw.project.smartfarming.TractorRequest,
      bw.project.smartfarming.TractorReply> getTractorSensorMethod() {
    io.grpc.MethodDescriptor<bw.project.smartfarming.TractorRequest, bw.project.smartfarming.TractorReply> getTractorSensorMethod;
    if ((getTractorSensorMethod = SmartAutoSystemGrpc.getTractorSensorMethod) == null) {
      synchronized (SmartAutoSystemGrpc.class) {
        if ((getTractorSensorMethod = SmartAutoSystemGrpc.getTractorSensorMethod) == null) {
          SmartAutoSystemGrpc.getTractorSensorMethod = getTractorSensorMethod = 
              io.grpc.MethodDescriptor.<bw.project.smartfarming.TractorRequest, bw.project.smartfarming.TractorReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_farm.SmartAutoSystem", "tractorSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bw.project.smartfarming.TractorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bw.project.smartfarming.TractorReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartAutoSystemMethodDescriptorSupplier("tractorSensor"))
                  .build();
          }
        }
     }
     return getTractorSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bw.project.smartfarming.IrrigationRequest,
      bw.project.smartfarming.IrrigationReply> getIrrigationSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "irrigationSensor",
      requestType = bw.project.smartfarming.IrrigationRequest.class,
      responseType = bw.project.smartfarming.IrrigationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bw.project.smartfarming.IrrigationRequest,
      bw.project.smartfarming.IrrigationReply> getIrrigationSensorMethod() {
    io.grpc.MethodDescriptor<bw.project.smartfarming.IrrigationRequest, bw.project.smartfarming.IrrigationReply> getIrrigationSensorMethod;
    if ((getIrrigationSensorMethod = SmartAutoSystemGrpc.getIrrigationSensorMethod) == null) {
      synchronized (SmartAutoSystemGrpc.class) {
        if ((getIrrigationSensorMethod = SmartAutoSystemGrpc.getIrrigationSensorMethod) == null) {
          SmartAutoSystemGrpc.getIrrigationSensorMethod = getIrrigationSensorMethod = 
              io.grpc.MethodDescriptor.<bw.project.smartfarming.IrrigationRequest, bw.project.smartfarming.IrrigationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_farm.SmartAutoSystem", "irrigationSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bw.project.smartfarming.IrrigationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bw.project.smartfarming.IrrigationReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartAutoSystemMethodDescriptorSupplier("irrigationSensor"))
                  .build();
          }
        }
     }
     return getIrrigationSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bw.project.smartfarming.LivestockRequest,
      bw.project.smartfarming.LivestockReply> getLivestockSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "livestockSensor",
      requestType = bw.project.smartfarming.LivestockRequest.class,
      responseType = bw.project.smartfarming.LivestockReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bw.project.smartfarming.LivestockRequest,
      bw.project.smartfarming.LivestockReply> getLivestockSensorMethod() {
    io.grpc.MethodDescriptor<bw.project.smartfarming.LivestockRequest, bw.project.smartfarming.LivestockReply> getLivestockSensorMethod;
    if ((getLivestockSensorMethod = SmartAutoSystemGrpc.getLivestockSensorMethod) == null) {
      synchronized (SmartAutoSystemGrpc.class) {
        if ((getLivestockSensorMethod = SmartAutoSystemGrpc.getLivestockSensorMethod) == null) {
          SmartAutoSystemGrpc.getLivestockSensorMethod = getLivestockSensorMethod = 
              io.grpc.MethodDescriptor.<bw.project.smartfarming.LivestockRequest, bw.project.smartfarming.LivestockReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smart_farm.SmartAutoSystem", "livestockSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bw.project.smartfarming.LivestockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bw.project.smartfarming.LivestockReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartAutoSystemMethodDescriptorSupplier("livestockSensor"))
                  .build();
          }
        }
     }
     return getLivestockSensorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartAutoSystemStub newStub(io.grpc.Channel channel) {
    return new SmartAutoSystemStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartAutoSystemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartAutoSystemBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartAutoSystemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartAutoSystemFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartAutoSystemImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *-----------------------------Service 1------------------------------
     * </pre>
     */
    public void tractorSensor(bw.project.smartfarming.TractorRequest request,
        io.grpc.stub.StreamObserver<bw.project.smartfarming.TractorReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTractorSensorMethod(), responseObserver);
    }

    /**
     * <pre>
     *-----------------------------Service 2------------------------------
     * </pre>
     */
    public void irrigationSensor(bw.project.smartfarming.IrrigationRequest request,
        io.grpc.stub.StreamObserver<bw.project.smartfarming.IrrigationReply> responseObserver) {
      asyncUnimplementedUnaryCall(getIrrigationSensorMethod(), responseObserver);
    }

    /**
     * <pre>
     *-----------------------------Service 3------------------------------
     * </pre>
     */
    public void livestockSensor(bw.project.smartfarming.LivestockRequest request,
        io.grpc.stub.StreamObserver<bw.project.smartfarming.LivestockReply> responseObserver) {
      asyncUnimplementedUnaryCall(getLivestockSensorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTractorSensorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bw.project.smartfarming.TractorRequest,
                bw.project.smartfarming.TractorReply>(
                  this, METHODID_TRACTOR_SENSOR)))
          .addMethod(
            getIrrigationSensorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bw.project.smartfarming.IrrigationRequest,
                bw.project.smartfarming.IrrigationReply>(
                  this, METHODID_IRRIGATION_SENSOR)))
          .addMethod(
            getLivestockSensorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bw.project.smartfarming.LivestockRequest,
                bw.project.smartfarming.LivestockReply>(
                  this, METHODID_LIVESTOCK_SENSOR)))
          .build();
    }
  }

  /**
   */
  public static final class SmartAutoSystemStub extends io.grpc.stub.AbstractStub<SmartAutoSystemStub> {
    private SmartAutoSystemStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartAutoSystemStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartAutoSystemStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartAutoSystemStub(channel, callOptions);
    }

    /**
     * <pre>
     *-----------------------------Service 1------------------------------
     * </pre>
     */
    public void tractorSensor(bw.project.smartfarming.TractorRequest request,
        io.grpc.stub.StreamObserver<bw.project.smartfarming.TractorReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTractorSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *-----------------------------Service 2------------------------------
     * </pre>
     */
    public void irrigationSensor(bw.project.smartfarming.IrrigationRequest request,
        io.grpc.stub.StreamObserver<bw.project.smartfarming.IrrigationReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIrrigationSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *-----------------------------Service 3------------------------------
     * </pre>
     */
    public void livestockSensor(bw.project.smartfarming.LivestockRequest request,
        io.grpc.stub.StreamObserver<bw.project.smartfarming.LivestockReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLivestockSensorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartAutoSystemBlockingStub extends io.grpc.stub.AbstractStub<SmartAutoSystemBlockingStub> {
    private SmartAutoSystemBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartAutoSystemBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartAutoSystemBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartAutoSystemBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *-----------------------------Service 1------------------------------
     * </pre>
     */
    public bw.project.smartfarming.TractorReply tractorSensor(bw.project.smartfarming.TractorRequest request) {
      return blockingUnaryCall(
          getChannel(), getTractorSensorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *-----------------------------Service 2------------------------------
     * </pre>
     */
    public bw.project.smartfarming.IrrigationReply irrigationSensor(bw.project.smartfarming.IrrigationRequest request) {
      return blockingUnaryCall(
          getChannel(), getIrrigationSensorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *-----------------------------Service 3------------------------------
     * </pre>
     */
    public bw.project.smartfarming.LivestockReply livestockSensor(bw.project.smartfarming.LivestockRequest request) {
      return blockingUnaryCall(
          getChannel(), getLivestockSensorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartAutoSystemFutureStub extends io.grpc.stub.AbstractStub<SmartAutoSystemFutureStub> {
    private SmartAutoSystemFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartAutoSystemFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartAutoSystemFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartAutoSystemFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *-----------------------------Service 1------------------------------
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bw.project.smartfarming.TractorReply> tractorSensor(
        bw.project.smartfarming.TractorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTractorSensorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *-----------------------------Service 2------------------------------
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bw.project.smartfarming.IrrigationReply> irrigationSensor(
        bw.project.smartfarming.IrrigationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIrrigationSensorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *-----------------------------Service 3------------------------------
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bw.project.smartfarming.LivestockReply> livestockSensor(
        bw.project.smartfarming.LivestockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLivestockSensorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRACTOR_SENSOR = 0;
  private static final int METHODID_IRRIGATION_SENSOR = 1;
  private static final int METHODID_LIVESTOCK_SENSOR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartAutoSystemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartAutoSystemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRACTOR_SENSOR:
          serviceImpl.tractorSensor((bw.project.smartfarming.TractorRequest) request,
              (io.grpc.stub.StreamObserver<bw.project.smartfarming.TractorReply>) responseObserver);
          break;
        case METHODID_IRRIGATION_SENSOR:
          serviceImpl.irrigationSensor((bw.project.smartfarming.IrrigationRequest) request,
              (io.grpc.stub.StreamObserver<bw.project.smartfarming.IrrigationReply>) responseObserver);
          break;
        case METHODID_LIVESTOCK_SENSOR:
          serviceImpl.livestockSensor((bw.project.smartfarming.LivestockRequest) request,
              (io.grpc.stub.StreamObserver<bw.project.smartfarming.LivestockReply>) responseObserver);
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

  private static abstract class SmartAutoSystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartAutoSystemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bw.project.smartfarming.BW_SmartFarmingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartAutoSystem");
    }
  }

  private static final class SmartAutoSystemFileDescriptorSupplier
      extends SmartAutoSystemBaseDescriptorSupplier {
    SmartAutoSystemFileDescriptorSupplier() {}
  }

  private static final class SmartAutoSystemMethodDescriptorSupplier
      extends SmartAutoSystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartAutoSystemMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartAutoSystemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartAutoSystemFileDescriptorSupplier())
              .addMethod(getTractorSensorMethod())
              .addMethod(getIrrigationSensorMethod())
              .addMethod(getLivestockSensorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
