import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;
        int H, W, N;
        int output;
        input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            output = 0;

            if(N%H==0) {
                output += 100*H;
                output += N/H;
            } else {
                output += 100*(N%H);
                output += 1 + N/H;
            }

            System.out.println(output);
        }


    }
}
