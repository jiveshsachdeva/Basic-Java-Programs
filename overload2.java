class overload2{

void add(float a,float b){
	System.out.println("func2");
System.out.println(a+b);}
void add(double a,double b){
	System.out.println("func3");
System.out.println(a+b);}



public static void main(String args[]){
     overload2 ob = new overload2();
	 ob.add(65,'d');
	 ob.add('c','d');
	 ob.add(6.5,3.2f);
	 ob.add(6.5f,3);
	 ob.add(6.5,2.1);
	 ob.add(6.5f,2.1f);




}


}