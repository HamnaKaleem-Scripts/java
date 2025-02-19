import java.util.*;
class Student{

	private String rollno;
	private String name;
	private String email;
	private String address;		
		
	public Student(){
		rollno="unkown";
		name="unkown";
		email="unkown";
		address="unkown";
	}
	public Student(String rollno_1,String name_1,String email_1,String address_1){
		rollno=rollno_1;
		name=name_1;
		email= email_1;
		address=address_1;
	}
	public Student(Student student){
		rollno=student.rollno;
		name=student.name;
		email= student.email;
		address=student.address;
	}
	public void setrollno(String rollno_1){
		rollno=rollno_1;
	}
	public void setrname(String name_1){
		name=name_1;
	}
	public void setemail(String email_1){
		email=email_1;
	}
	public void setaddress(String adress_1){
		address=adress_1;
	}
	public String getrollno(){
		return rollno;
	}
	public String getname(){
		return name;
	}
	public String getemail(){
		return email;
	}
	public String getaddress(){
		return address;
	}
	public void showdata(){
		System.out.println("Student info : " );
		System.out.println("student name: "+name );
		System.out.println("student email: "+email );
		System.out.println("student rollno: "+rollno );
		System.out.println("student address: "+address );
		
	}
	public void inputdata(){
		Scanner in =new Scanner(System.in);
		System.out.print("please enter name of the student" );
		name=in.nextLine();
		System.out.print("enter email of the student" );
		email=in.nextLine();
		System.out.print("enter roll number of the student" );
		rollno=in.nextLine();
		System.out.print("enter address of the student" );
		address=in.nextLine();
		
	}
}
public class task1{
	public static void main(String[] arg){
		Student x[]=new Student[5];
		
		
		for(int i =0;i<5;i++){
			System.out.println("enter details for student "+(i+1));
			x[i].inputdata();
		}
		
		for(int i =0;i<5;i++){
			x[i].showdata();
		}
		
		Student mystudent=new Student(x[0]);
		mystudent.showdata();
	}
}