import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String input; int r;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            input = st.nextToken();
            for(int j = 0; j < input.length(); j++) {
                for(int k = 0; k < r; k++) {
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
