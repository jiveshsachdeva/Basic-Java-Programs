import java.lang.String;
class abc{
public static void main(String args[]){
	double a = Double.parseDouble(args[0]);
	int b = Integer.parseInt(args[2]);
   if(args[1].equals("+")){
	   System.out.println(a+b);}
	   else{
		   if(args[1].equals("-")){
			   System.out.println(a-b);
			   
		   }
		   else{
			   if(args[1].equals("*")){System.out.println(a*b);}
			   else{System.out.println(a/b);}
			   
			   
		   }
		   
		   
	   }

}


}