class Person{
    int height;
    int weight;
    int age;
    String name;

    Person(int height, int weight, int age, String name){
            this.height=height;
            this.weight= weight;
            this.age=age;
            this.name=name;
    }

    void walk(){
        System.out.println("i can walk");
    }
    void talk(){
        System.out.println("i can talk");
    }
}

class Employee extends Person{
    int salary;
    Employee(int salary, int height, int weight, int age, String name){
        // Employee(int, int , int ,int, String)
        super(weight, height, age,name);
        this.salary = salary;
        // this.height= height;
        // this.weight= weight;

    }
}



public class Inheritance {
    public static void main(String[] args) {
       
        Employee emp = new Employee(12000, 23,234,435,"reena");
        Person p = new Person(12,12,231,"reena");
        // System.out.println(p.);
    }
}





