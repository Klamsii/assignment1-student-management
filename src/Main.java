public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Alice Johnson", "S001", "Computer Science");
        Student s2 = new Student("Bob Smith", "S002", "Mathematics");
        Student s3 = new Student("Carol White", "S003", "Engineering");
        Student s4 = new Student("David Lee", "S004", "Biology");
        Student s5 = new Student("Eva Brown", "S005", "Physics");

        s1.updateGPA(3.8); s1.addCredits(45);
        s2.updateGPA(3.2); s2.addCredits(60);
        s3.updateGPA(3.9); s3.addCredits(75);
        s4.updateGPA(2.9); s4.addCredits(30);
        s5.updateGPA(3.6); s5.addCredits(90);

        Student[] students = {s1, s2, s3, s4, s5};

        for (Student s : students) {
            System.out.println(s);
        }

        Course course = new Course("Object-Oriented Programming", "Dr. Miller", 5);
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        System.out.println("\n" + course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest Credit Student: " + course.highestCreditStudent());

        System.out.println("\nTop Student: " + getTopStudent(students));
        System.out.println("Honors Count: " + countHonors(students));
        System.out.println("Total Credits: " + totalCredits(students));
    }

    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];
        for (Student s : arr) {
            if (s.getGpa() > top.getGpa()) {
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
