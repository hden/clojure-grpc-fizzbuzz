package clojure_grpc_fizzbuzz.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: fizzbuzz.proto")
public final class FizzBuzzGrpc {

  private FizzBuzzGrpc() {}

  public static final String SERVICE_NAME = "clojure_grpc_fizzbuzz.FizzBuzz";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<clojure_grpc_fizzbuzz.grpc.MessageTypes.Request,
      clojure_grpc_fizzbuzz.grpc.MessageTypes.Response> METHOD_FIZZ_BUZZ =
      io.grpc.MethodDescriptor.<clojure_grpc_fizzbuzz.grpc.MessageTypes.Request, clojure_grpc_fizzbuzz.grpc.MessageTypes.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "clojure_grpc_fizzbuzz.FizzBuzz", "FizzBuzz"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              clojure_grpc_fizzbuzz.grpc.MessageTypes.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              clojure_grpc_fizzbuzz.grpc.MessageTypes.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FizzBuzzStub newStub(io.grpc.Channel channel) {
    return new FizzBuzzStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FizzBuzzBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FizzBuzzBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FizzBuzzFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FizzBuzzFutureStub(channel);
  }

  /**
   */
  public static abstract class FizzBuzzImplBase implements io.grpc.BindableService {

    /**
     */
    public void fizzBuzz(clojure_grpc_fizzbuzz.grpc.MessageTypes.Request request,
        io.grpc.stub.StreamObserver<clojure_grpc_fizzbuzz.grpc.MessageTypes.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIZZ_BUZZ, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIZZ_BUZZ,
            asyncUnaryCall(
              new MethodHandlers<
                clojure_grpc_fizzbuzz.grpc.MessageTypes.Request,
                clojure_grpc_fizzbuzz.grpc.MessageTypes.Response>(
                  this, METHODID_FIZZ_BUZZ)))
          .build();
    }
  }

  /**
   */
  public static final class FizzBuzzStub extends io.grpc.stub.AbstractStub<FizzBuzzStub> {
    private FizzBuzzStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FizzBuzzStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FizzBuzzStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FizzBuzzStub(channel, callOptions);
    }

    /**
     */
    public void fizzBuzz(clojure_grpc_fizzbuzz.grpc.MessageTypes.Request request,
        io.grpc.stub.StreamObserver<clojure_grpc_fizzbuzz.grpc.MessageTypes.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIZZ_BUZZ, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FizzBuzzBlockingStub extends io.grpc.stub.AbstractStub<FizzBuzzBlockingStub> {
    private FizzBuzzBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FizzBuzzBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FizzBuzzBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FizzBuzzBlockingStub(channel, callOptions);
    }

    /**
     */
    public clojure_grpc_fizzbuzz.grpc.MessageTypes.Response fizzBuzz(clojure_grpc_fizzbuzz.grpc.MessageTypes.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIZZ_BUZZ, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FizzBuzzFutureStub extends io.grpc.stub.AbstractStub<FizzBuzzFutureStub> {
    private FizzBuzzFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FizzBuzzFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FizzBuzzFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FizzBuzzFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clojure_grpc_fizzbuzz.grpc.MessageTypes.Response> fizzBuzz(
        clojure_grpc_fizzbuzz.grpc.MessageTypes.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIZZ_BUZZ, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIZZ_BUZZ = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FizzBuzzImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FizzBuzzImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIZZ_BUZZ:
          serviceImpl.fizzBuzz((clojure_grpc_fizzbuzz.grpc.MessageTypes.Request) request,
              (io.grpc.stub.StreamObserver<clojure_grpc_fizzbuzz.grpc.MessageTypes.Response>) responseObserver);
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

  private static final class FizzBuzzDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return clojure_grpc_fizzbuzz.grpc.MessageTypes.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FizzBuzzGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FizzBuzzDescriptorSupplier())
              .addMethod(METHOD_FIZZ_BUZZ)
              .build();
        }
      }
    }
    return result;
  }
}
