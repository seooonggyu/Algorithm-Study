
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger[] gain = new BigInteger[36];
        Arrays.fill(gain, BigInteger.ZERO);

        BigInteger sum = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(36);

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            sum = sum.add(new BigInteger(s, 36));

            BigInteger place = BigInteger.ONE;
            for(int j=s.length()-1; j>=0; j--) {
                int num = Character.digit(s.charAt(j), 36);
                BigInteger diff = place.multiply(BigInteger.valueOf(35-num));
                gain[num] = gain[num].add(diff);
                place = place.multiply(base);
            }
        }

        int K = Integer.parseInt(br.readLine());
        Arrays.sort(gain, Collections.reverseOrder());

        for(int i=0; i<K; i++) {
            sum = sum.add(gain[i]);
        }

        System.out.println(sum.toString(36).toUpperCase());
    }
}
