interface nm{
int a=10,b=20;
void s();
void s1(){
	int d=0;
}
}
class interface1 implements nm{
public void s(){
System.out.println(a);
System.out.println(b);
}
public void s1(){
	int d=0;
}
public static void main(String args[]){
interface1 ob = new interface1();
ob.s();

}

}