interface bank{
void interest();}

class SBI implements bank{
public void interest(){
System.out.println("SBI");

}
}
class HDFC implements bank{
public void interest(){
System.out.println("HDFC");

}
}
class bank1{
public static void main(String args[]){
bank ob = new SBI();
ob.interest();
bank ob1 = new HDFC();
ob1.interest();
}
}