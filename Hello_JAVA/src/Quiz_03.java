import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Quiz_03 {   
    public static void main(String[] args) {
        /*
            3. 성적 등급 판별(제어문 if)

            Quiz)
            학생의 점수가 92점일 때 성적의 등급을 출력하시오.

            90점 이상 A
            80점 이상 B
            70점 이상 C
            그 외 D

            조건 if - else if -else
            
            출력 
            학생의 점수는 {0}점으로 {1}등급입니다.
        */

            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if(score>=90){
                System.out.println(String.format("학생의 점수는 %d으로 %s등급입니다.", score,"A"));
            }else if(score >=80){
                System.out.println(String.format("학생의 점수는 %d으로 %s등급입니다.", score,"B"));
            }else if(score >=70){
                System.out.println(String.format("학생의 점수는 %d으로 %s등급입니다.", score,"C"));
            }else{
                System.out.println(String.format("학생의 점수는 %d으로 %s등급입니다.", score,"D"));
            }
    }
}
