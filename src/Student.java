/**
 * Represents a student with academic information.
 * Demonstrates encapsulation using private fields and public methods.
 */
public class Student {

    // Private fields (data hiding)
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    /**
     * Constructor initializes name, id, and major.
     * GPA and credits are set to default values.
     */
    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Setter for student name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for student ID
    public String getId() {
        return id;
    }

    // Getter for student major
    public String getMajor() {
        return major;
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Getter for earned credits
    public int getCredits() {
        return credits;
    }

    /**
     * Adds earned credits to the student record.
     * Ensures credits added are positive.
     */
    public void addCredits(int c) {
        if (c > 0) {
            credits += c;
        }
    }

    /**
     * Updates the student's GPA.
     * GPA must be between 0.0 and 4.0.
     */
    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            gpa = newGPA;
        }
    }

    /**
     * Determines if the student qualifies for honors.
     * @return true if GPA is 3.5 or higher
     */
    public boolean isHonors() {
        return gpa >= 3.5;
    }

    /**
     * Returns a formatted string representing the student.
     */
    @Override
    public String toString() {
        return "Student{name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", credits=" + credits +
                '}';
    }
}
