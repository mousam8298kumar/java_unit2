public class MainProgram {
public static void main(String[] args) {
Student st1 = new Student();
Student st2 = new Student("Kush", 22, 88.5);
Student.updateCollege("School of Engineering and Technology");
System.out.println("Student 1 Information:");
st1.displayDetails();
System.out.println();
System.out.println("Student 2 Information:");
st2.displayDetails();
}
}
