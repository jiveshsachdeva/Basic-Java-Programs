interface vehicle{
void speedup(int);
void applybreak(int);
void changegear(int);

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

System.out.println("Gear changed"+s);
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
System.out.println("Gear changed"+s);
}
};
public class finalvehicle{
public static void main(String args[]){
Bicycle ob = new Bicycle();
ob.speedup(30);
ob.applybreak(30);
ob.changegear(30);
Bike ob1 = new Bike();
ob1.speedup(50);
ob1.applybreak(50);
ob1.changegear(50);


}



}