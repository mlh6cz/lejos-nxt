//This class hides how the robot communicates and the communication protocol
public class Message {

  	String tag;
		Date timestamp;
		String operation;
		ArrayList<String> operands;
		String message;
		
		public String toString();
		/*
		 * Converts message to a string 
		 */
		
		public boolean validateMessage(Message m);
		/* 
		 * Validates that the message is of the proper format
		 */
		
		public Message parseString(String s);
		/*
		 * Message will parse string into Message component to create a new message from a string.
		 */
}
