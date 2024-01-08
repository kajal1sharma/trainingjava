
class Person{
    int height;
    String name;
    int age;
    String phone;

    void walk(){
        System.out.println("i can walk");
    }
    void run(){
        System.out.println("i can run");
    }
    void eat(){
        System.out.println("i can eat");
    }
}

public class ClassObj {
    public static void main(String[] args) {
        Person ref = new Person();
        ref.eat();
        ref.run();
        ref.walk();
        ref.name="reena";
        ref.age=23;
        System.out.println(ref.name);
        System.out.println(ref.age);
    }
}









