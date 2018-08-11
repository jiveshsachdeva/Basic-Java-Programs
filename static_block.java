public class static_block{
int aa=10;
static int bb=20;

static{
	static_block ob = new static_block();
System.out.println(ob.aa);
bb=60;
}


public static void main(String args[]){

System.out.println(bb);
}
}