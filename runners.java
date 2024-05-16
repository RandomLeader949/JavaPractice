import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class runners {
    public static void main(String[] args) throws IOException{

    FileReader fr = new FileReader("runners.txt");
        Scanner in = new Scanner(fr);
        String num;
        num = in.nextLine();
        String[] arrOfStr = num.split(" ", 4);
        for (String a : arrOfStr){
            System.out.println(a);
    }
    }
}
