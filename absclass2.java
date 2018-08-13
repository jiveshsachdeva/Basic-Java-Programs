abstract class a{
a(){
System.out.println("I am in constructor");
};
abstract void disp();
void disp2(){
System.out.println("I am in disp2");

}

}
class absclass2 extends a{
	void disp(){
		System.out.println("i am in abstract method");
	}
	public static void main(String args[]){
		a ob = new absclass2();
		ob.disp();
		ob.disp2();
	}


}