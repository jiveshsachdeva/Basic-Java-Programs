class This{
int n1,n2;
void set(int m,int n2){
n1=m;
this.n2 = n2;

}


public static void main(String args[]){
This ob = new This();
ob.set(3,6);
System.out.println(ob.n1);
System.out.println(ob.n2);
}




}