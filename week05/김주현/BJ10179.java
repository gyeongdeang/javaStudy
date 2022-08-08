import java.util.Scanner;

public class BJ10179 { //쿠폰
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int test = scanner.nextInt(); // 테스트 케이스 수
        double price =0;

        for(int i = 0; i < test; i++){
            price = scanner.nextDouble();
            price *= 0.8;
            System.out.println("$" + String.format("%.2f", price));
        }

        //String.format("%.2f", ) 형태로 출력하면 소수점 아래 3번째에서 반올림하여 2번째 자리까지 출력합니다.
        //System.out.println("$" + String.format("%.2f", price*0.8));
    }
}
