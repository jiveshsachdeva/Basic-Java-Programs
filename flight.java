import java.util.Scanner;
class flight
{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int count=0;
int arr[] = new int[n];
char arr1[] = new char[n];
for(int i=0;i<n;i++){
arr[i] = in.nextInt();
}
for(int i=0;i<n;i++){
arr1[i] = in.next().charAt(0);
if(arr1[i]=='F' || arr1[i]=='C' || arr1[i]=='f' || arr1[i]=='c'){
count++;
}
else{
if(arr1[i]=='M' || arr1[i] == 'm'){
if(arr[i] > 60){
count++;
}
}
}
}
System.out.println(count);




}
}