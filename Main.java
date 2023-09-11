import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Student> generateListStudent() {
        List<Student> list = new ArrayList();
        list.add(new Student(1, "Nam", "Male", 20));
        list.add(new Student(2, "Nam1", "Male", 30));
        list.add(new Student(3, "Nam2", "Male", 40));
        list.add(new Student(4, "Nu", "Female", 22));
        list.add(new Student(5, "Nu1", "Female", 10));
        list.add(new Student(6, "Nu2", "Female", 50));

        list.add(new Student(7, "Student7", "Male", 18));
        list.add(new Student(8, "Student8", "Female", 19));
        list.add(new Student(9, "Student9", "Male", 20));
        list.add(new Student(10, "Student10", "Female", 21));
        list.add(new Student(11, "Student11", "Male", 22));
        list.add(new Student(12, "Student12", "Female", 23));
        list.add(new Student(13, "Student13", "Male", 24));
        list.add(new Student(14, "Student14", "Female", 25));
        list.add(new Student(15, "Student15", "Male", 26));
        list.add(new Student(16, "Student16", "Female", 27));
        list.add(new Student(17, "Student17", "Male", 28));
        list.add(new Student(18, "Student18", "Female", 29));
        list.add(new Student(19, "Student19", "Male", 30));
        list.add(new Student(20, "Student20", "Female", 31));
        list.add(new Student(21, "Student21", "Male", 32));
        list.add(new Student(22, "Student22", "Female", 33));
        list.add(new Student(23, "Student23", "Male", 34));
        list.add(new Student(24, "Student24", "Female", 35));
        list.add(new Student(25, "Student25", "Male", 36));
        list.add(new Student(26, "Student26", "Female", 37));

        return list;
    }

    private static List<Student> getMaleStudentsOver20(List<Student> students) {
        List<Student> filteredList = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals("Male") && student.getAge() > 20) {
                filteredList.add(student);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Student> allStudents = generateListStudent();
        List<Student> maleStudentsOver20 = getMaleStudentsOver20(allStudents);

        // In ra danh sách sinh viên nam và trên 20 tuổi
        for (Student student : maleStudentsOver20) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
