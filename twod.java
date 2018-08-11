import java.util.Scanner;
class twod{
public static void main(String args[]){
int arr[][] = new int[2][2];
Scanner a = new Scanner(System.in);
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
arr[i][j] = a.nextInt();
}
}
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
System.out.print(arr[i][j]+"  ");
}
System.out.println();
}
System.out.println("Transpose");
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
System.out.print(arr[j][i]+"  ");
}
System.out.println();as/
}




}
}

