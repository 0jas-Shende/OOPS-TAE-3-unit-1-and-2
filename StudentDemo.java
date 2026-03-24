// Problem 20: Student details stored in an array

class Student {
    String name;
    int rollNo;
    double marks;

    // Constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

// Main class with proper main method
public class StudentDemo {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = {
            new Student("yashika", 1, 99.5),
            new Student("ojas", 2, 77.0),
            new Student("Pushkar", 3, 77.5),
            new Student("Sharwani", 4, 88.0)
        };

        // Display details of all students
        System.out.println("Student List:");
        for (Student s : students) {
            s.displayDetails();
        }
    }
}


