import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz_02 {
    public static void main(String[] args) throws IOException {
        /*
            2.원의 넓이 계산기 (상수 활용)

            Quiz)
            원의 반지름을 입력하고 넓이를 계산하는 프로그램을 작성하시오.

            조건
            1) 원주율은 final 키워드를 사용하여 상수로 선언
            2) 넓이의 공식 : PI (원주율 3.14) *r *r
            3)자료형 double 사용

            출력
            반지름 : {0}
            원의 넓이 : {0}
        
        */


            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            

            Scanner sc = new Scanner(System.in);
            double half = sc.nextDouble();

            final double PI = 3.14;
            double extent = PI * half * half;

            System.out.println(String.format("반지름 : %f",half));
            System.out.println(String.format("넓이 : %.2f",extent));
    }
}
