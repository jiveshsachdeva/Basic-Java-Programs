interface nm1{
int a=10,b=20;
void s();

}
interface np{
int c=100,d=200;
void s1();

}


class interface2 implements nm1,np{
public void s(){
System.out.println(a);
System.out.println(b);
}
public void s1(){
	System.out.println(c+d);
}
public static void main(String args[]){
interface2 ob = new interface2();
ob.s();
ob.s1();
}

}