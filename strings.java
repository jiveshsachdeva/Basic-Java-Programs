import java.util.*;
class strings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		char c;
		str = sc.nextLine();
		c = sc.next().charAt(0);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c)
				System.out.println(i);
			
			
		}
		
		
	}
	
	
	
}