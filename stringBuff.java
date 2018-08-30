import java.util.*;
class stringBuff{
	public static void main(String[] args){
		StringBuffer s = new StringBuffer();
		System.out.println(s.length());
		StringBuffer s1 = new StringBuffer(20);
		System.out.println(s1.capacity());
		StringBuffer s2 = new StringBuffer("chitkara university");
		System.out.println(s2.length());
		//StringBuffer s3 = new StringBuffer();
		System.out.println(s2.append(" ok" ));
		
		System.out.println(s2.insert(5,"for" ));
		System.out.println(s2.insert(3,69));
		System.out.println(s2.delete(0,5));
		System.out.println(s2.deleteCharAt(7));
		System.out.println(s2.replace(2,5," welcome " ));
		System.out.println(s2.reverse());
		

		
		
	}
	
	
	
}