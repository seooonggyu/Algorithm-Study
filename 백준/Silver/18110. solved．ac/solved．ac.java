import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n==0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int m = (int) Math.round(n*0.15);
        int sum = 0;
        for(int i=m; i<n-m; i++) {
            sum += arr[i];
        }

        int result = (int) Math.round((double) sum / (n-2*m));
        System.out.println(result);
    }
}