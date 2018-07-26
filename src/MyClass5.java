import java.util.Scanner;

public class MyClass5 {

    public static void main(String[] args) {


        System.out.println("Enter the number of elements:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];//array size
         System.out.println("Enter the  elements:");


        for (int i = 0; i <n; i++) {
            arr[i] = s.nextInt();//array input
        }

        System.out.println("output=\n");
        for (int i = 0; i <n; i++)



                System.out.println(arr[i]);



        }
    }



