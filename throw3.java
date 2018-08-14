public class throw3{
public static void main(String args[]){
try{
int a =5/0;
throw new ArithmeticException("Error");
}
catch(Throwable e){
e.getMessage();
System.out.println(e);
}

}

}