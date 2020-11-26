import java.util.Scanner;

public class _01_Print_An_Integer {
    //print an integer getting input from user
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter an interger number:");
        int number=scanner.nextInt();
        System.out.println("The number is:"+number);
    }
}
