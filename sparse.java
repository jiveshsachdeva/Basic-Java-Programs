import java.util.Scanner;
class sparse{
	public static void main(String args[]){
		sparse ob = new sparse();
		int zero=0;
		int non=0;
	 Scanner in = new Scanner(System.in);
	 int arr1[][] = new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				arr1[i][j] = in.nextInt();
				if(arr1[i][j] !=0){
					non++;
					}
					else{
						zero++;
					}
				
				
				
			}
		}
			if(zero>=non)
			{
				System.out.print("Sparse");
			}
			else{
				System.out.print("Not Sparse");
			}
			
			ob.add(arr1);
			
		}
		void add(int a[][]){
			int s=0;
			for(int i=0;i<2;i++){
				for(int j=1;j>=0;j--){
					s +=a[i][j];
					
				}
				
			}
			System.out.println();
			System.out.print(s);
			
			
		}
		
		
		
	}
	
	
	
