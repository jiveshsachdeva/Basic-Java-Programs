/*
import java.util.*;
public class kk{
    public static void main(String[] args){
        String a1=new String("Madhav Aneja");
        StringBuilder a2=new StringBuilder();
        a2.append(a1);
        a2=a2.reverse();
        System.out.println(a2);
    }
}
*/
class A{
    private void printName(){
        System.out.print("aaaa");

    }


}
class B extends A{
    public void printName(){
        System.out.println("BbB");

    }
public class mcqtest{
    public void main(String args[]){
        B b=new B();
        b.printName();
    }


}



}