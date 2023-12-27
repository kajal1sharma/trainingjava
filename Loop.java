import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

         int rep = 0;
        do{

            System.out.println("+,-,/,*");
            char ch =  sc.next().charAt(0);
            int a=90;
            int b=80;
            switch(ch){
                case '+': System.out.println(a+b);
                            break;
                case  '-':System.out.println(a-b);
                            break;
                default : System.out.println("invalid input");
            }

           
            System.out.println("do you want to calculate again(1 for yes)");
            rep =sc.nextInt();


        }while(rep==1);


       
        // switch =>calculator
       
        // ft =0 st =1 

        // 0, 1 , 1,2,3,5.....

        // do-while loop

        // do{
        //     // this
        // }while(condition)

        // int i=0;
        // do{
        //     System.out.println("hello world");
        //     i++;
        // }while(i<5);



        // int n =13;
        // int firstNumber  = 0;
        // int secondNumber =1;

        // System.out.println(firstNumber);
        // System.out.println(secondNumber);
        // for(int i =3 ; i<=n ;i++){
        //     int nextTerm =firstNumber + secondNumber;

        //     System.out.println(nextTerm);

        //     firstNumber = secondNumber;
        //     secondNumber =nextTerm;


        // }
        // 0,1,1,2,3,5,8,13,21;
        // loops  => 

        // DRY
        // iterator is used to build condition uopon
        // int i =100;
        // while(i<110){
        //     // logic
        //     System.out.println("hello world");

        //     i=i+2;
        // }

        // System.out.println("ok the end loop");

        // for(init; condition ; inc/dec)

        // for(int j =0 ; j<=10 ; j++){
        //     System.out.println(j);
        // }

        // int a =12;

        // boolean flag =false;//initially 

        // for(int div = 2 ; div<= a/2; div++ ){
        //     if(a%div==0){
        //         flag =true;
        //     }
        // }

        // if(flag==true){
        //     System.out.println("the number is not prime");
        // }
        // else{
        //     System.out.println("the number is prime");
        // }

        // number is prime or not
        // prime => 1 and number



        // System.out.println("hello world ");
        // System.out.println("hello world ");
        // System.out.println("hello world ");
        // System.out.println("hello world ");
        // System.out.println("hello world ");
    }
}
