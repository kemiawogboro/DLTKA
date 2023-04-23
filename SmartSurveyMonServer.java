package grpc.examples.smartsurvey;
import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.smartsurvey.MonitorGrpc.MonitorImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartSurveyMonServer extends MonitorGrpc.MonitorImplBase{
	public static final Logger logger =Logger.getLogger(SmartSurveyMonServer.class.getName());
	public static void main(String[]args) {
		SmartSurveyMonServer monitorserver = new SmartSurveyMonServer();
		//building server
		int port =50052;
		// creating server object and initialising it
		try {
			Server server = ServerBuilder.forPort(port)
					.addService(monitorserver)
					.build()
					.start();
			server.awaitTermination();
		}catch(IOException e) {e.printStackTrace();
		}catch(InterruptedException e) {e.printStackTrace();} // To do Auto generated catchblock
		
		logger.info("Server connected, listening" +port);
	}


public StreamObserver<monitorRequest> activity(StreamObserver<monitorResponse> responseObserver) {
	return new StreamObserver<monitorRequest>() {

		@Override
		public void onNext(monitorRequest request) {
				StringBuilder input2 = new StringBuilder(); 
			  
	            input2.append(request.getMovement());
	            input2.append(request.getImages());
	            input2.append(request.getVoices()); 
	            
	        
	            monitorResponse reply = monitorResponse.newBuilder().setVal(input2.toString()).build();
	      
	            responseObserver.onNext(reply);
			
		}

		@Override
		public void onError(Throwable t) {
			// TODO Auto-generated method stubal
			
		}

		@Override
		public void onCompleted() {
			 responseObserver.onCompleted();
			
		}
		
	};
}}
