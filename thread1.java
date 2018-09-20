import java.util.*;
public class thread1{
public static void main(String args[]){
Thread t = Thread.currentThread();
System.out.println(t);
System.out.println(t.getPriority());
System.out.println(t.getName());
t.setPriority(7);
System.out.println(t);
}

}

