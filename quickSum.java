import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class quickSum{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("quickSum.txt");
        Scanner in = new Scanner(fr);
        int num;
        num = in.nextInt();
        int end = 0;
        for(int i = 0; i <= num; i++){
            end += i;
        }
        System.out.println(String.valueOf(end));
    }
}