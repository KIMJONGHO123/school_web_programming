import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Quiz_08 {
    /*

        Quiz)
        온라인 쇼핑몰 주문 시스템을 만들려고 합니다.

        1. 고객이 상품을 주문
        2. 상품별 가격을 관리
        3. 중복 상품은 제거
        4. 전체 주문 금액을 계산

        조건
        1) 배열 또는 리스트 활용
        2) 배열 또는 리스트 순회(반복문)
        3) 상품 목록
            1. 노트북 : 1,000,000원
            2. 마우스 : 50,000원
            3. 키보드 : 100,000원
        4) 100만원 이상 주문시 10% 할인 , 50만원 이상 주문 시 5% 할인

        문제
        우리 쇼핑몰은 이벤트로 모든 제품의 가격을 5%할인하여 판매하기로 했습니다.
        단, 고객당 주문할 수 있는 제품은 제품당 1개만 가능합니다

        홍길동 고객은 노트북, 키보드, 마우스를 구매합니다
        이대호 고객은 키보드만 구매합니다

        출력
        고객명 : 
        구매금액 : 
        할인금액 : 
        결제금액 : 

    
    */

    public static void main(String[] args) {
        
        Map<String,Double> hm = new HashMap<>();
        hm.put("노트북",10000000.0);
        hm.put("마우스",50000.0);
        hm.put("키보드",100000.0);
        
        double baseRate = hm.get("노트북")*0.05+hm.get("마우스")*0.05+hm.get("키보드")*0.05;

        ArrayList<String> HongList = new ArrayList<>();
        ArrayList<String> LeeList = new ArrayList<>();

        HongList.add("노트북");
        HongList.add("키보드");
        HongList.add("마우스");

        LeeList.add("키보드");
    }

    public double calac(double notebook, double mouse, double keyboard){
        double total=0;
        double discountRate=0;
        double sum = (notebook-notebook*0.05)+(mouse-mouse*0.05)+(keyboard-keyboard*0.05);
        if(sum>=1000000){
            total = sum*0.1;
        }else if(sum>=500000){
            total= sum*0.05;
        }

        return total;
    }
    
}
