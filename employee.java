import java.util.*;
class emp{
String name,id;
}
class teacher extends emp{
String subject;
void input(){
Scanner in = new Scanner(System.in);
System.out.println("Enter name");
name = in.nextLine();
System.out.println("Enter id");
id = in.nextLine();
System.out.println("Enter subject");
subject = in.nextLine();
}
void display(){
System.out.println("Name:" + name);
System.out.println("Id:" + id);
System.out.println("Subject:" + subject);
}

}
class Staff extends emp{
String dept;
void input(){
Scanner in = new Scanner(System.in);
System.out.println("Enter name");
name = in.nextLine();
System.out.println("Enter id");
id = in.nextLine();
System.out.println("Enter dept");
dept = in.nextLine();
}
void display(){
System.out.println("Name:" + name);
System.out.println("Id:" + id);
System.out.println("dept:" + dept);
}
}
class employee{
public static void main(String[] args)
{
teacher ob = new teacher();
Staff ob1 = new Staff();
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 for teacher and 2 for staff");
int a = sc.nextInt();
if(a==1){
ob.input();
ob.display();
}
else{
	if(a==2){
ob1.input();
ob1.display();
}
else{System.out.println("Invalid choice");}
}



}




}

