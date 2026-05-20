package Service;

import java.util.ArrayList;

import Domain.Member;
import Repository.MemberRepository;

public class MemberService {

    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }

    public void printAdultMembers() {

        ArrayList<Member> members = memberRepository.findAll();

        System.out.println("=== 20세 이상 회원 목록 ===");

        for (Member member : members) {

            if (member.getAge() >= 20) {

                System.out.println(
                        "이름 : " + member.getName()
                                + ", 나이 : " + member.getAge()
                                + ", 성별 : " + member.getGender());
            }
        }
    }
}
