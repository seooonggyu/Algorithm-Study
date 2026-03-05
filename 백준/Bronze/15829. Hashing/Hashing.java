import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;
        long tmp = 1;
        for (int i = 0; i < N; i++) {
            result = (result + (input.charAt(i) - 'a'+1) * tmp) %1234567891;
            tmp = tmp * 31 %1234567891;
        }


        System.out.println(result);
    }
}
