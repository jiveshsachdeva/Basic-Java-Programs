class inherited{
int a,b;
void display(){
System.out.println(a+" "+b);
}
}
class inheritance extends inherited{
int c;
void display(){
System.out.println(+ a+" " +b+" " +c);
}
public static void main(String[] args){
inheritance ob = new inheritance();
inherited ob1 = new inheritance();
ob.display();
ob1.display();
}





}