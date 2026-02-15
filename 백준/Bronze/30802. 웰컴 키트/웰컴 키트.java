import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int tResult=0;
        int pResult1, pResult2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int n : list) {
            if(n%T==0) tResult = tResult + n/T;
            else tResult = tResult + n/T + 1;
        }

        int P = Integer.parseInt(st.nextToken());

        System.out.println(tResult);
        System.out.print(N/P + " " + N%P);
    }
}
