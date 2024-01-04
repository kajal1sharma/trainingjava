import java.util.Scanner;

public class Function {


    //   public static void add()
    //     {
    //         Scanner sc= new Scanner(System.in);
    //         int a= sc.nextInt();
    //         int b=sc.nextInt();
    //         int sum=a+b;
    //         System.out.println(sum);
    //     }

    // function calculator => (int a, int b, symbol)

    // static public String juicer(int oranges, int kiwis){
    //     // int oranges =90;
    //     // int kiwis = 45;

    //     String s ="this is a juice of "+oranges+" oranges and "+kiwis+" kiwis";
    //     return s;
    // }

    //function => sumArr =>para => array
    //[12,23,34,45,56,7] => sum of all the element
    // public static int calculator(int num1 , int num2, char sym){
    //     int finalResult=0;
    //     switch(sym){
    //         case '+':finalResult = num1+num2;
    //                  break;
    //         case '-':finalResult = num1-num2;
    //                 break;
    //         case '*': finalResult = num1*num2;
    //                 break;
    //         case '/':finalResult =num1/num2;
    //                 break;
    //         default : finalResult =Integer.MIN_VALUE;
    //     }
    //     return finalResult;
    // }

    public static int sumArr(int []arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {//main function is called by JvM
        
        int brr[]={1,2,3,4,5,6,7,88};
        int result =sumArr(brr);
        System.out.println(result);

        // int result1 = calculator(10, 20, '+');
        // int result2 = calculator(30, 40, '-');
        // int result3 = calculator(10, 20, '*');
        // int result4 = calculator(30, 40, '/');

        // System.out.println(result1);
        // System.out.println(result2);
        // System.out.println(result3);
        // System.out.println(result4);
        // String juiceGlass1 =juicer(4,5);
        // System.out.println(juiceGlass1);
        // String juiceGlass2 = juicer(10,15);
        // System.out.println(juiceGlass2);
        // String juiceGlass3 = juicer(2,5);
        // System.out.println(juiceGlass3);

        // return type  and parameters



        // int a =10;
        // int b=90;
        // int sum =a+b;
        // System.out.println(sum);

        // add();//calling => execute the lines of the function
        // System.out.println("hello world");
        // System.out.println(".........logic");
        // add();
        // add();
        // add();

        // int c= 70;
        // int d =50;
        // int sum2 =c+d;
        // System.out.println(sum2);

    }
}
