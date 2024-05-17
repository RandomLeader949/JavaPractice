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
        int complete = 0;
        double d1 = 0;
        boolean d1d = true;
        while(complete < Double.parseDouble(amountOfTimes)){
            if(d1d == true){
                if(d1 + Double.parseDouble(pace1) <= Double.parseDouble(miles)){
                    d1 += Double.parseDouble(pace1);
                }
                else{
                    double last = (Double.parseDouble(miles) - (d1 + Double.parseDouble(pace1)));
                    double last1 = Double.parseDouble(pace1) - last;
                    d1 += last;
                    d1 -= last1;
                    d1d = false;
                }
            }
            if(d1d == false){
                if(d1 - Double.parseDouble(pace1) <= 0){
                    d1 -= Double.parseDouble(pace1);
                }
                else{
                    double last = (0 - (d1 + Double.parseDouble(pace1)));
                    double last1 = Double.parseDouble(pace1) - last;
                    d1 -= last;
                    d1 += last1;
                    d1d = true;
                }
            }
            System.out.println(String.valueOf(d1));
            complete++;
        }
    }
}
