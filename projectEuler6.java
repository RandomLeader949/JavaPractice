import java.io.IOException;

public class projectEuler6 {
        public static void main(String[] args) throws IOException{
        long finalNum1 = 0;
        for(int i = 1; i <= 100; i++){
            finalNum1 += i*i;
        }
        long finalNum2 = 0;
        for(int i = 1; i <= 100; i++){
            finalNum2+=i;
        }
        finalNum2 *= finalNum2;
        System.out.println(finalNum2 -= finalNum1);
    }
}
