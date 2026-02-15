import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tmp, result = 0;
        for(int i = 0; i < N; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if(tmp!=1 && prime(tmp)) result++;
        }
        System.out.print(result);
    }
    private static boolean prime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
