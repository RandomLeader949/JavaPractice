import java.util.Scanner;
public class print
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        System.out.println(String.valueOf(age));
    }
}