import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class BJ2053 { //인공지능 시계
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//
//        LocalTime now1 = LocalTime.now();
//        System.out.println(now1);
//------------------------------------------------------

        int h = scanner.nextInt();
        int m =scanner.nextInt();
        int s = scanner.nextInt();

        int cook = scanner.nextInt();

        s += cook;
        if(s>=60){
            m += s/60;
            s = s % 60;
        }

        if(m>=60){
            h = h + m/60;
            m = m % 60;
        }

        if(h>24){
            h = h % 24;
        }


//        s += cook; //0 + 200
//        m += s/60; //30 + 3 (.333)
//        h += m/60; // 14 + 0.55(33/60)
//
//        h %= 24; //14 /24 = 0.583
//        m %= 60; //33 / 60 = 0.55
       // s %= 60; // 200 / 60 = 20초

        //String.format() - 문자열 형식 지정
        //String cooking =  String.format("요리 완성 시간은 %d시 %d분 %d초 입니다.", h,m,s);
       // System.out.println(cooking);

        System.out.println(String.format("요리 완성 시간은 %d시 %d분 %d초 입니다.", h,m,s));





//        public static void main(String[] args) throws IOException {
//            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    ㅡ        String[] line = bf.readLine().split(" ");
    //}
        //bufferedreader는 무조건 문자열로 받아오기때문에 정수형이나 실수형 변수에 저장하기 위해서는 입력과 형변환을 해줘야한다.
   }
}
