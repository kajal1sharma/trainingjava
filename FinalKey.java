
// class Circle1{
//    int radius;


// //    static final float PI =3.14f;
// //    static final float PI;
// //    static {
// //      PI = 22f/7f;
// //    }

// }

// class AccountHolders{
//     static String bank;//classloading 
//     // final String name ="neetu";

//     final String name;
//     AccountHolders(String name){
//         this.name =name;
//     }
//     int amount;
// }

// final classes cannot be inherited , final methods cannot be overridden , final properties can be initialized only once
// if static property is there then it can be initialized either directly or in the static block
// if non static property is ther then initialization can be done 
// directly or in the constructor

final class Shape1{

    final void  getArea(){
      System.out.println("this is the area of the shape");
    }
    void getParam(){
        System.out.println("this is the param of the shape");
    }
}

class Circle1 extends Shape1{

    //  void getArea(){
    //     System.out.println("this is area of circle");
    //  }
      @Override
      void getParam() {
          // TODO Auto-generated method stub
          System.out.println("iam para of circle");
      }

}

public class FinalKey {
    
}
