import java.util.*;

public class StudentMain {
        public static void main(String[] args) {
                StudentData student1 = new StudentData("Alice", 20, "S001", "Computer Science");
                StudentData student2 = new StudentData("Bob", 22, "S002", "Mechanical Engineering");
                StudentData student3 = new StudentData("Charlie", 21, "S003", "Electrical Engineering");
                StudentData student4 = new StudentData("David", 23, "S004", "Civil Engineering");
                StudentData student5 = new StudentData("Eve", 20, "S005", "Computer Science");
                StudentData student6 = new StudentData("Frank", 22, "S006", "Mechanical Engineering");
                StudentData student7 = new StudentData("Grace", 21, "S007", "Electrical Engineering");

                LinkedHashSet<StudentData> List = new LinkedHashSet<>();
                List.add(student1);
                List.add(student2);
                List.add(student3);
                List.add(student4);

                // Collections.sort(List);
                // Collections.sort(List, new SortByAge());
                // Collections.sort(List, new SortbyId());

                for (StudentData student : List) {
                        System.out.println(student);
                }

                // Scanner sc = new Scanner(System.in);
                // String name = sc.nextLine();
                // int max = 0;
                // for (StudentData student : List) {
                // if (student.name.equalsIgnoreCase(name)) {

                // System.out.println("-----------------------------------------------------");
                // }

                // }

                TreeSet<StudentData> treeList = new TreeSet<>();
                treeList.add(student1);
                treeList.add(student2);
                treeList.add(student3);
                treeList.add(student4);
                treeList.add(student5);
                treeList.add(student6);
                treeList.add(student7);

                // for (StudentData student : treeList) {
                // System.out.println(student);
                // }

        }
}
