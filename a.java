class a{
protected void display()
{System.out.println("10");}
}
public class b extends a{
protected void display(){
System.out.println("20");}
public static void main(String args[]){
a ob = new a();
a ob1 = new b();
b ob2 = new b();
ob.display();
ob1.display();
ob2.display();


}
}