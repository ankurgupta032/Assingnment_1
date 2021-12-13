//public class Ass1 {
//    public static void main(String[] args) {
//        int  arr1[]={10,20,30,40};
//        char arr2[]={'a','\u0061',97,'d'};
//
//        System.out.println(arr1.getClass().getName());
//        System.out.println(arr2.getClass().getName());
//    }
//}


//public class Ass1 {
//    public static void value(int arr[]) {
//    for(int i: arr){
//        System.out.println(i);
//         }
//    }
//    public static void main(String[] args) {
//        value(new int[] {12,13,14});
//    }
//}


public class Ass1 {
    public static void value(int arr[]) {
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr1[]=new int[4];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = 67;
        }
        value(arr1);
    }
}

















