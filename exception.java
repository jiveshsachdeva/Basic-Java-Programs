public class exception{
	public static void main(String args[]){
		int c=0;
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			try{
				c=a/b;
			}
			catch(ArithmeticException e){
				System.out.println(" Arith exception occured");
			}
			finally{System.out.println(c);}
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("array exp occured");
		}
		catch (Exception e){
			System.out.println("exception occured");
		}
		/*catch (NumberFormatException e){
			System.out.println("No format exception occured");
		} */
		
	}
	
	
	
} 