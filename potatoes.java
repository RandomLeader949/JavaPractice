import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class potatoes {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("potatoes.txt");
        Scanner in = new Scanner(fr);
        int amountofTimes;
        amountofTimes = in.nextInt();
        for(int i = 0; i < amountofTimes; i++){
            int newInteger;
            newInteger = in.nextInt();
            int size = 0;
                if(newInteger <= 2){

                    size = 2;
                }
                else if(newInteger <= 5){
                    size = 5;
                }
                else if(newInteger <= 10){
                    size = 10;
                }
                else if(newInteger <= 20){
                    size = 20;
                }
                else if(newInteger <= 40){
                    size = 40;
                }
                else{
                    size = 60;
                }
                System.out.println(String.valueOf(size) + " " + (size - newInteger));
        }
    }
}
