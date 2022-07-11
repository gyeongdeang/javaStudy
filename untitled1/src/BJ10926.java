import java.io.*;
import java.util.Scanner;

public class BJ10926 {
    //"??!" 마지막에 붙이기
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        System.out.println(a + "??!");

        String b = sc.next();
        String ls = "??!";

        System.out.println(b+ls);


        ///Buffer - 데이터를 한 곳에서 다른 하나 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
        //BufferedReader
        //:Scanner와 유사.
        // BufferedReader은 입력 받은 데이터가 String으로 고정되기 때문에 입력받은 데이터를 원하는 타입으로 가공하는 작업이 필요하다.
        // Scanner보다 속도가 빠르다!
        //다른 타입으로 입력을 받고자 한다면 반드시 형변환이 필요하다. 그리고, 예외처리를 반드시 필요로 한다. readLine()시 마다 try/catch문으로 감싸주어도 되고, throws IOException 을 통한 예외처리를 해도 된다.(대부분의 경우에 후자를 사용한다.)
        //int i = Integer.parseInt(br.readLine());
        //Bufferedwriter
        //:System.out.println();과 유사
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String c = bf.readLine();
        System.out.println(c + "??!");

        //StringBuilder  그냥 이런게 있다정도 공부해보기!


    }
}
