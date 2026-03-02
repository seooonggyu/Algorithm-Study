import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> input = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            input.add(Integer.parseInt(st.nextToken()));
        }
        int tmp;
        int result = 0;
        for(int i = 0; i < input.size()-2; i++) {
            for(int j=i+1; j<input.size()-1; j++) {
                for(int k=j+1; k<input.size(); k++) {
                    tmp = input.get(i)+input.get(j)+input.get(k);
                    if(tmp == M) {
                        System.out.print(tmp);
                        return;
                    } else if(tmp < M) {
                        if(tmp > result) result = tmp;
                    }
                }
            }
        }
        System.out.print(result);
    }
}
