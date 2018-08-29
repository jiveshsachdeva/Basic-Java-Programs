import java.util.*;
import java.io.*;
public class StringToken{
public static void main (String args[]) throws IOException{
	String s = new String("ABCDEFGHI");
	char c2[] = new char[20];
	c2[0] = 'k'; c2[1] = 'd';
	s.getChars(2,5,c2,4);
   String s1 = "Kriti";
  String s2 = new String("Nidhi");
  char c[] = { 'A','B','C'};
  String s3 = new String(c);
  byte b[] = {65,66,67,68,0,9,7,8,5,3};
  String s4 = new String(b);
  String s5 = new String(b,1,4);
 System.out.println(s1+ " " + s2 + " " + s3 + " " + s4+ " " + s5 );
 System.out.println(c2);

}
}