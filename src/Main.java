public class Main {

    public static void main(String[] args) {

        // Create students
        Student s1 = new Student("Alice Brown", "S001", "CS");
        Student s2 = new Student("Bob Smith", "S002", "CS");
        Student s3 = new Student("Charlie Lee", "S003", "SE");
        Student s4 = new Student("Diana White", "S004", "CS");
        Student s5 = new Student("Ethan Black", "S005", "SE");

        // Update GPA and credits
        s1.updateGPA(3.8); s1.addCredits(90);
        s2.updateGPA(3.2); s2.addCredits(70);
        s3.updateGPA(3.9); s3.addCredits(100);
        s4.updateGPA(2.9); s4.addCredits(60);
        s5.updateGPA(3.6); s5.addCredits(85);

        // Print students
        Student[] arr = {s1, s2, s3, s4, s5};
        for (Student s : arr) {
            System.out.println(s);
        }

        // Course
        Course course = new Course("Object-Oriented Programming", "Dr. Johnson", 5);
        for (int i = 0; i < arr.length; i++) {
            course.addStudent(arr[i], i);
        }

        System.out.println("\nCourse Info:");
        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Top Credits Student: " + course.highestCreditStudent());

        // Part 2
        System.out.println("\nTop GPA Student: " + getTopStudent(arr));
        System.out.println("Honors Students Count: " + countHonors(arr));
        System.out.println("Total Credits: " + totalCredits(arr));
    }

    // Part 2 methods
    public static Student getTopStudent(Student[] arr) {
        Student top = null;
        for (Student s : arr) {
            if (top == null || s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            sum += s.getCredits();
        }
        return sum;
    }
}
