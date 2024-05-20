import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class SecondsToGo {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("SecondsToGoIn.txt");
        Scanner in = new Scanner(fr);
        String numbers;
        int hours = 0;
        int minutes = 0;
        numbers = in.nextLine();
        String[] nums = numbers.split(" ", 1);
        for (String a : nums)
            if(hours == 0){
                hours = Integer.parseInt(a);
            }
            else{
                minutes = Integer.parseInt(a);
            }
            int finalAnswer = ((hours*60)*60) + (minutes * 60);
            System.out.println(String.valueOf(finalAnswer));
    }
}