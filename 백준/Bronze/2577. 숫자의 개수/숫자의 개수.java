import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input=1;
        for(int i = 0; i <3; i++) {
            input*=Integer.parseInt(br.readLine());
        }

        int[] output = {0,0,0,0,0,0,0,0,0,0};
        while(true) {
            output[input%10]++;
            input/=10;
            if(input < 10) {
                output[input]++;
                break;
            }
        }
        for(int i = 0; i <output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
