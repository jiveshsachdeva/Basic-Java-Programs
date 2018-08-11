import java.util.Scanner;
class addfunc{
public static void main(String args[]){
addfunc ob = new addfunc();
Scanner in = new Scanner(System.in);
System.out.println("Enter no. of rows and columns");
int row = in.nextInt();
int col = in.nextInt();
int arr1[][] = new int[row][col];
int arr2[][] = new int[row][col];
ob.input(arr1);
ob.input(arr2);
int a[][] = ob.add(arr1,arr2);
ob.disp(a);
int b[][] = ob.mul(arr1,arr2);
ob.disp(b);
}
void input(int arr[][]){
	System.out.println("Enter elements of array:");
	Scanner in = new Scanner(System.in);
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[0].length;j++){
      arr[i][j] = in.nextInt();
}
}
}
int[][] add(int r[][],int r1[][]){
int[][] d = new int[r.length][r[0].length];
for(int i=0;i<r.length;i++){
for(int j=0;j<r[0].length;j++){
   d[i][j] = r[i][j] + r1[i][j];
}

}
return(d);


}

void disp(int w[][]){
	
for(int i=0;i<w.length;i++){
for(int j=0;j<w[0].length;j++){
System.out.print(w[i][j]+ " " );

}
System.out.println();
}

}
int [][] mul(int q[][], int q1[][]){
	int[][] s = new int[q.length][q[0].length];
	for(int i=0;i<q.length;i++){
		for(int j=0;j<q[i].length;j++){
			m[i][j] = 0;
			for(int k=0;k<q[i].length;k++){
				m[k]
				
				
				
			}
			
			
		}
		
		
	}
	
	
	
	
}





}