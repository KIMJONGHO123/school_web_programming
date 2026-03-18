public class _02_Variable {
    public static void main(String[] args) {
        /*
            변수 : 값을 담는 그릇
            자료형 변수명 = 값;

            예) 나이 age, 이름 student, studentName, className

            변수명을 짓는 권장사항
            1. 변수명 지을 때 들어갈 수 있는 문자 또는 특수문자
                밑줄(_), 문자(a,b,c,d,e...), 숫자(1.2.3.4...)
                1) 숫자는 시작할 수 없다.
                2) 전역변수 같은 경우 대부분의 개발팀은 밑줄(_)로 시작
                3) 변수의 첫 문자는 소문자로 대체로 시작
                두번째 문자는 대문자로 시작
            
            2. public,static,void,main,float.int 예약어는 변수로 선언할 수 없다.
            3. 변수명으로 해당 값을 유추할 수 있는 쉬운 네이밍 필요
         */

        String fruitName= "사과";
        System.out.println(fruitName);

        double score = 90.8;
        double scoreFinal = 95.7;

        System.out.println(score);
        System.out.println(scoreFinal);
        
        
    }
    
    
}
