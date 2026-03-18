public class _01_DataType {
    public static void main(String[] args) {
        /*
            자료형
            기본자료형과 참조자료형으로 구분

            1) 기본자료형
            int, long, float, double, boolean, char

            2) 참조 자료형
            String, class, interface, arrayList, enum 등

            기본 자료형은 값을 그대로 저장
            참조자료형은 값이 들어있는 주소를 저장

        */
            int a = 0;
            int age = 20;
            double score = 90.5;
            boolean isChecked = true;
            char grade = 'A';
            System.out.println(age);
            System.out.println(score);
            System.out.println(isChecked);
            System.out.println(grade);

            System.out.println(((Object)age).getClass().getName());
            
    }
}
