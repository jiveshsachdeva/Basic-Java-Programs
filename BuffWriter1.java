import java.util.*;
import java.io.*;
class BuffWriter1{
	public static void main(String[] args) throws IOException{
		BufferedWriter ob = new BufferedWriter(new FileWriter("nidhi.txt",true));
		String s = "ABCDEF";
		ob.write(s);
		ob.close();
		
		
	}
	
	
	
}