import java.util.Scanner;

public class BJ1550 {
    //16진수 -> 10진수
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int num = Integer.parseInt(b,10);
        System.out.println(num);

        String c = sc.next();
        System.out.println(Integer.parseInt(c,10));


        //parseInt() 함수는 문자열 인자를 파싱하여 특정 진수(수의 진법 체계에서 기준이 되는 값)의 정수를 반환합니다
        //Integer.parseInt(String s) - 숫자형의 문자열을 인자값으로 받아 10진수의 Integer형으로 반환
        //Integer.parseInt(String s, int radix) - 숫자형의 문자열을 첫번째 인자값으로 받고 변환할 진수값을 입력하면 진수에 맞춰 Integer형으로 반환

       String a = String.valueOf(Integer.valueOf (sc.nextInt()));
        System.out.println(a);

//        10진수 -> 2진수 변환 : Integer.toBinaryString(int);
//        10진수 -> 8진수 변환 : Integer.toOctalString(int);
//        10진수 -> 16진수 변환 : Integer.toHexString(int);


        //2진수 -> 10진수 변환 : Integer.valueOf(string, 2);
        // 8진수 -> 10진수 변환 : Integer.valueOf(string, 8);
        // 16진수 -> 10진수 변환 : Integer.valueOf(string, 10);
    }
}
