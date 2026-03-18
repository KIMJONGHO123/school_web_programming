import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class _07_List {
    public static void main(String[] args) {
        
        /*
            리스트 : 크기가 정해지지 않은 값들의 묶음

            ArrayList - add / get / contains / set / remove / clear
            LinkedList - getFirst / getLast (ArrayList와 차이 발생)
            HashSet - 순서와 중복을 허용하지 않음
            HashMap - HashSet의 특성을 가진 key와 value의 쌍 묶음

            //ArrayList
            // ArrayList<자료형> 변수명 = new ArrayList<>();
            // 변수명.add(자료형에 맞는 값)
        */

            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("딸기");
            fruits.add("사과");
            fruits.add("바나나");
            fruits.add("키위");

            for (String fruitName : fruits) {
                System.out.println(fruitName);
            }

            System.out.println("---------------------------------------------------");
            fruits.set(0, "구아바");
            for (String fruitName : fruits) {
                System.out.println(fruitName);
            }
            
            /*
                add: 값의 추가
                remove : 값의 제거
                set: 값의 수정
                get: 가져오기
                clear: 값 모두 제거
                contains : 해당 값이 존재하는지
            
            */

            
                // ArrayList<Integer> numbers = new ArrayList<>();
                // for (int i = 0; i < 10; i++) {
                //     numbers.add(i);
                // }

                // numbers.clear();
                // for (Integer number : numbers) {
                //     if(numbers.contains(8)){
                //         System.out.println("숫자 8이 존재합니다.");
                //     }
                //     System.out.println(number);
                // }

                // LinkedList(순서)
                //getFirst / getLast
                // HashSet(순서,중복 허용되지 않음)

                // HashSet<String> names = new HashSet<>();
                // names.add("홍길동");
                // names.add("김김김");
                // names.add("아아아");
                // names.add("홍길동");

                // for (String string : names) {
                //     if(string == "홍길동"){
                //         System.out.println("홍길동이 존재합니다.");
                //     }
                    
                // }

                // HashMap
                // HashMap<Integer,String> students = new HashMap<>();

                // students.put(1, "홍길동");
                // students.put(2, "김김김");
                // students.put(3, "아아아");

                // for (Integer string : students.keySet()) {
                //     System.out.println(students.get(string));
                // }
 

    }
    
}

