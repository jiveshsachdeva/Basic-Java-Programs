public class throw1{
	public static void main(String args[]){
		int c=0;
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
				c=a/b;
		}
		 catch (Throwable e){
			 if(e instanceof ArrayIndexOutOfBoundsException){
				 System.out.println("Array index out of bound ex");
			 }
			 if(e instanceof NumberFormatException){
							 System.out.println("Number format ex"); 
			 }
			 if(e instanceof ArithmeticException){
				 			 System.out.println("Arith ex");
			 }
			 
			 
		 }
		
			
	}
	
	
	
} 