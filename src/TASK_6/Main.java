package TASK_6;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nina", "Tomsen", "Group17", 4.5);
        Aspirant aspirant = new Aspirant("Amir", "Murat", "Group15", 5.0, "Research on AI");

        int studentScholarship = student.getScholarship();
        int aspirantScholarship = aspirant.getScholarship();

        System.out.println("Student Scholarship: $" + studentScholarship);
        System.out.println("Aspirant Scholarship: $" + aspirantScholarship);
    }
}

