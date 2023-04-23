package grpc.examples.smartsurvey;


import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import grpc.examples.smartsurvey.CheckinGrpc.CheckinImplBase;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.JOptionPane;


import grpc.examples.smartsurvey.CheckinGrpc.CheckinBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

  // client class created
public class SmartSurveyClient{
	//local variable created forthe logger
	private static final Logger logger = Logger.getLogger(SmartSurveyClient.class.getName());
	private static class SmartSurveyListener implements ServiceListener {
		@SuppressWarnings("unused")
		public void Checkin(ServiceEvent event) {
			
			  
			System.out.println("Service added: " + event.getInfo());
			
			
			 try {                
                 Socket s = new Socket("localhost", 5001);
                 BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                 String answer = input.readLine();
                 JOptionPane.showMessageDialog(null, answer);
                 System.exit(0);
             } catch (IOException ex) {
                 Logger.getLogger(SmartSurveyClient.class.getName()).log(Level.SEVERE, null, ex);
             }
			 
		}

		@Override
		public void serviceRemoved(ServiceEvent event) {
			System.out.println("Service removed: " + event.getInfo());
		}

		@Override
		public void serviceResolved(ServiceEvent event) {
                    System.out.println("Service resolved: " + event.getInfo());

                    try {
                        ServiceInfo info = event.getInfo();
                        int port = info.getPort();
                        String address = info.getHostAddresses()[0];
                        Socket s = new Socket(address, port);
                        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        String answer = input.readLine();
                        JOptionPane.showMessageDialog(null, answer);
                        System.exit(0);
                    } catch (IOException ex) {
                        Logger.getLogger(SmartSurveyClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}

		@Override
		public void serviceAdded(ServiceEvent event) {
			// TODO Auto-generated method stub
			
		}
	}

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
		    loginRequest requestl = loginRequest.newBuilder().setName(name).build();
		    loginResponse responsel =blockingstub.logout(requestl);
		    logger.info("Greet:" + response.getMessage());
		    logger.info("Greet:" + responsel.getMessage());
		    
		}
		//error handling
		catch(StatusRuntimeException e) {logger.log(Level.WARNING,"RPC Failed:(0)", e.getStatus());}
		
		//termination detail specified		  
		finally {channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
		}
		
		}
	public class ControllerGUI implements ActionListener{

		
		
		private JTextField entry1, reply1;
		private JTextField entry2, reply2;
		private JTextField entry3, reply3;
		private JTextField entry4, reply4;


		private JPanel getCkeckinJPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter value")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry1 = new JTextField("",10);
			panel.add(entry1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Service Checkin");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply1 = new JTextField("", 10);
			reply1 .setEditable(false);
			panel.add(reply1 );

			panel.setLayout(boxlayout);

			return panel;

		}

		private JPanel getMonitorJPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter value")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry2 = new JTextField("",10);
			panel.add(entry2);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Monitor");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply2 = new JTextField("", 10);
			reply2 .setEditable(false);
			panel.add(reply2 );

			panel.setLayout(boxlayout);

			return panel;

		}

		private JPanel getReportJPanel() {

			JPanel panel = new JPanel();

			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

			JLabel label = new JLabel("Enter value")	;
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			entry3 = new JTextField("",10);
			panel.add(entry3);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("Invoke Report");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			reply3 = new JTextField("", 10);
			reply3 .setEditable(false);
			panel.add(reply3 );

			panel.setLayout(boxlayout);

			return panel;

		}

		

		private void build() { 

			JFrame frame = new JFrame("Service Controller Sample");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// Set the panel to add buttons
			JPanel panel = new JPanel();

			// Set the BoxLayout to be X_AXIS: from left to right
			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

			panel.setLayout(boxlayout);

			// Set border for the panel
			panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
		
			panel.add( getCkeckinJPanel() );
			panel.add( getMonitorJPanel() );
			panel.add( getReportJPanel() );
		

			// Set size for the frame
			frame.setSize(300, 300);

			// Set the window to be visible as the default to be false
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			String label = button.getActionCommand();  

			if (label.equals("Invoke Ckeckin")) {
				System.out.println("Checkin to be invoked ...");

			
				
				
			}

		}

	}

	}