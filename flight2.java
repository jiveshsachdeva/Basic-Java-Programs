import java.util.Scanner;
class flight2
{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int countm=0,countf=0,countc=0;
int arr[] = new int[n];
char arr1[] = new char[n];
for(int i=0;i<n;i++){
arr[i] = in.nextInt();
}
for(int i=0;i<n;i++){
arr1[i] = in.next().charAt(0);
}
int num = in.nextInt();
int row = in.nextInt();
for(int i=0;i<num;i++){
if(arr1[i]=='F'){
countf++;
}
else{
if(arr1[i]=='M'){
if(arr[i] > 60){
countm++;
}
}
else if(arr1[i] == 'C'){
countc++;}
} 


}

System.out.print(countf + " " +countc + " "+ countm  );


}
}