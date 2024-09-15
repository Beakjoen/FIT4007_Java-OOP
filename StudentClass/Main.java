package StudentClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass(12345, "John Doe", 8.5f, 7.5f);
        StudentClass student2 = new StudentClass(67890, "Jane Smith", 9.0f, 8.0f);
        StudentClass student3 = new StudentClass();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID for student3: ");
        student3.setStudentId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter name for student3: ");
        student3.setName(scanner.nextLine());

        System.out.println("Enter theory score for student3: ");
        student3.setTheoryScore(scanner.nextFloat());

        System.out.println("Enter practice score for student3: ");
        student3.setPracticeScore(scanner.nextFloat());

        System.out.printf("%-10s %-30s %10s %10s %10s\n", "Student ID", "Name", "Theory", "Practice", "Average");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        scanner.close();
    }
}
