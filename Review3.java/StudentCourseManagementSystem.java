import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {

    int studentId;
    String studentName;
    String enrolledCourse;
    double marks;

    Student(int studentId, String studentName,
            String enrolledCourse, double marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
        this.marks = marks;
    }

    public void displayStudent() {

        System.out.println("--------------------------------");
        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + studentName);
        System.out.println("Course         : " + enrolledCourse);
        System.out.println("Marks          : " + marks);
    }
}

public class StudentCourseManagementSystem {

    static ArrayList<Student> studentList = new ArrayList<>();

    public static void addStudent(
            int id,
            String name,
            String course,
            double marks) {

        Student student =
                new Student(id, name, course, marks);

        studentList.add(student);

        System.out.println("Student Added Successfully.");
    }

    public static void removeStudent(int id) {

        boolean found = false;

        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.get(i).studentId == id) {

                studentList.remove(i);

                found = true;

                System.out.println("Student Removed Successfully.");

                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void updateMarks(
            int id,
            double newMarks) {

        boolean found = false;

        for (Student student : studentList) {

            if (student.studentId == id) {

                student.marks = newMarks;

                found = true;

                System.out.println("Marks Updated Successfully.");

                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void searchStudentByName(String name) {

        boolean found = false;

        for (Student student : studentList) {

            if (student.studentName.equalsIgnoreCase(name)) {

                student.displayStudent();

                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void sortStudentsByMarks() {

        Collections.sort(
                studentList,
                new Comparator<Student>() {

                    @Override
                    public int compare(
                            Student s1,
                            Student s2) {

                        return Double.compare(
                                s2.marks,
                                s1.marks);
                    }
                });

        System.out.println("Students Sorted By Marks.");
    }

    public static void displayToppers() {

        if (studentList.isEmpty()) {

            System.out.println("No Students Available.");
            return;
        }

        double highestMarks = studentList.get(0).marks;

        for (Student student : studentList) {

            if (student.marks > highestMarks) {

                highestMarks = student.marks;
            }
        }

        System.out.println("\n===== TOPPERS =====");

        for (Student student : studentList) {

            if (student.marks == highestMarks) {

                student.displayStudent();
            }
        }
    }

    public static void displayAllStudents() {

        if (studentList.isEmpty()) {

            System.out.println("No Students Available.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : studentList) {

            student.displayStudent();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== STUDENT COURSE MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Search Student By Name");
            System.out.println("5. Sort Students By Marks");
            System.out.println("6. Display Toppers");
            System.out.println("7. Display All Students");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    addStudent(id, name, course, marks);

                    break;

                case 2:

                    System.out.print("Enter Student ID To Remove: ");
                    int removeId = scanner.nextInt();

                    removeStudent(removeId);

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = scanner.nextDouble();

                    updateMarks(updateId, newMarks);

                    break;

                case 4:

                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String searchName = scanner.nextLine();

                    searchStudentByName(searchName);

                    break;

                case 5:

                    sortStudentsByMarks();

                    displayAllStudents();

                    break;

                case 6:

                    displayToppers();

                    break;

                case 7:

                    displayAllStudents();

                    break;

                case 8:

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 8);

        scanner.close();
    }
}