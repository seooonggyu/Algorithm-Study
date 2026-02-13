import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a,b,c, tmp;
        boolean check = true;
        while(check) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a+b+c==0) check = false;
            if(check) {
                if(a>=b && a>=c) {
                    tmp=a;
                    a=c;
                    c=tmp;
                } else if(b>=a && b>=c) {
                    tmp=b;
                    b=c;
                    c=tmp;
                }
                if(c*c==(a*a+b*b)) System.out.println("right");
                else System.out.println("wrong");
            }
        }
    }
}