// package Collections;

public class StudentData implements Comparable<StudentData> {
    public String name;
    public int age;
    public String studentId;
    public String branch;

    public StudentData(String name, int age, String studentId, String branch) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.branch = branch;
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------------------------");
        return "StudentData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", branch='" + branch + '\'' +
                '}';
        // System.out.println("-----------------------------------------------------");
    }

    @Override
    public int compareTo(StudentData t) {
        // return t.studentId.compareTo(this.studentId);
        return this.studentId.compareTo(t.studentId);
    }

}