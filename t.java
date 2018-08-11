import java.util.*;
class t{
public static void main(String args[]){
Scanner in  = new Scanner(System.in);
int a = in.nextInt();
int n = a;
int count[] = new int[10];

int r;
for(int t=1;t<10;t++){
	count[t]=0;
}
while (a!=0){
r = a%10;
count[r]++;
a = a/10;
}
for(int i=1;i<10;i++){
	if(count[i]>1){
		System.out.println(i);
	}
	
	
}


}


}


