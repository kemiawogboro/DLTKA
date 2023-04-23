package grpc.examples.smartsurvey;
import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.smartsurvey.MonitorGrpc.MonitorImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartSurveyRepServer extends ReportGrpc.ReportImplBase{
	public static final Logger logger =Logger.getLogger(SmartSurveyRepServer.class.getName());
	public static void main(String[]args) {
		SmartSurveyRepServer reportserver = new SmartSurveyRepServer();
		//building server
		int port =50053;
		// creating server object and initialising it
		try {
			Server server = ServerBuilder.forPort(port)
					.addService(reportserver)
					.build()
					.start();
			server.awaitTermination();
		}catch(IOException e) {e.printStackTrace();
		}catch(InterruptedException e) {e.printStackTrace();} // To do Auto generated catchblock
		
		logger.info("Server connected, listening" +port);
	}
	public StreamObserver<reportRequest> alert(StreamObserver<reportResponse> responseObserver) {
		return new StreamObserver<reportRequest>() {
			
			StringBuilder notices = new StringBuilder();  
			public void onNext(reportRequest value) {
				System.out.println("Receiving Alert Message");
				notices.append(value.getNoise());
				notices.append(value.getMotion());
			 
			} 
			@Override
			public void onError(Throwable t) {
			// TODO Auto-generated method stubal
			}
			@Override
			public void onCompleted() {
			String notice = "Be Alert Unsual Activity detected";
			reportResponse inform = reportResponse.newBuilder().setNotice(notice).build();
			responseObserver.onNext(inform);
			responseObserver.onCompleted();
			}
			};
			}public void alarm(reportRequest request, StreamObserver<reportResponse> responseObserver) {
				System.out.println("Receiving Alarm Message");
				
			reportResponse  siren = reportResponse.newBuilder()
							.setNotice("Alarm Siren blowing:" ).build();
							
					responseObserver.onNext(siren);
					responseObserver.onCompleted();
				}
}
			
	

