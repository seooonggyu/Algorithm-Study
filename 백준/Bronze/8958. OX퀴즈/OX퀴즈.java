import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result, howmany;
        for(int i = 0; i < n; i++) {
            String tmp = br.readLine();
            result = 0; howmany = 1;
            for(int j = 0; j < tmp.length(); j++) {
                if(tmp.charAt(j) == 'O') {
                    result += howmany;
                    howmany++;
                } else {
                    howmany=1;
                }
            }
            System.out.println(result);
        }
    }
}