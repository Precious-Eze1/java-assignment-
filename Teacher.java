public class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Brown", 40, "Math");
        t.introduce();
        t.teach();
    }
}