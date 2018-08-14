import java.util.*;
public class ageexception{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
int a = in.nextInt();
if(a<18){
throw new ArithmeticException("less than 18");
}
else{throw new ArithmeticException("more than 18");}


}

}