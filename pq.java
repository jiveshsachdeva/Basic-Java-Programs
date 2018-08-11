package ECE;
import CSE.*;
class pq{
public static void main(String args[]){
teacher ob = new teacher("nidhi","java");
	String name = ob.getName();
	String subject = ob.getSubject();
	student2 ob1 = new student2(2,90.9);
	int rollno = ob1.getRollno();
	double marks = ob1.getMarks();
	ob.setName(name);
	ob.setSubject(subject);
	ob1.setRollno(rollno);
	ob1.setMarks(marks);
	System.out.println("Name:"+ob.name);
	System.out.println("Subject:"+ob.subject);
	System.out.println("Rollno:"+ob1.rollno);
	System.out.println("Marks:"+ob1.marks);



}



}