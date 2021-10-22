import java.util.Scanner;

//Swap the values of two variables without using a third variable.
public class SwapClever {
	
	public static int swap(int a, int b) {
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		try {			
			System.out.print("Please give a number as 1st variable: ");  
			int a = sc.nextInt();  
			System.out.print("Please give a number as 2nd variable: ");  
			int b = sc.nextInt();  		 
			System.out.println("\nYou gave: first variable = " + a + ", second variable = " +  b);
			
			a = swap(b, b = a);	//A copy of the function parameters are stored internally in the method stack, hence the value of b is not lost.
			
			System.out.println("\nResult:\nThe value of the 1st variable: " + a);
			System.out.println("The value of the 2nd variable: " + b);	
		} catch (java.util.InputMismatchException e) {
			System.out.println("Please input a valid number.Exiting..");
            System.exit(0);
        }
	}

}