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

        int r1=0, r2=0;
        
        int i = 1;
        do {
            if (A%i == 0 && B%i == 0) {
                r1 = i;
            }
            i++;
        } while (i <= A && i <= B);
        System.out.println(r1);

        int tmpa=A;
        int tmpb=B;
        while(tmpa!=tmpb) {
            if(tmpa > tmpb) {
                tmpb +=B;
            } else {
                tmpa +=A;
            }
        }
        System.out.print(tmpb);
    }
}
