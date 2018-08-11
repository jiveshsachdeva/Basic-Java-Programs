class a{
	int n1=10;
protected void display()
{System.out.println(n1);}
}
public class b extends a{
	int n2=20;
protected void display(){
System.out.println(n2);}
public static void main(String args[]){
a ob = new a();
a ob1 = new b();
b ob2 = new b();
ob.display();
ob1.display();
ob2.display();


}
}