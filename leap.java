import java.util.Scanner;

class leap{

public static void main(String args[]){

Scanner in = new Scanner(System.in);
int y = in.nextInt();
int r = isLeap(y);
if(r==1){
System.out.println("It is a leap year");
}
else{
System.out.print("Not a leap year");
}
}




public static int isLeap(int a)
{
if(a%400==0)
return 1;
else if(a%100==0)
return 0;
else if (a%4==0)
return 1;
else
return 0;
}
}








