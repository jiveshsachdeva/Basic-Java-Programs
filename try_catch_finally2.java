class try_catch_finally2{
	
public static void main(String args[]){
	int a,b,c=0;
try{
 a = Integer.parseInt(args[0]);
 b = Integer.parseInt(args[1]);
 c= a/b;}
 catch(ArrayIndexOutOfBoundsException e){
	 System.out.println("Exception occured");
	 e.printStackTrace();
 }
 catch(Exception e1){
	 System.out.println("Exception1 occured");
	 e1.printStackTrace();
 }
finally{
System.out.println(c);}

}


}