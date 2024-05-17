import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("fibonacci.txt");
        Scanner in = new Scanner(fr);
        int num;
        num = in.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        for(int i = 0; i < num; i++){
            System.out.println(String.valueOf(prev1));
            prev1 += prev2;
            System.out.println(String.valueOf(prev2));
            prev2 += prev1;
        }
    }
}
