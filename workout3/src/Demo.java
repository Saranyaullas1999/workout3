import p1.Faculty;
import p1.Student;
public class Demo {
    public static void main(String[] args) {
        Faculty p1f1 = new Faculty(178,"Mathematics");
        Student p1s1 = new Student("Sneha",89,5);

        p2.Faculty p2f2 = new p2.Faculty(789,"Hindi");
        p2.Student p2s2 = new p2.Student("Jolvin",43,4);

        p1f1.display();
        p1s1.display();
        p2f2.display();
        p2s2.display();
    }
}
