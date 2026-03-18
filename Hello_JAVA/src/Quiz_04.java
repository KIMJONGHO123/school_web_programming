import java.util.Scanner;

public class Quiz_04 {
    public static void main(String[] args) {
        /*
            4. 쇼핑몰 할인 계산기 (복합 조건)

            Quiz)
            한 쇼핑몰에서 구매 금액에 따라 할인이 적용됩니다.

            10만원 이상 구매한 경우 10% 할인
            5만원 이상 구매한 경우 5% 할인 
            그 외 할인 없음

            총 구매할 물품의 가격이 12만원인 경우 최종 결제금액은 얼마인가요?

            출력
            구매 금액 : {0}원
            할인 금액 : {0}원
            결제 금액 : {0}원
        */

            Scanner sc = new Scanner(System.in);
            int pro_price = sc.nextInt();
            int discount=0;
            int total_price =0;
            
            if(pro_price>=100000)
                discount = (int)(pro_price*0.1);
            else if (pro_price>=50000) {
                discount = (int)(pro_price*0.05);
            }
            total_price = pro_price-discount;

            System.out.println(String.format("구매 금액 : %d", pro_price));
            System.out.println(String.format("할인 금액 : %d", discount));
            System.out.println(String.format("결제 금액 : %d", total_price));
    }
    
}
