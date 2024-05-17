//
import java.io.IOException;

public class projectEuler2 {
    public static void main(String[] args) throws IOException{
        int prev1 = 0;
        int prev2 = 1;
        int i = 0;
        while (prev1 < 4000000 && prev2 < 4000000){
            System.out.println(String.valueOf(prev1));
            prev1 += prev2;
            if(prev1 % 2 == 0){
                i += prev1;
            }
            System.out.println(String.valueOf(prev2));
            prev2 += prev1;
            if(prev2 % 2 == 0){
                i += prev2;
            }
        }
        System.out.println(String.valueOf(i));
    }
}