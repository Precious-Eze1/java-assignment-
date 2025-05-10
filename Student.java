public class Student {
    private String name;
    private String matricNo;
    private double score;
    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }
    public void displayInfo() {
        System.out.println(name + ", " + matricNo + ", Score: " + score);
    }
    public static void main(String[] args) {
        Student s = new Student("Alice", "U123", 85.0);
        s.displayInfo();
    }
}