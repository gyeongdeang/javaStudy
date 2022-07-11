import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1271 {
    //부자

    public static void main(String[] args) throws IOException {

        //10의 1,000 제곱이면 거의 무한에 가까운 엄청나게 큰 숫자이다.
        //참고로 10의 10 제곱만 해도 10,000,000,000이다.

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger c = new BigInteger(st.nextToken());
        BigInteger d = new BigInteger(st.nextToken());
        System.out.println(c.divide(d));
        System.out.println(c.remainder(d));


//      - 더하기: add()
//      - 빼기: subtract()
//      - 곱하기: multiply()
//      - 나누기: divide()

    }
}
