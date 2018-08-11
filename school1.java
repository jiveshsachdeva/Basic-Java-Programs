interface bank{
void interest();}
interface school extends bank{
void disp();
}

class school1 implements school{
public void interest(){
System.out.println("lol");
}
public void disp(){
System.out.println("lol2");
}
public static void main(String args[]){
school1 ob = new school1();
ob.interest();

ob.disp();
}
}