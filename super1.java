class super1{
int a,b;
void display(){
System.out.println(a+" "+b);
}
}
class inheritance extends super1{
int c;
void display(){
super.display();
System.out.println(+ a+" " +b+" " +c);
};
public static void main(String[] args){
inheritance ob = new inheritance();
//inherited ob1 = new inheritance();
ob.display();
//ob1.display();
}





}