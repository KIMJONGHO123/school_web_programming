package MainProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P_01{
    public static void main(String[] args) {
        /*
            통합 미니 시스템


            ** 요구사항 **
            -아이디 /비밀번호 입력
            - 저장된 계정 : admin /1234
            - 로그인 성공 시 다음 단계 진행
            - 로그인 실패 시 재입력

            2) 회원정보 초기화
            - Member (이름,나이,성별)
            - 초기회원
                유재석/53/남, 하하/46/남, 이수지/19/여 
            
        */
       Scanner sc = new Scanner(System.in);
       while (true) {
        System.out.println("로그인 아이디를 입력하세요 : ");
        // int cmd = sc.nextInt();
        // sc.nextLine();

        String id = sc.nextLine();
        System.out.println("로그인 비밀번호를 입력하세요 :");
        int password =sc.nextInt();
        sc.nextLine();
        if(id.equals("admin") && password==1234){
            System.out.println("로그인 성공");
            break;
        }else{
            System.out.println("로그인이 실패하였습니다.");
        }

        

        // if(cmd==5){
        //     exit();
        //     break;
        // }
       }

        Member mb = new Member("유재석",53,"남");
        Member mb1 = new Member("하하",46,"남");
        Member mb2 = new Member("이수지",19,"여");

        List<Member> mbLi = Arrays.asList(mb,mb1,mb2);
        
        for (Member member : mbLi) {
            System.out.println(member.name+member.age+member.gender);
        }
    }

    public static void login(){

    }
}

class Member{
    String name;
    int age;
    String gender;

    public Member(){}

    public Member(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender =gender;
    }
}
