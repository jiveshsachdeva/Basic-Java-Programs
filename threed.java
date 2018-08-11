import java.util.Scanner;
class threed{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int arr[][][] = new int[3][2][3];
int sum=0;
for(int i=0;i<3;i++){
for(int j=0;j<2;j++){
for(int k=0;k<3;k++){
arr[i][j][k] = in.nextInt();

}

}

}
for(int i=0;i<3;i++){
	System.out.println("Department "+ (i+1));
for(int j=0;j<2;j++){
	System.out.println("Student "+ (j+1) + "marks ");
	sum =0;
for(int k=0;k<3;k++){
	sum += arr[i][j][k];
System.out.print(arr[i][j][k]+ " " + "Total marks: "+ sum);
}
System.out.println();
}
System.out.println();
}

}

}