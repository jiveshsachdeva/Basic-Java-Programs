import java.util.Scanner;
class sparse2{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a[][] = new int[4][];
		for(int i=0;i<a.length;i++){
				a[i] = new int[i+1];
				}
				
			for(int i=0;i<a.length;i++){
			int counter = 3;
			for(int j=0;j<a[i].length;j++){
			    a[i][j] = counter;
			counter+=3;
			
			}
			}	
			for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[i].length;j++){
			System.out.print(a[i][j]+ " ");
			
			}
			System.out.println();
			}	
				
				
				
				
				
				
				
		}
		}