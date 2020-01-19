
public class AtmMachine {

	private int enterPinNumber=1492;
	private int attempts=3;
	private int userInfo;
	private int userInput;
	
	
		
	public AtmMachine(int pinParameter) {
		this.userInput=pinParameter;
	}



	


	public int getenterPinNumber() {
		
		return this.enterPinNumber;
	}



	public int getAttempts() {
		
		return this.attempts--;
	}



	public int getUserInfo() {

		return this.userInfo;
		
	}



	

	

	

	

}
