import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        double result = 0;

        for (int i = 0; i < N; i++) {
            result = (result + (input.charAt(i) - 96) * Math.pow(31, i));
        }

        System.out.println((int)result);
    }
}
