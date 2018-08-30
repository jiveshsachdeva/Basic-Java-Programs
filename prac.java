import java.util.*;
import java.io.*;
class prac{
public static void main(String args[]){
	String s[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"}
	String s1[] = {"Hundred","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"}
	
	
	
 Scanner sc = new Scanner(System.in);
		String str;
		int a,i=0;
		int rem[] = new int[1111111];
		a = sc.nextInt();
		int n = a;
		int r;
		while(n>0){
		 r = n%10;
		 rem[i] = r;
		 i++;
		 n = n/10;
		
		}
		if(rem.length==3){
			System.out.print(rem[rem.length-1])
			
		}

}



}