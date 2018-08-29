import java.util.*;
import java.io.*;
class inputStream{
public static void main(String args[]) throws IOException{
  InputStream ob = new FileInputStream("nidhi.txt");
  Reader ob1 = new InputStreamReader(ob);
     int a = ob1.read();
	 while(a!=-1){
		 System.out.print((char)a);
		a = ob1.read();
		 
	 }
	 ob1.close();
}


}