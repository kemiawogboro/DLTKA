package grpc.examples.smartsurvey;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import grpc.examples.smartsurvey.CheckinGrpc.CheckinBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

  // client class created
public class SmartSurveyClient{
	//local variable created forthe logger
	private static final Logger logger = Logger.getLogger(SmartSurveyClient.class.getName());
	
	// create the host and port
	public static void main (String [] args)throws Exception{
		String host ="localhost";
		int port = 50051;
		// establish channnel for host and port
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		// creating stub
		CheckinBlockingStub blockingstub = CheckinGrpc.newBlockingStub(channel);
		SmartSurveyClient client = new SmartSurveyClient();
		
		try {
			String name ="James";
			//build request and setname
			loginRequest request = loginRequest.newBuilder().setName(name).build();
		    loginResponse response =blockingstub.login(request);
		    logger.info("Greet:" + response.getMessage());
		}
		//error handling
		catch(StatusRuntimeException e) {logger.log(Level.WARNING,"RPC Failed:(0)", e.getStatus());}
		
		//termination detail specified		  
		finally {channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
		}
		
		}
	}