import java.util.Comparator;

public class SortbyId implements Comparator<StudentData> {
    @Override
    public int compare(StudentData student1, StudentData student2) {
        return student1.name.compareTo(student2.name);
    }
}
