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
        String miles = "0";
        String pace1 = "0";
        String pace2 = "0";
        String amountOfTimes = "0";
        for (String a : arrOfStr){
            if(miles == "0"){
                miles = a;
            }
            else if(miles != "0" && pace1 == "0"){
                pace1 = a;
            }
            else if(miles != "0" && pace1 != "0" && pace2 == "0"){
                pace2 = a;
            }
            else if(miles != "0" && pace1 != "0" && pace2 != "0" && amountOfTimes == "0"){
                amountOfTimes = a;
            }
        }
        for(int p = 0; p < Double.parseDouble(amountOfTimes); p++){
            
        }
    }
}
