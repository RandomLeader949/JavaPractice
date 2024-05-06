import java.util.Scanner;
public class quickSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int i = 1;
        int answer = 0;
        while(i <= n){
            answer += i;
            i++;
        }
        System.out.println(String.valueOf(answer));
    }
}