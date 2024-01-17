
abstract class Shape {

    abstract void getArea();
    abstract void getPara();
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius= radius;
    }
    @Override
    void getArea() {
        System.out.println("iam calculating area");
    }

    @Override
    void getPara() {
       
        System.out.println("iam calculating area");
    }
}


class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        //this points to the current 
        this.length = length;
        this.breadth =breadth;

    }

    @Override
    void getArea() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void getPara() {
        // TODO Auto-generated method stub
        
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Shape ref =new Circle(45);
        ref.getArea();
        ref.getPara();
        // 
        Circle obj1 = new Circle(12);
        obj1.getArea();
        obj1.getPara();

        Shape ref2 = new Rectangle(34, 23);
        ref2.getArea();
        ref2.getPara();
    }
}
