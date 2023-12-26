import java.util.Scanner;

//  if user will enter + - * /
public class Switch {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int d  = sc.nextInt();
        
        int a =90;
        int b =80;
        int result =0;
        switch(d%5){
            case 0+1 :result = a+b;
                        System.out.println(result);
                        break;
            case 2+2 :result = a-b;
                        System.out.println(result);
                        break;
            case 3+0 : result = a/b;
                        System.out.println(result);
                        break;
            case 4-2 : result = a*b;
                        System.out.println(result);
                        break;
            default : System.out.println("invalid Symbol");
        }

    }
}
