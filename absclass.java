abstract class a{
	abstract void disp();
}
class absclass extends a{
	void disp(){
		System.out.print("Hello");
	}
	public static void main(String args[]){
		a ob = new absclass();
		ob.disp();
		
	}
}