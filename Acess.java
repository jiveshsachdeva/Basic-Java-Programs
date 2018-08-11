class mnp{
private int b=10;
int a=70;
public int p = 90;
protected int r=20;
private void display()
{System.out.print(b);}
}
class Acess{
	public static void main(String args[]){
		mnp ob = new mnp();
		//ob.display();
		System.out.print(ob.a+ob.p+ob.r);
	}
	
	
}