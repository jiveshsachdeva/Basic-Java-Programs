import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class tokenizer{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str,",");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = s1.trim();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
	}
	
	
	
}