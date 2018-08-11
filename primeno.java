import java.util.Scanner;
class primeno{
public static void main(String args[]){
primeno ob = new primeno();
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int i=n-1;i>=0;i++){
if(ob.isprime(i)==0){
System.out.print(i);
break;
}
}
}

int isprime(int a){
int count=0;
for(int i=1;i<=a;i++){
if(a%i==0){
count++;
}
}
if(count>2){
return 0;
}
else{
return 1;

}





}





}


