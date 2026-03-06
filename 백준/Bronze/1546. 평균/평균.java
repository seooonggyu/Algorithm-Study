import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int tmpmax = -1;
        while(st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp > tmpmax) {tmpmax = tmp;}
            list.add(tmp);
        }

        double result;
        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += 100.0*list.get(i)/tmpmax;
        }
        result = sum/n;

        System.out.print(result);
    }
}
