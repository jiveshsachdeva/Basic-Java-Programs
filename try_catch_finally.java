class try_catch_finally{
	
public static void main(String args[]){
	int a,b,c=0;
try{
 a = Integer.parseInt(args[0]);
 b = Integer.parseInt(args[1]);
 c= a/b;}
 catch(ArithmeticException e){
	 System.out.println("Exception occured");
	 e.printStackTrace();
 }
finally{
System.out.println(c);}

}


}