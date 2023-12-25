import java.util.Scanner;

public class Conditions {
    // true or false (input ) => boolean (output) logical operators
    // primitive type can be used as input  => boolean  (conditional operators )
    // arithmetic operator =>(number )input  => (number)(output)

    // if -else

    public static void main(String[] args) {
        
        // Q => three sides of triangle you hv to take i  as input 
        // check if triangle can be formed (sum of two sides >third )
        // scalene(all sides are different in size) 
        // equilateral, isosceles trianglw

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b)>c && (a+c)>b && (c+b)>a){

            if(a==b && b==c){
                System.out.println("equilateral");
            }
            else if(a!=b && b!=c && c!=a){
                System.out.println("scalene");
            }
            else{
                System.out.println("isosceles");
            }


        }
        else{
            System.out.println("triangle is not formed");
        }



        // Scanner sc  = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sc.nextLine();
        // String s = sc.nextLine();
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(s);
        // int i = sc.nextInt();
        // next() "spacr or next line"
        // String s = sc.nextLine();
        // System.out.println(s);

        // int num =92;

        // num %3
        // Q=> remainder =0 add number by 10
        //  remainder =1 add num by 20 
        // remainder =2 add num 30

        // if(num%3 ==0){
        //     num =num+10;
        // }
        // else if(num %3 ==1){
        //     num=num+20;
        // }
        // else {
        //     num =num+30;
        // }
        // System.out.println(num);

        // if(num % 2  == 0){
        //     System.out.println("number is odd");
        // }
        // else{
        //     System.out.println("number is even");
        // }
    }
}
