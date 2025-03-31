import java.util.Scanner;
//assummed we have to test the code
public class StudentTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        
        System.out.print("Enter student name: ");
        student.setName(scanner.nextLine());
        
        System.out.print("Enter student grade (0-100): ");
        student.setGrade(scanner.nextInt());
        
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        
        scanner.close();
    }
}