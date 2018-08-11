package CSE;
class teacher{
String name;
String subject;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setName(String subject) {
	this.subject = subject;
}
public teacher(String name, String subject) {
	super();
	this.name = name;
	this.subject = subject;

}
}
class student2{
int rollno;
double marks;


public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public getter(int rollno, double marks) {
	super();
	
	this.rollno = rollno;
	this.marks = marks;
}
}