package dataStructure;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {

    public static void main(String[] args) {
        final Student student1 = new Student(12);
        Student student2 = new Student(13);
        student1.age = 34; // 불변 객체로 만든다고 해도 참조를 통해 그 안의 값은 바꿀 수 있다!

        Student[] arr = new Student[]{student1,student2};

        // Comparable은 정렬에 있어서 정렬 기준을 부여하는 것이다. 오름차순 정렬하려면 그냥
        // 앞에꺼에서 뒤에꺼 빼주면 된다!
        Arrays.sort(arr,comp);

        for (Student student : arr) {
            System.out.println(student.toString());
        }
    }
        final String hello = "hello";
    static Comparator<Student> comp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    };
}
