public class _03_String {
    public static void main(String[] args) {

        // String s1 = "Hello";
        // String s2 = "Hello";

        // if(s1 == s2) System.out.println("s1과 s2의 문자열이 같습니다.");
        // else System.out.println("s1과 s2의 문자열이 다릅니다");

        // String newS1 = new String("Hello");
        // String newS2 = new String("Hello");

        // if(newS1 == newS2) System.out.println("newS1과 newS2의 문자열이 같습니다.");
        // else System.out.println("newS1과 newS2의 문자열이 다릅니다");

        // if(newS1.equals(newS2)) System.out.println("s1과 s2의 문자열이 같습니다");
        // else System.out.println("s1과 s2의 문자열이 같습니다");

        // String hello = new String("Hello world");
        // System.out.println(hello.length()); // 문자열의 길이
        // System.out.println(hello.toUpperCase()); //모두 대문자로 변환
        // System.out.println(hello.toLowerCase()); // 모두 소문자로 변환
        // System.out.println(hello.replace("world", "JAVA"));
        // System.out.println(hello.substring(6)); //world
        // System.out.println(hello.indexOf("w")); //6

    
        // System.out.println(hello.substring(hello.indexOf("w"))); //world

        String name= "김김김";
        double score = 20.7;

        System.out.println(String.format("%s님 안녕하세요. 오늘도 좋은 하루 보내세요", name));
        System.out.println(String.format("%s님 오늘 미세먼지 지수는 %f입니다.", name,score ));

        /*
            문자열 출력 포맷
            %s 문자열
            %f 실수
            %d 정수
            %c char 문자
            %n 줄바꿈
        */

    }
}
