/**
 * Driver class for the Student Management System.
 * Handles program execution and data processing tasks.
 */
public class Main {

    /**
     * Returns the student with the highest GPA.
     */
    public static Student getTopStudent(Student[] arr) {
        Student top = null;

        for (Student s : arr) {
            if (s != null && (top == null || s.getGpa() > top.getGpa())) {
                top = s;
            }
        }
        return top;
    }

    /**
     * Counts how many students qualify for honors.
     */
    public static int countHonors(Student[] arr) {
        int count = 0;

        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the total credits earned by all students.
     */
    public static int totalCredits(Student[] arr) {
        int total = 0;

        for (Student s : arr) {
            if (s != null) {
                total += s.getCredits();
            }
        }
        return total;
    }

    /**
     * Main method: program entry point.
     */
    public static void main(String[] args) {

        // Create an array of Student objects
        Student[] students = new Student[5];

        // Instantiate students
        students[0] = new Student("Alice Smith", "S001", "CS");
        students[1] = new Student("Bob Jones", "S002", "Math");
        students[2] = new Student("Carol White", "S003", "Physics");
        students[3] = new Student("David Brown", "S004", "Engineering");
        students[4] = new Student("Emma Green", "S005", "Biology");

        // Update GPA and credits
        students[0].updateGPA(3.8);
        students[0].addCredits(45);

        students[1].updateGPA(3.2);
        students[1].addCredits(30);

        students[2].updateGPA(3.9);
        students[2].addCredits(60);

        students[3].updateGPA(2.9);
        students[3].addCredits(25);

        students[4].updateGPA(3.6);
        students[4].addCredits(50);

        // Print all student details
        for (Student s : students) {
            System.out.println(s);
        }

        // Create a course and add students
        Course course = new Course("Object-Oriented Programming", "Dr. Lee", 5);
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        // Display course information and calculations
        System.out.println("\n" + course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest Credit Student: " + course.highestCreditStudent());

        // Perform array processing tasks
        System.out.println("\nTop GPA Student: " + getTopStudent(students));
        System.out.println("Honors Students Count: " + countHonors(students));
        System.out.println("Total Credits Earned: " + totalCredits(students));
    }
}
