class overridden{
protected void display()
{System.out.println("LOL");}
}
public class over extends overridden{
protected void display(){
System.out.println("LEL");}
public static void main(String args[]){
overridden ob = new overridden();
ob.display();



}
}