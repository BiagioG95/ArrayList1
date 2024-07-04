import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Biagio", 28));
        students.add(new Student("Mario", 25));
        students.add(new Student("Luigi", 22));
        students.add(new Student("Carla", 30));


        for (Student student : students) {
            System.out.println("Gli Studenti sono: " + student);
        }
    }
}