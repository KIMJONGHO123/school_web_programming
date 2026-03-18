public class Quiz_07 {
    public static void main(String[] args) {
        /*
            7. 학생 점수 관리(배열)

            Quiz)
            학생 5명의 점수가 배열에 저장되어 있습니다.

            점수 목록 : 75, 80, 95, 60, 85

            조건
            1) 배열 사용
            2) 반복문으로 모든 점수 출력
            3) 총합과 평균 출력

        */

            int score[] = {75,80,95,60,85};
            int sum=0;

            for (int i : score) {
                sum+=i;
                System.out.println(String.format("점수 : %d", i));
            }

            System.out.println(String.format("총점은 %d 이고 평균은 %d 입니다.", sum, sum/score.length));

    }
    
}
