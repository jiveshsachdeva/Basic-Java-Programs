import java.util.Scanner;
class age{
public static void main(String args[]){

System.out.print("Enter age: ");
Scanner in = new Scanner(System.in);
int a = in.nextInt();
if(a>=18){
System.out.print("Person is eligible to vote");
}
else{System.out.print("Person is not eligible to vote");}

}




}