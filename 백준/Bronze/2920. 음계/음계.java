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
        int check = -1; //0 mix, 1 asc, 2 des
        int prevCheck = -1;

        List<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0; i<list.size()-1; i++) {
            if(check == 0) break;
            if(list.get(i) < list.get(i+1) ) {
                if(i==0) {
                    check=1; prevCheck=1;
                } else {
                    prevCheck = check;
                    check = 1;
                }
            } else if(list.get(i) > list.get(i+1) ) {
                if(i==0) {
                    check=2; prevCheck=2;
                } else {
                    prevCheck = check;
                    check = 2;
                }
            }
            if(check != prevCheck) {check=0;}
        }
        if(check==0) {
            System.out.println("mixed");
        }else if(check==1) {
            System.out.println("ascending");
        }else if(check==2) {
            System.out.println("descending");
        }
    }
}
