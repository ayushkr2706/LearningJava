package OOPs.Constructors;

public class constructorOverloading {

    public static void main(String[] args) {
        

        Student s1 = new Student();    //Default Constructor
       // Student s2 = new Student("Ayush", 19, 21, "NSEC");
       // Student s3 = new Student(null);
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // System.out.println(s1.age);
        // System.out.println(s1.college);
        // System.out.println();
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        // System.out.println(s2.age);
        // System.out.println(s2.college);
        // System.out.println();
        System.out.println(s1.name + " " + s1.roll + " " + s1.age + " " + s1.college);
    }
    
}

 class Student{
        String name;
        int roll;
        int age;
        String college;

        public Student(){
            //No-Argument Constructor
            this("Unkown");
            System.out.println("First Constructor");
        }

        public Student(String name){
            //Parameterized Constructor
            //Constructor Chaining
            this(name, 0);  //used to call another constructor inside the same class
            System.out.println("Second Constructor");
        }

        public Student(String name, int roll){
            //Parameterized Constructor
            this(name, roll, 0);  //Constructor Chaining
            System.out.println("Third Constructor");
        }

        public Student(String name, int roll, int age){
            //Parameterized Constructor
            this(name, roll, age, "Unknown");    //Constructor Chaining
            System.out.println("Fourth Constructor");
        }

        public Student(String name, int roll, int age, String college){
            //Parameterized Constructor
            this.name = name;
            this.roll = roll;
            this.age = age;
            this.college = college;
            System.out.println("Fifth Constructor");
        }
    }
