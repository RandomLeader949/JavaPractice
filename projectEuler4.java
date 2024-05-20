import java.io.IOException;

public class projectEuler4 {
    public static void main(String[] args) throws IOException{
        int a = 999;
        int b = 999;
        int forward = a * b;
        int reduce = forward;
        int backward = 0;
        while(reduce > 0){
            backward *= 10;
            backward += reduce % 10;
            reduce -= reduce % 10;
            reduce /= 10;
        }
        System.out.println(String.valueOf(forward));
        System.out.println(String.valueOf(backward));
        while(backward != forward){
 
                b--;
                System.out.println(String.valueOf(forward) + ":" + backward);
                forward = a * b;
                reduce = forward;
                backward = 0;
                while(reduce > 0){
                    backward *= 10;
                    backward += reduce % 10;
                    reduce -= reduce % 10;
                    reduce /= 10;
                }

        }
        System.out.println(String.valueOf(forward));
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
    }        
}
