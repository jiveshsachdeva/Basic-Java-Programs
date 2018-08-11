import java.util.*;
class room{
int noroom;
float paintcost;
float area;
void count(int n,float a){
double total_area = n*a;
double total_paint = total_area/115;
double total_cost = total_paint * 3;
System.out.println(total_area+ " " + total_paint + " " + total_cost);

}

}


class paint{
public static void main(String args[]){
room ob = new room();
Scanner in = new Scanner(System.in);
System.out.println("enter no of rooms");
ob.noroom = in.nextInt();
System.out.println("enter area of one room in sq feet");
ob.area = in.nextFloat();
ob.count(ob.noroom,ob.area);
}



}