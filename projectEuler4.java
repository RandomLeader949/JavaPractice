import java.io.IOException;

public class projectEuler4 {
    public static void main(String[] args) throws IOException{
        int k = 909;
        int g = 0;
        int l = k;
        int i = 0;
        while(l > 0){
            g *= 10;
            g += l%10;
            l -= l%10;
            l /= 10;
        }
        if(k == g){
            System.out.println("ok");
        }
        else{
            System.out.println("no");
        }
    }        
}
