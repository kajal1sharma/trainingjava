// functions with same name but different signatures => function overloading
 abstract class Person1{
    String name;
    int age;
    int salary;
    Person1(int salary){
        this.salary = salary;
    }


     abstract void MySalary();


    void getInfo(){//getInfo()
        System.out.println(name);
    }
    void getInfo(int i){//getInfo(int)
        System.out.println(name);
        System.out.println(age);
    }
    void getInfo(float f){//getInfo(float)
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class Doctor extends Person1{
   
    Doctor(int salary){
        super(salary);
    }
    void MySalary(){

        System.out.println(salary+10000);
    }
}
class Teacher extends Person1{
    Teacher(int salary){
        super(salary);
    }
    void MySalary(){
        System.out.println(salary+20000);
    }
}

// functions with same signature but different definitions in different classes 
// overriding 

public class AbstractKey {
    public static void main(String[] args) {

        Person1 obj = new Doctor(60000);
        // overloading => compile
        // overriding => runtime
        // Person1 p = new Person1(10000);
        // p.MySalary();
        // Doctor d = new Doctor(10000);
        // d.MySalary();


        // Person1 p2 = new Doctor(70000);
        // //runtime binding
        // p2.MySalary();

        // Person1 p = new Person1(20000);
        // p.getInfo();
        // System.out.println("======================");
        // p.getInfo(0);
        // System.out.println("======================");
        // p.getInfo(0.0f);
        // Doctor d = new Doctor(20000);
        // Teacher t = new Teacher(20000);
        // p.MySalary();
        // d.MySalary();
        // t.MySalary();
    }
       
}
