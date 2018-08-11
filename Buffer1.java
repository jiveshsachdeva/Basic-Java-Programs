import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
class Buffer1{

public static void main(String args[]) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
int a = Integer.parseInt(str);
System.out.print(a);

}
}
