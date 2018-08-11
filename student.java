import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;

class student{

public static void main(String args[]) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name");
String str = br.readLine();
//int a = Integer.parseInt(str);

System.out.println("Enter fees");
String str1 = br.readLine();
float a = Float.parseFloat(str1);
System.out.println("Enter gender");
String str2 = br.readLine();
System.out.println("Enter rollno");
String str3 = br.readLine();
int ab = Integer.parseInt(str3);


System.out.println("Name:"+str);
System.out.println("Fees:" + a);
System.out.println("Gender:"+ str2);
System.out.println("Roll no:"+ ab);

}


}