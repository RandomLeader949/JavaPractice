import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class multiLineReader {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("multiLineReader.txt");
        Scanner in = new Scanner(fr);
        String first;
        first = in.nextLine();
        System.out.println(first);
        String second;
        second = in.nextLine();
        System.out.println(second);
    }
}
