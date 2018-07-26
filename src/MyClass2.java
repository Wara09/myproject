import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int i = 1;
        while (i<=3)
        {
            System.out.println("output=" + userInput);
            i++;
        }
    }
}