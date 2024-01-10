
class Account2{
    String name = "rita";
    int amount = 100;
    int pin =1111;
    String type ="saving";
    // constructor names are same as class name
    // constructor doesnot return any value
    // multiple constructors in a class 
    Account2(){//Account()
        System.out.println("hello iam account default constructor");
    }
    Account2(String name,int pin ){
        // Account2(String, int)
        this.name =name;
       
        this.pin = pin;
        
    }
    Account2(String name, int amount, int pin , String type){
        // Account2(String, int, int, String)
        this.name =name;
        this.amount = amount;
        this.pin = pin;
        this.type =type;
    }

}


public class Constructor {
    public static void main(String[] args) {
        Account2 obj1 = new Account2("tina",1000,1234,"savings");
        System.out.println(obj1.name);
        System.out.println(obj1.amount);
        System.out.println(obj1.pin);
        System.out.println(obj1.type);
        System.out.println("========================");
        Account2 obj2 = new Account2("nitu", 6754);
        System.out.println(obj2.name);
        System.out.println(obj2.amount);
        System.out.println(obj2.pin);
        System.out.println(obj2.type);
    }
}
