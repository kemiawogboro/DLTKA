package grpc.examples.smartsurvey;
import java.util.Random;
import java.util.concurrent.TimeUnit;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

// client class created
public class SmartSurveyMonClient{
	//local variable created forthe logger
	
	
	private static MonitorGrpc.MonitorBlockingStub blockingStub;
	private static MonitorGrpc.MonitorStub asyncStub;
	
	public static void main(String []args)throws Exception{
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
		
		//stubs-- generate from proto
		blockingStub = MonitorGrpc.newBlockingStub(channel);
		asyncStub = MonitorGrpc.newStub(channel);
		
		activity();
		
		
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		
	}

//bidirectional streaming
public static void activity() {


	StreamObserver<monitorResponse> responseObserver = new StreamObserver<monitorResponse>() {

		@Override
		public void onNext(monitorResponse value) {

			System.out.println("The activity details : A, B , C: "   + value.getVal());

		}

		@Override
		public void onError(Throwable t) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onCompleted() {
			// TODO Auto-generated method stub
			System.out.println("server completed");
		}



	};
	StreamObserver<monitorRequest> requestObserver = asyncStub.activity(responseObserver);
	try {
		requestObserver.onNext(monitorRequest.newBuilder().setMovement(20) .setImages(20) .setVoices("loud").build());
		
		
		System.out.println("Location Activity Details report: A = Nos of Visitors: B = Faces Detected: C= Noise Level:  ");
		requestObserver.onCompleted();
		Thread.sleep(new Random().nextInt(1000)+500);
		
	}
	catch(RuntimeException e) {
		e.printStackTrace();
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}}