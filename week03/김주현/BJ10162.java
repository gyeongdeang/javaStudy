import java.util.Scanner;

public class BJ10162 { // 전자레인지
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int t = scanner.nextInt();

        if(t%10 != 0){
            System.out.println( -1 );
        }else {
            int d = t/ 300;
            t = t % d;
            int e =t/ 60;
            t=t%e;
            int f =t/ 10;
            t=t%f;
            System.out.println(d +" "+ e +" "+ f);
        }

        if(t>=300){
            t = t/300;

        }
    }
}
