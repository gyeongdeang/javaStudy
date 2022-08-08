import java.util.Scanner;

public class BJ10101 { //삼각형
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();



        if(a == 60  && b ==60 && c == 60){
            System.out.println("Equilateral");
        }
        else if(a + b + c == 180 && a == b && a == c ){
            System.out.println( "Isosceles");
        }
        else if(a + b + c == 180 && a!=b && a!=c && b!=c ){
            System.out.println("Scalene");
        }else {
            System.out.println("Error");
        }

    }
}

//       String retVal = "Error";
//        if (d1 == 60 && d2 == 60 && d3 == 60) {
//            retVal = "Equilateral";
//        } else if ((d1 + d2 + d3) == 180) {
//            if (d1 == d2 || d2 == d3 || d1 == d3) {
//                retVal = "Isosceles";
//            } else {
//                retVal = "Scalene";
//            }
//        }
//        return retVal;
//    }

