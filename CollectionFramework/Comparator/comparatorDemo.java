package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(21, "Ayush", 72));
        students.add(new Student(52, "Navneet", 69));
        students.add(new Student(26, "Piyush", 70));
        students.add(new Student(57, "Uday", 70));

        System.out.println("Before sorting on the basis of age : ");
        System.out.println(students);

        // Collections.sort(students, new Comparator<Student>() {

        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return o1.age - o2.age;
        //     }
        // });

       // Collections.sort(students, new AgeComparator());      //using separate Comparator class

       Collections.sort(students, (o1, o2) -> o1.age - o2.age);     //using Lambda Expression

        System.out.println("After Sorting on the sis of age : ");
        System.out.println(students);
        
    }
    
}

class Student{
    public int age;
    public String name;
    public int weight;

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }
}

class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student arg0, Student arg1) {
        return arg0.age - arg1.age;
    }

}
