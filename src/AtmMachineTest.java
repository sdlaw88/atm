import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtmMachineTest {
	AtmMachine underTest= new AtmMachine();
	
	
	@Test
	public void atmShouldRequireUserToInputPin() {
		
		//Arrange 
		//Its global
		//Act 
		int requiredPin=underTest.getenterPinNumber();
		
		int result=underTest.getenterPinNumber();
		
		//Assert
		assertEquals(requiredPin,result);
	}
		@Test
		public void atmShouldDenyAccessForWrongNumber() {
	
	//Arrange
	AtmMachine wrongPin = new AtmMachine ();
		//Act
		int numberEntered=wrongPin.getAttempts();
		wrongPin.getUserInfo();
		int result=wrongPin.getAttempts();
	
		//Assert
		assertEquals(numberEntered-1,result);
		}
}
