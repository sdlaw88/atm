import java.util.Scanner;
public class AtmMachineApp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int userInput;
		
		System.out.println("Welcome to capital banking");
		System.out.println("Please enter your pin number");
		 userInput = input.nextInt();
		
		 AtmMachine myPin= new AtmMachine(userInput);
	if (userInput==1492) {
		System.out.println("Thank you your balance is");
	}
	
	
	
	
	
	
	}

}
