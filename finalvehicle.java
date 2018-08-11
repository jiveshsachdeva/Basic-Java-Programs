interface vehicle{
void speedup(int s);
void applybreak(int s);
void changegear(int s);

}
class Bicycle implements vehicle{
public void speedup(int s){
s = s+10;
System.out.println("Speedup:"+s);
}
public void applybreak(int s){
s = s-10;
System.out.println("Applybreak:"+s);
}
public void changegear(int s){

System.out.println("Gear changed:3");
}


};
class Bike implements vehicle{
	
public void speedup(int s){
s = s+20;
System.out.println("Speedup:"+s);
}
public void applybreak(int s){
s = s-9;
System.out.println("Applybreak:"+s);
}
public void changegear(int s){
//s = s+s;
System.out.println("Gear changed:4");
}
};
public class finalvehicle{
public static void main(String args[]){
	int speed=30;
	
Bicycle ob = new Bicycle();
ob.speedup(speed);
ob.applybreak(speed);
ob.changegear(speed);
Bike ob1 = new Bike();
ob1.speedup(speed);
ob1.applybreak(speed);
ob1.changegear(speed);


}



}