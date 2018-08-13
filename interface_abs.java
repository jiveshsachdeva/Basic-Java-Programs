interface University{
public void a1();
public void a2();
public void a3();
public void a4();
}
abstract class a implements University{
public void a1(){
System.out.println("a1");
}
}
class interface_abs extends a{
public void a2(){
System.out.println("a2");

}
public void a3(){
System.out.println("a3");

}
public void a4(){
System.out.println("a4");

}
public static void main(String args[]){
University ob = new interface_abs();
ob.a1();
ob.a2();
ob.a3();
ob.a4();


}

}