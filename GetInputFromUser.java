import java.util.Scanner;
class GetInputFromUser{
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	System.out.println("You entered string:" + s);
	int a = in.nextInt();
	System.out.println("You entered int:" + a);
	float b = in.nextFloat();
	System.out.println("You entered float:" + b);
	
}


}