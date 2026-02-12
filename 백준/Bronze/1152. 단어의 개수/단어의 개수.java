
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;

        if(input.length()==1) {
            if(input.charAt(0)!=' ') {count++;}
        } else {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) != ' ') {
                    if(i==0){
                        count++;
                    } else {
                        if (input.charAt(i - 1) == ' ') {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
