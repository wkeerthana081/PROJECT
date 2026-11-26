import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String department;
    private int sub1, sub2, sub3;
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }
    public void setMarks(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    public int calculateTotal() {
        return sub1 + sub2 + sub3;
    }
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
    public String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90 && avg <= 100) {
            return "A+";
        } else if (avg >= 80) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }
    public String getResultStatus() {
        return calculateAverage() >= 50 ? "PASS" : "FAIL";
    }
    public void displayReport() {
        System.out.println("\n====== STUDENT REPORT ======");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + department);
        System.out.println("Total Marks  : " + calculateTotal());
        System.out.println("Average      : " + calculateAverage());
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("Result       : " + getResultStatus());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== STUDENT MANAGEMENT SYSTEM ======");
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Department: ");
        String dept = sc.next();
        Student student = new Student(id, name, dept);
        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        int m3 = sc.nextInt();
        student.setMarks(m1, m2, m3);
        student.displayReport();
        sc.close();
    }
}