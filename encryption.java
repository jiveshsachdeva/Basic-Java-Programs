import java.util.*;
class encryption{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
String str = in.nextLine();
char[] ch = str.toCharArray();
int arr[] = new int[50];
int arr1[] = new int[50];
for(int i=0;i<ch.length;i++){
arr[i] = str.charAt(i);
}
for(int i=0;i<ch.length;i++){
arr[i] = arr[i] + 1;
}
for(int i=0;i<ch.length;i++){
arr1[i] = Integer.parseInt(Integer.toBinaryString(arr[i]));

}
for(int i=0;i<ch.length;i++){
System.out.println(arr1[i] + "0");

}

}



}