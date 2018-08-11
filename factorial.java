import java.util.Scanner;

class factorial{
	public static void main(String args[]){
		
		System.out.print("Enter number");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int fact = 1;
		for(int i=a;i>=1;i--){
		fact = fact * i;}
		System.out.print("Factorial: " + fact);
		
		
		
		
	}
	
	
	
}