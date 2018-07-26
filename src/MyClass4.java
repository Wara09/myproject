import java.util.Scanner;

public class MyClass4 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
       int userInput=sc.nextInt();


        switch(userInput)
        {
            case 7:
                System.out.println("Go to varsity bus");
        break;

            case 8:
                System.out.println("Go to local bus from AK khan");
                break;

            case 9:
                System.out.println("Go to local bus from vatiary");
                break;

            default:
                System.out.println("wrong time");
                break;
        }
    }
}
