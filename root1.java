import java.util.*;
import java.lang.Math;
import java.util.Scanner;
class root1{
	void display(double a,double b,double c){
		double d = b*b-4*a*c;
		if(d>=0){
			double d1 = Math.sqrt(b*b-4*a*c);
		double r = (d1 - b)/(2*a);
		double r1 = (d1+b)/(2*a);
		System.out.print("roots are:"+ r + "  -"+r1);
		}
		else{
			double real = -b/2*a;
			double imag = (b*b-4*a*c)/2*a;
			System.out.print("roots are:"+real+"+i"+imag + "   "+real + "-i"+imag);
			
		}
		
		
		
	}2
	
	
	
	
	
public static void main(String args[]){
Scanner in = new Scanner(System.in);
double a = in.nextDouble();
double b = in.nextDouble();
double c = in.nextDouble();
root1 ob = new root1();
ob.display(a,b,c);
}



}