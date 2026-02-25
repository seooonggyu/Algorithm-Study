import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int number;
        int sum;
        int result=0;

        for (int i = 0; i < input; i++) {
            number = i;
            sum = number;

            while(number!=0) {
                sum += number%10;
                number/=10;
            }
            if(sum==input) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}
