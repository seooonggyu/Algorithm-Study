import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[10001];
        for(int i = 0; i < N; i++) {
            array[Integer.parseInt(br.readLine())]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<array.length; i++) {
            while(array[i] > 0) {
                sb.append(i).append("\n");
                array[i]--;
            }
        }
        System.out.print(sb);
    }
}
