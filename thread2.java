import java.util.*;
class a extends Thread{

int i;
public void run(){
for(i=0;i<10;i++){
System.out.print("Hello" + (i+1) + " ");
}
}
}

class thread2{
public static void main(String args[]){
a obj = new a();
Thread t = new Thread(obj);
t.start();
System.out.println("Run");


}

}

