public class TernaryOperator {
    public static void main(String[] args) {
        
        // operand1() ? operand 2 : operand 3

        // nesting inside ternary operator 
        // a<b then (check if a is odd or even ) else (check if b is multiple of 3 or not )
       int a =100;
       int b =20;

    //    int result1 = a+b;
       int result = a<b ?a+b : a-b;
       System.out.println(result);

    }
}
