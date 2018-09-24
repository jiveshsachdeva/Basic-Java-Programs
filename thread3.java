import java.util.*;
class b implements Runnable{
Thread t;
b(){
System.out.println("In const");
t=new Thread(this);

}
public void run(){
for(int i=0;i<5;i++){
System.out.println(i);
}
}
}

class thread3{

public static void main(String args[]){
b obj = new b();
Thread t = new Thread(obj);
System.out.println("bye");
}

}

