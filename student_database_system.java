package student_database_system;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.print("\nEnter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numofstudents = in.nextInt();
        Student[] students = new Student[numofstudents];

        for (int n = 0; n < numofstudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numofstudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
