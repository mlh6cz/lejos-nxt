//This class hides the functionality of the onBoard system.
public abstract class OnBoardSystem {

  ArrayList<String> currOps;
	ArrayList<String> pastOps;
	
	public boolean getTouch();
	/* This method will get the telemetry data from the touch sensor
	 * of the robot 
	 */
	
	public int getSound();
	/* This method will get the telemtry data from the sound sensor.
	 * 
	 */
	
	
	public int getLight();
	/* This method will get the telemtry data from the light sensor.
	 * 
	 */
	
	public int getUltrasonic();
	/* This method will get the telemtry data from the ultrasonic sensor.
	 * 
	 */
	
	public int getMotorSpeed(int motor);
	/* This method will get the speed of the specified motor.
	 */
	
	public int batteryLevel();
	/* This method will get amount of battery power left for the brick.
	 */
	
	public boolean sendData();
	/* This method will send data gathered from sensors back to the onBoard system.
	 */
	
	public boolean sendMessage(Message m);
	/* This method will send a message using the message class back to the onBoard system.
	 */
	
	
	public boolean sendMessage(String s);
	/* This method will send a message back to the onBoard system as a string.
	 */
	
	
	private void receiveMessage();
	/* This method will wait to receive data from onBoard system.
	 */
	
	
	private void evaluateOp(String s);
	/* This method will evaluate the op code received from the base station.
	 */
	
	private void setMotorSpeed(int left, int right);
	/* This method will set the motor speed for both the left and the right motor.
	 */
	
	
	
}
