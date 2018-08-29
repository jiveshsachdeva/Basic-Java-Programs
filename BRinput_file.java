import java.util.*;
import java.io.*;
class BRinput_file{
public static void main(String args[]) throws IOException{
BufferedReader ob = new BufferedReader(new InputStreamReader(new FileInputStream("nidhi.txt")));
String str = null;
int c=0;
while(((str=ob.readLine()))!=null){
c++;

}
System.out.print(c);




}}