class c{
 c(){
System.out.println("base default const");
}
c(int a,int b){
System.out.println("base parame");
}
};
class constr extends c{
	constr(){
		System.out.println("derived default cons");
	}
	constr(int a,int b){
		System.out.println("derived parame ");
	}
public static void main(String args[]){
constr ob = new constr();
constr ob1 = new constr(2,3);


}


}