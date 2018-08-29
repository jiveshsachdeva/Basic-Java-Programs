import java.util.*;
import java.io.*;
class WriteData{
public static void main(String args[]) throws IOException{
   FileWriter ob = new FileWriter("nidhi.txt",true);
   BufferedWriter ob1 = new BufferedWriter(ob);
   String str1 = "hello bitches\n";
   String str2 = "lol\n";
   ob1.write(str1);
   ob1.write(str2);
   ob1.close();
   FileOutputStream ob3 = new FileOutputStream("nidhi.txt",true);
   String s="ok";
   byte b[] = s.getBytes();
   ob3.write(b);
   ob3.close();

}}