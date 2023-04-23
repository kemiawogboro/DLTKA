package grpc.examples.smartsurvey;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

// client class created
public class SmartSurveyRepClient{
	//local variable created forthe logger
	
	
	private static ReportGrpc.ReportBlockingStub blockingStub;
	private static ReportGrpc.ReportStub asyncStub;
	
	public static void main(String []args)throws Exception{
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		
		//stubs-- generate from proto
		blockingStub = ReportGrpc.newBlockingStub(channel);
		asyncStub = ReportGrpc.newStub(channel);
		
		//calling the method for client streaming rpc
		alert();
		//calling the method for server streamimg rpc
		alarm();
		
		
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		
	}

	//client streaming
	public static void alert() {


		StreamObserver<reportResponse> responseObserver = new StreamObserver<reportResponse>() {

			@Override
			public void onNext(reportResponse value) {

				System.out.println("TUnsual Activity Detected: "   + value.getNotice());

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
		StreamObserver<reportRequest> requestObserver = asyncStub.alert(responseObserver);
		try {
			requestObserver.onNext(reportRequest.newBuilder().setMotion("High  frequent movement"
					
					).setNoise("loud Noise detected").build());
			
			
			System.out.println("Reporting Unusual Activity: Be at alert ");
			requestObserver.onCompleted();
			Thread.sleep(new Random().nextInt(1000)+500);
			
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void alarm() {
		reportRequest request = reportRequest.newBuilder().setNoise("Very Loud Noise Detected").setMotion("Extremely Frequent Movement Detected").build();
		try { 
			Iterator<reportResponse> report = blockingStub.alarm(request);
			while (report.hasNext()) {
				reportResponse temp = report.next();
				System.out.println(temp.getNotice());
				
			}
			}
			catch(StatusRuntimeException e) { e.printStackTrace();}
		}
		
	}

