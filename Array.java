public class Array {
    public static void main(String[] args) {
        
        // array is collection of similar type of data

        //datatype nameof array = size

        // int arr[] = new int[5];

        // int student1=90;
        // int student2 =80;
        // int student3 =70;

        // int marks[] = new int[5];//0 
        // marks[0] =40;
        // marks[1]=33;
        // marks[2] = 50;
        // marks[3]=74;
        // marks[4] = 60;



        // Q:minimum value inside the array
        // int []arr = {10,34,67,43,12,46};

        // int min  = Integer.MAX_VALUE;
        // for(int i =0 ;i<arr.length ;i++){
        //     if(arr[i]<min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println(min);

        // Q:maximum number inside the array
        // int []arr = {10,34,67,43,12,46};

        // int max  = Integer.MIN_VALUE;
        // for(int i =0 ;i<arr.length ;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        // Q:sort the array

        int arr[] = {2,6,3,8,5,3,7,9,2,5,8};

        // cycles 
        for(int i =1 ; i<arr.length;i++ ){
            // comparisions
            for(int j =0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+"  ");
        }

        // [7,13,67,4,9,2,5] //67,9,5


        // int sum = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        // int sum=0;
        // for(int i=0;i<marks.length ; i++){
        //     sum =sum +marks[i];
        // }
        // System.out.println(sum);

        // int sum =1;

        // for(int i = 0 ; i<marks.length;i++){
        //     if(marks[i]%5 ==0 ){
        //         sum =sum*marks[i];
        //     }

        // }
        // System.out.println(sum);

        // DRY =>dont repeat yourself

        // for(int i =0;i < marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);



    }
}
