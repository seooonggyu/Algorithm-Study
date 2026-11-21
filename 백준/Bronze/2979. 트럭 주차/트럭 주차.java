
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] parking = new int[101];

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j=start; j<end; j++) {
                parking[j]++;
            }
        }

        int total = 0;

        for (int i=1; i<=100; i++) {
            if (parking[i] == 1) {
                total += A;
            } else if (parking[i] == 2) {
                total += 2 * B;
            } else if (parking[i] == 3) {
                total += 3 * C;
            }
        }

        System.out.println(total);
    }
}
