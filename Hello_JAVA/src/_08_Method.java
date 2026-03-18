public class _08_Method {
    public static void main(String[] args) {
        /*
            메서드 : 특정한 기능을 수행하는 코드의 묶음

            왜 사용하는가 ?
            1) 코드 재사용성
            2) 가독성 향상
            3) 쉬운 유지보수

            접근제어자 반환타입 메서드명(전달변수){
                실행코드
                return 반환값;
            }
            
        */

            // int a = 10;
            // int b = 5;
            // // System.out.println(a+b);

            // System.out.println(sum(a,b));


            introduce("홍길동",22,"축구");
            introduce("김김김",23,"농구");
            introduce("아아아",45);
            introduce("하하하",12);
            introduce("니니니");
            



    }

    // public static int sum(int a, int b){
    //     return a+b;
    // }

    public static void introduce(String name){
        introduce(name,-1);
    }

    public static void introduce(String name,int age){
        introduce(name,age,"");
    }

    public static void introduce(String name,int age,String hobby){
        System.out.println(String.format("제 이름은 %s 입니다.", name));
        if(age>=0){
            System.out.println(String.format("제 나이는 %d 입니다.", age));
        }
        
        if (hobby.length()>0) {
            System.out.println(String.format("제 취미는 %s 입니다.", hobby));    
        }
        
    }
    
}
