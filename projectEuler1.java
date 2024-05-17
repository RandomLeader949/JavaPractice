//https://projecteuler.net/problem=1

import java.io.IOException;
public class projectEuler1 {
    public static void main(String[] args) throws IOException{
        int end = 1000;
        int i = 0;
        for(int q = 0; q < end; q++){
            if(q%3 == 0){
                i += q;
            }
            else if(q%5 == 0){
                i += q;
            }
        }
        System.out.println(String.valueOf(i));
    }
}