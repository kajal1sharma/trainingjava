public class Function2 {
    // call stack

    // static public int doSomethingEvenMore(){
    //     System.out.println("line 5");
    //     System.out.println("line 6");
    //     return 10;
    // }
    // static public int doSomethingMore(){
    //     System.out.println("line 3");
    //     int result = doSomethingEvenMore();
       
    //     return result;
    // }
    // static public int doSomething(){
    //     System.out.println("line 1");
    //     return doSomethingMore();
    //     // System.out.println("line 2");

    // }
    // public static int addArr(int arr[]){
    //     int sum=0;
    //     for(int i =0;i<arr.length;i++){
    //        sum =sum+arr[i]; 
    //     }
    //     return sum;
    // }

    // public static int findDuplicate(int arr[]){

    //     for(int i =0;i<arr.length;i++){

    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 return arr[i];
    //             }
    //         }
    //     }
    //     return Integer.MIN_VALUE;
    // }

    // public static void sum1(int a, int b){
    //     int result = a+b;
    //     System.out.println(result);
    // }
    // public static void sum2(int a , int b , int c){
    //     int result = a+b+c;
    //     System.out.println(result);
    // }
    // public static void sum3(int a, int b, int c, int d){
    //     int result =a+b+c+d;
    //     System.out.println(result);
    // }

    public static void sum(String str, int count,int ...num){
        int sum=0;
        for(int i=0;i<num.length ;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
    public static void sumstr(int n , float r,String ...str){
        String res ="";
        for(int i=0;i<str.length;i++){
            res=res+str[i]+" ";
        }
        System.out.println(res);
    }
    public static void main(String[] args) {


        sum("reena",23);
        sum("rita",23,45,56,67);
        sumstr(23, 56.7f,"tina ","meena","ram", "abc");

        

        //  int arr[] ={1,2,3,4,5,67,78,8, 7,7};
        // int duplicate  = findDuplicate(arr);
        // System.out.println(duplicate);
        // int result = addArr(arr);
        // System.out.println(result);
        // int num= doSomething();
        // System.out.println(num);
    }
    
}
