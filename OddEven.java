import java.util.*;
class OddEven{
    public static void myprogram() {
        Scanner sc = new Scanner(System.in);
        int odd_num = 0;
        int even_num = 0;
        System.out.println("Welcome to EvenOdd Counter Program.\n");
        System.out.print("Enter Array Size: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter the numbers: ");
        
        for(int i=0; i<arr_size; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr_size; i++){
            if (arr[i]%2 == 0){
                even_num += 1;
            }
            else{
                odd_num += 1;
            }
        }
        System.out.println("Odd Num: "+ odd_num);
        System.out.println("Even Num: "+ even_num);


    }
}
