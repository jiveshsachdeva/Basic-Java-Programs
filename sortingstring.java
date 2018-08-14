import java.util.*;
public class sortingstring{
	
	char[] sort(char [] ch){
for(int i=0;i<ch.length;i++){
for(int j=0;j<ch.length;j++){
if(ch[i]<ch[j]){
char c = ch[i];
ch[i] = ch[j];
ch[j] = c;
}

}

}
return ch;

}

public static void main(String args[]){
Scanner in = new Scanner(System.in);
String str = in.nextLine();
char ch[] = str.toCharArray();
sortingstring ob = new sortingstring();
char [] a = ob.sort(ch);
for(int i=0;i<ch.length;i++){
System.out.print(a[i]);
}


}
}