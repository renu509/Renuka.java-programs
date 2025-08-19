import java.util.Scanner;
class SchoolDetails {
    private String studentName;
    private int marks;
    private String grade;
    public void setStudentName(String name) {
        this.studentName = name;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setMarks(int marks) {
        this.marks = marks;
        calculateGrade();
    }
    public int getMarks() {
        return marks;
    }
    private void calculateGrade() {
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }
    }
    public String getGrade() {
        return grade;
    }
}
class College {
    private String studentDetails;
    private String facultyDetails;
    private double attendance;
    private double cgpa;
    public void setStudentDetails(String details) {
        this.studentDetails = details;
    }
    public String getStudentDetails() {
        return studentDetails;
    }
    public void setFacultyDetails(String details) {
        this.facultyDetails = details;
    }
    public String getFacultyDetails() {
        return facultyDetails;
    }
    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
    public double getAttendance() {
        return attendance;
    }
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
    public double getCGPA() {
        return cgpa;
    }
}
public class college {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolDetails school = new SchoolDetails();
        College college = new College();
        System.out.println("Enter School Details");
        System.out.print("Enter Student Name: ");
        school.setStudentName(sc.nextLine());
        System.out.print("Enter Marks: ");
        school.setMarks(sc.nextInt());
        sc.nextLine();
        System.out.println("\n Enter College Details");
        System.out.print("Enter Student Details: ");
        college.setStudentDetails(sc.nextLine());
        System.out.print("Enter Faculty Details: ");
        college.setFacultyDetails(sc.nextLine());
        System.out.print("Enter Attendance Percentage: ");
        college.setAttendance(sc.nextDouble());
        System.out.print("Enter CGPA: ");
        college.setCGPA(sc.nextDouble());
        System.out.println("\n===== School Details =====");
        System.out.println("Student Name: " + school.getStudentName());
        System.out.println("Marks: " + school.getMarks());
        System.out.println("Grade: " + school.getGrade());
        System.out.println("\n===== College Details =====");
        System.out.println("Student Details: " + college.getStudentDetails());
        System.out.println("Faculty Details: " + college.getFacultyDetails());
        System.out.println("Attendance: " + college.getAttendance() + "%");
        System.out.println("CGPA: " + college.getCGPA());

        sc.close();
    }
}
