import java.util.*;
import java.io.*;
class ReaderWriter1{
	public static void main(String[] args) throws IOException{
		Reader ob = new FileReader("nidhi.txt");
		int a = ob.read();
		while(a != -1){
		System.out.print((char)a);
		a = ob.read();
		}
		ob.close();
		
		
	}
	
	
	
}