class super1{
int a,b;
void display(){
System.out.println(a+" "+b);
}
}
class super2 extends super1{
int c;
void display(){
super.display();
System.out.println(+ a+" " +b+" " +c);
};
public static void main(String[] args){
super2 ob = new super2();
//inherited ob1 = new inheritance();
ob.display();
//ob1.display();
}





}