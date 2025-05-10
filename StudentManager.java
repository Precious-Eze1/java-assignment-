import java.util.*;

public class StudentManager {
    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    static Map<String, Student> records = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Grade: ");
        int grade = sc.nextInt(); sc.nextLine();
        records.put(name, new Student(name, grade));
        System.out.println("Student added.");
    }

    public static void updateStudent() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        if (records.containsKey(name)) {
            System.out.print("New Grade: ");
            int grade = sc.nextInt(); sc.nextLine();
            records.get(name).grade = grade;
            System.out.println("Updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void viewAll() {
        if (records.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        for (Student s : records.values()) {
            System.out.println(s.name + " => " + s.grade);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add 2. Update 3. View 4. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> viewAll();
                case 4 -> System.exit(0);
            }
        }
    }
}