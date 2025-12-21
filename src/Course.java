/**
 * Represents a course that contains multiple students.
 * Demonstrates composition (Course HAS-A Student).
 */
public class Course {

    // Course information
    private String courseName;
    private String instructor;

    // Array of Student objects
    private Student[] students;

    /**
     * Constructor initializes course details and student array.
     */
    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    /**
     * Adds a student to the course at a specific index.
     * Includes bounds checking to prevent errors.
     */
    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        }
    }

    /**
     * Calculates the average GPA of enrolled students.
     * Ignores null array positions.
     */
    public double courseAverageGPA() {
        double total = 0;
        int count = 0;

        for (Student s : students) {
            if (s != null) {
                total += s.getGpa();
                count++;
            }
        }
        return count == 0 ? 0.0 : total / count;
    }

    /**
     * Finds the student with the highest number of credits.
     * @return Student with maximum credits
     */
    public Student highestCreditStudent() {
        Student top = null;

        for (Student s : students) {
            if (s != null && (top == null || s.getCredits() > top.getCredits())) {
                top = s;
            }
        }
        return top;
    }

    /**
     * Returns a summary of the course.
     */
    @Override
    public String toString() {
        return "Course: " + courseName +
                "\nInstructor: " + instructor +
                "\nEnrolled Students: " + students.length;
    }
}
