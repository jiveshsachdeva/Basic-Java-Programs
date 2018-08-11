import java.util.Scanner;
class chararray2{

public static void main(String args[]){
Scanner in = new Scanner(System.in);
int ctr;
int n = in.nextInt();
char arr1[] = new char[26];
int count[] = new int[26];
for(int i=0;i<n;i++){
arr1[i] = in.next().charAt(0);
count[i] = -1;
}
for(int i=0;i<n;i++){
	ctr =1;
	for(int j=i+1;j<n;j++){
		if(arr1[i]==arr1[j]){
			ctr++;
			count[j] = 0;
		}
	}
	if(count[i]!=0){
		count[i] = ctr;
	}
	
}
for(int i=0;i<n;i++){
	if(count[i]!=0){
		System.out.println(arr1[i]+ " "+ count[i]);
	}
}





}
}