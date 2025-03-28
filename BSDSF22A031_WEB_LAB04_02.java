import java.util.*;
class InvalidMarksException extends Exception{
	public InvalidMarksException(String message){
		super(message);
	}
}
class Student{
	String name;
	int marks;
	public Student(String name,int marks){
		this.name = name;
        this.marks = marks;
	}
	public String assignGrade()throws InvalidMarksException{
		if (marks <0 || marks >100){
			throw new InvalidMarksException("invalid marks ");
		}
		if (marks >= 85) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
	}	
	
}
public class uni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter marks: ");
        int marks = input.nextInt();
        Student student = new Student(name, marks);
        try {
            String grade = student.assignGrade();
            System.out.println("Assigned Grade: " + grade);
        } catch (InvalidMarksException e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            System.out.println("grade assigned successfully.");
        }

    }
}