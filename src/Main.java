public class Main {

    public static void main(String[] args) {

        // Student list
        Student student_first = new Student("Alice Brown", "S001", "CS");
        Student student_second = new Student("Bob Smith", "S002", "CS");
        Student student_third = new Student("Orazbai Baytzhan", "S003", "SE");
        Student student_four = new Student("Diana White", "S004", "CS");
        Student student_five = new Student("Ethan Black", "S005", "SE");

        // GPA and credits
        student_first.updateGPA(3.8); student_first.addCredits(90);
        student_second.updateGPA(3.2); student_second.addCredits(70);
        student_third.updateGPA(3.9); student_third.addCredits(100);
        student_four.updateGPA(2.9); student_four.addCredits(60);
        student_five.updateGPA(3.6); student_five.addCredits(85);

        Student[] arr = {student_first, student_second, student_third, student_four, student_five};
        for (Student s : arr) {
            System.out.println(s);
        }


        Course course = new Course("Object-Oriented Programming", "Aidana Aidynkyzy", 5);
        for (int i = 0; i < arr.length; i++) {
            course.addStudent(arr[i], i);
        }

        System.out.println("\nCourse Info:");
        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Top Credits Student: " + course.highestCreditStudent());


        System.out.println("\nTop GPA Student: " + getTopStudent(arr));
        System.out.println("Honors Students Count: " + countHonors(arr));
        System.out.println("Total Credits: " + totalCredits(arr));
    }


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
