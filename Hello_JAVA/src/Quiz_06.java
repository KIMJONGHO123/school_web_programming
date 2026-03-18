public class Quiz_06 {
    public static void main(String[] args) {
        /*
            6. 누적 합 계산기(반복문)

            Quiz)
            1일부터 10일까지 매일 2,000원씩 저축합니다.
            총 저출 금액을 계산하시오.

            조건

            1)for/while
            2)누적변수 사용

            출력
            1일차 잔액 : {0}원
            2일차 잔액 : {0}원

            10일차 잔액 : {0}원


        */


            int havaMoney= 0;
            int everyDay = 2000;

            for (int i = 1; i <= 10; i++) {
                havaMoney+=everyDay;
                System.out.println(String.format("%d일차 잔액 : %d원", i,havaMoney));
            }
    }
    
}
