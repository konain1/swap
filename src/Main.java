public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        swap(10,20);
        int [] arr = {1,2,3,4,5};
        revers2(arr);
    }

    public static void swap(int a , int b){
        int c;

        c = a;
        a = b;
        b = c;

//        System.out.println("a = " +a);
//        System.out.println("b = "+b);
    }

    public static void revers2(int [] arr){

        int i = 0;
        int j = arr.length-1;

        while(i < j ){
           int c ;

           c = arr[i];
           arr[i] = arr[j];
           arr[j] = c;

            i++;
            j--;
        }

        for (int k = 0; k < arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}