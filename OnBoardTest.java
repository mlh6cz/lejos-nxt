import java.io.DataInputStream;
import java.io.DataOutputStream;

import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTConnection;
import lejos.nxt.comm.USB;

//This class hides the functionality of the onBoard test. 
public class OnBoardTest {
  
	public boolean USBtest = false;

	public boolean sendMessage(){
	/* This method will send a message to the test system of the base station.
	 */
		
		System.out.println("Waiting...");
		
		// Establish the connection here, for testing purpose, we will use USB connection
		NXTConnection connection = null;
		if (USBtest){
			connection = USB.waitForConnection();
		} else {
			connection = Bluetooth.waitForConnection();
		}
		// An additional check before opening streams
		if (connection==null){
			System.out.println("Failed");
		} else {
			System.out.println("Connected");
		}
		
		// Open two data input and output streams for read and write respectively
	    final DataOutputStream oHandle = connection.openDataOutputStream();
	    final DataInputStream iHandle = connection.openDataInputStream();
	    
		
		return false;
		
	}
	
	
	public boolean checkFormat();
	/* This method will verify that the format of the message and command is in the right format.
	 */
	
	
	public String receiveMessage();
	/* This method will wait to receive data from the Base station test tool.
	 */
	
	
}
