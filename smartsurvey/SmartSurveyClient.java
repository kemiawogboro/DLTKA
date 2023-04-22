package grpc.examples.smartsurvey;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import grpc.examples.smartsurvey.CheckinGrpc.CheckinBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


public class SmartSurveyClient{
	private static final Logger logger = Logger.getLogger(SmartSurveyClient.class.getName());
	public static void main (String [] args)throws Exception{
		String host ="localhost";
		int port = 50051;
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		CheckinBlockingStub blockingstub = CheckinGrpc.newBlockingStub(channel);
		SmartSurveyClient client = new SmartSurveyClient();
		
		try {
			String name ="James";
			loginRequest request = loginRequest.newBuilder().setName(name).build();
		    loginResponse response =blockingstub.login(request);
		    logger.info("Greet:" + response.getMessage());
		}
		catch(StatusRuntimeException e) {logger.log(Level.WARNING,"RPC Failed:(0)", e.getStatus());}
				  
		finally {channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
		}
		
		}
	}