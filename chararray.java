import java.util.Scanner;
class chararray{

public static void main(String args[]){
Scanner in = new Scanner(System.in);
int sum=0;
int n = in.nextInt();
char arr[] = new char[n];
for(int i=0;i<n;i++){
arr[i] = in.next().charAt(0);
}
char a = in.next().charAt(0);
for(int i=0;i<n;i++){
  if(arr[i] == a){
  sum++;
  }
}
if(sum==0){
	System.out.print("Invalid input");
	}
	else{
	System.out.print(sum);}
}
}