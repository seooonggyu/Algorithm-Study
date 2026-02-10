import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String tmp = br.readLine();

        for (int i = 0; i < n; i++) {
            sum += Character.getNumericValue(tmp.charAt(i));
        }


        System.out.print(sum);
    }
}