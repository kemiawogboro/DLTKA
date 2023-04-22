package grpc.examples.smartsurvey;
import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.smartsurvey.CheckinGrpc.CheckinImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartSurveyServer extends CheckinImplBase{
	public static final Logger logger =Logger.getLogger(SmartSurveyServer.class.getName());
	public static void main(String[]args) {
		SmartSurveyServer checkinserver = new SmartSurveyServer();
		int port =50051;
		try {
			Server server = ServerBuilder.forPort(port)
					.addService(checkinserver)
					.build()
					.start();
			server.awaitTermination();
		}catch(IOException e) {e.printStackTrace();
		}catch(InterruptedException e) {e.printStackTrace();} // To do Auto generated catchblock
		
		logger.info("Server connected, listening" +port);
	}
	@Override
	public void login(loginRequest request, StreamObserver<loginResponse>responseObserver) {
		System.out.println("Login Request received");
		loginResponse reply =loginResponse.newBuilder().setMessage("SmartSurvey login sucess Welcome " +request.getName()).build();
	    responseObserver.onNext(reply);
	    responseObserver.onCompleted();
	}
}