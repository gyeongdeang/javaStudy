import java.util.Scanner;

public class BJ2420 { //사파리
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int s = scanner.nextInt();
        int k = scanner.nextInt();

        if(s<0){
            s+=s;
        }

        System.out.println("유명도 차이는/n" + (s + k));
    }
}
