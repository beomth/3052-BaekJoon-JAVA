import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BaekJoon{
    public static void main(String[] args) throws IOException{

        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i ++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int cnt = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == true) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}