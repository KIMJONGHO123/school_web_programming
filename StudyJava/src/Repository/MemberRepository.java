package Repository;

import java.util.ArrayList;
import Domain.Member;

public class MemberRepository {

    private ArrayList<Member> members = new ArrayList<>();

    public MemberRepository() {

        members.add(new Member("유재석", 53, "남"));
        members.add(new Member("하하", 46, "남"));
        members.add(new Member("이수지", 19, "여"));
    }

    public ArrayList<Member> findAll() {
        return members;
    }
}
