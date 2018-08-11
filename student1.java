import java.util.Scanner;
class student1{
public static void main(String args[]){
float arr[] = new float[5];
float sum=0;
Scanner a = new Scanner(System.in);
System.out.println("Enter marks out of 100");
for(int i=0;i<5;i++){
arr[i] = a.nextFloat();
sum+= arr[i];
}
System.out.println("Total marks out of 500:"+ sum);
float p = sum/5;
System.out.println("Percentage:"+ p+"%");
}
}

