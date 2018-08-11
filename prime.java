import java.util.Scanner;

class prime{
public static void main(String args[]){

System.out.print("Enter number");
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int count =0;
for(int i=1;i<=a;i++){
if(a%i == 0){
count++;
}
}
if(count>2){
System.out.print("Number is not prime");
}
else{System.out.print("Number is prime");}




}



}