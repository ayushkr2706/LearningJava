package BasicJava;

public class staticKeyword {

    public static void main(String [] args){

        Student s1 = new Student("Ayush", 21, 19);
        //Student.college = "NSEC";
        Student s2 = new Student("Piyush", 26, 20);
        System.out.println(s1.name + " " + s1.age + " " + s1.rollNo + " " + Student.college);
        System.out.println(s2.name + " " + s2.age + " " + s2.rollNo + " " + Student.college);
    }
    
}

class Student{

    String name;
    int age;
    int rollNo;
    static String college;

    //Static Block  --> runs when the class is initialized.
    static{
        college = "NSEC, Garia";
    }

    public Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}
