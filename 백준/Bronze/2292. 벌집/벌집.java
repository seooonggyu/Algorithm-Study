import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result=0;
        int start=0;
        int end=start+1;
        while(true) {
            result++;
            if(input<=end && input>=start) {
                System.out.print(result);
                break;
            } else {
                start = end + 1;
                end = end + 6*result;
            }
        }
    }
}
