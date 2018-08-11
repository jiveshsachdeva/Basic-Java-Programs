
  public class cde{
   String name;
   int n;
 cde(String name,int n){
 	this.name=name;
	this.n=n;
	
  }
public String toString(){
	return ("Your name is:"+ name + " and rollno is:"+ n);
	
}


public static void main(String args[]){
cde ob = new cde("Nidhi",2);
System.out.print(ob);

}
}