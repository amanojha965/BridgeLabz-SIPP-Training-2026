import java.util.Comparator;

public class SortByAge implements Comparator<StudentData> {
    @Override
    public int compare(StudentData student1, StudentData student2) {
        // return Integer.compare(student1.age, student2.age);
        return student1.age - student2.age;
    }
}
