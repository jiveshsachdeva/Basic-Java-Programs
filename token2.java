import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class token2{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str,",");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		double a = Double.parseDouble(s1);
		double b = Double.parseDouble(s2);
		double c = a+b;
		double c1 = a-b;
		double c2 = a*b;
		double c3 = a/b;
		
		System.out.println("Addition: " +c);
		System.out.println("Subtraction: " +c1);
		System.out.println("Multiplication " +c2);
		System.out.println("Division" +c3);
		
		
		
		
		
		
	}
	
	
	
}