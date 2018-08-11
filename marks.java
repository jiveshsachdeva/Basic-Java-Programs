import java.util.Scanner;

class marks{

public static void main(String agrs[]){
 System.out.print("Enter marks");
 Scanner in = new Scanner(System.in);
 int m = in.nextInt();
if(m<=40){
	System.out.print("Fail");
}
else{
	if(m>80){System.out.print("A");}
	else{
		if(m>=70){System.out.print("B");}
		else{
			if(m>=60)
			System.out.print("C");
		}		
		
	}
	
	
	
} 



}



}