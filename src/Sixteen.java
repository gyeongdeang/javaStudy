import java.util.Scanner;

public class Sixteen {
    Scanner scanner = new Scanner(System.in);
    String a = String.valueOf(scanner.nextInt());
    //int b = Integer.valueOf(a);
        //scanner.close();
    //리소스가 IO 채널일 때(외부 네트워크, 파일 등)만 스트림을 닫아주면 된다고 합니다.
        System.out.println(Integer.valueOF(a));

        //  입력값을 10진수로 변환
        //16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다




    //Integer.parseInt() parseInt(String타입의 값)의 기능은 String타입의 숫자를 int타입으로 변환해주는
    //대신 문자열이 꼭 숫자로만 되어 있어야한다 그래서 탈락,

    //10진수 -> 2진수 변환 : Integer.toBinaryString(int);
    // 10진수 -> 8진수 변환 : Integer.toOctalString(int);
    // 10진수 -> 16진수 변환 : Integer.toHexString(int);



    //2진수 -> 10진수 변환 : Integer.valueOf(string, 2);
    //8진수 -> 10진수 변환 : Integer.valueOf(string, 8);
    //16진수 -> 10진수 변환 : Integer.valueOf(string, 10);

}
