import java.util.ArrayList;

public class Quiz_05 {
    public static void main(String[] args) {
        /*
            주사위를 던져 점심메뉴 결정

            조건

            1) 정육면체 주사위로 1에서 6까지 결과값 발생
            2) 주사위 1. :국밥
                    2. : 제육볶음
                    3. 돈까스
                    4. 햄버거
                    5. 분식
                    6. 수덕전 정식
            3) 주사위가 정해진 범위에서 벗어나 값을 알 수 없는 경우 기본값은 6

            출력
            주사위의 수가 {0}입니다.
            점심 메뉴는 {0}입니다.

        */

            int jusawi = (int)(Math.random()*6+1);
            String menu = "";


            // if(jusawi>6 || jusawi<1){
            //     jusawi = 6;
            // }
                
            // switch (jusawi) {
            //     case 1:
            //         menu = "국밥"; 
            //         break;
            
            //     case 2:
            //         menu = "제육볶음"; 
            //         break;
                
            //     case 3:
            //         menu = "돈까스"; 
            //         break;
                
            //     case 4:
            //         menu = "햄버거"; 
            //         break;
                
            //     case 5:
            //         menu = "분식"; 
            //         break;

            //     case 6:
            //         menu = "수덕전 정식"; 
            //         break;
            
            //     default:
            //         menu = "수덕전 정식"; 
            //         break;
            // }
            // System.out.println(String.format("주사위의 수가 %d 입니다.", jusawi));
            // System.out.println(String.format("점심 메뉴는 %s 입니다", menu));


            ArrayList<String> menuList = new ArrayList<>();
            menuList.add("국밥");
            menuList.add("제육볶음");
            menuList.add("돈까스");
            menuList.add("햄버거");
            menuList.add("분식");
            menuList.add("수덕전 정식");

            System.out.println(String.format("주사위의 수가 %d 입니다.", jusawi));
            System.out.println(String.format("점심 메뉴는 %s 입니다", menuList.get(jusawi-1)));
    }
    
}
