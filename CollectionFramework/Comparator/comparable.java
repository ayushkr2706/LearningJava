package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable {
    
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(21, "Ayush" , 72));
        students.add(new Student(57, "Uday", 70));
        students.add(new Student(26, "Piyush", 70));
        students.add(new Student(52, "Navneet", 69));

        System.out.println(students);
        System.out.println();
        Collections.sort(students);
        System.out.println(students);
        
    }
}

class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student that) {
      
        //Define the sorting logic
        if(this.weight == that.weight){
            return this.name.compareTo(that.name);
        }
        return this.weight - that.weight;

    }

}
