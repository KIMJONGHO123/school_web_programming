public class _04_Operator {
    public static void main(String[] args) {
        
        /*
            연산자

            산술연산자
            대입연산자 (+=,-=,*=./,%)
            비교연산자(>,>=.==,>=,<)
            논리연산자
            
            삼항연산자

        */
        int a = 10;
        int b = 20;
        int c = 30;

        if(a>b){
            System.out.println("a가 b보다 큽니다");
        }else{
            System.out.println("b가 a보다 큽니다");
        }

        if(a>b && c>b){
            System.out.println("a가 b보다 크고 c는 b보다 큽니다");
        }else if(a>b || c>b){
            System.out.println("a가 b보다 크거나 또는 c는 b보다 큽니다");
        }

        boolean isChecked = (a>b || c>b) ? true:false;
        System.out.println(isChecked);
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b); // 0.5 정수로 나눗셈을 했기때문에 정수 이하 실수 부분은 데이터 손실이 일어난 상황
        // System.out.println(a%b);

        // double c = 10;
        // double d = 20;

        // System.out.println(c/d);

        // d = c+d;
        // d+=c;

        // // 대입 연산자 ( +=, -=, *=, /=, %=)

    }
    
}
