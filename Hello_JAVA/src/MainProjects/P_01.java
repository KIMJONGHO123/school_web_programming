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

                >>> 회원정보 필터
                >>> 20세 이상 회원만 필터

            3) 상품정보 초기화
            - Product class(상품명,금액)
            - 초기상품
                자켓/149000, 셔츠/39900, 슬랙스/549000
            
            4) 선택된 상품 금액 계산
            - 상품명, 수량 입력 받고 자동 계산

            5) 카드 결제
            - 결제 인터페이스 상속받아서 현금/카드 결제
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
            if(member.age>=20){
                System.out.println(member.name+member.age+member.gender);
            }
            
        }

        Product pd = new Product("자켓",149000);
        Product pd1 = new Product("셔츠",39900);
        Product pd2 = new Product("슬랙스",549000);

        List<Product> pdli = Arrays.asList(pd,pd1,pd2);

        for (Product product : pdli) {
            System.out.println(product.productName+"은"+product.price+"입니다.");
        }

        Scanner sc1= new Scanner(System.in);
        System.out.println("상품명을 입력하세요 :");
        String productName = sc1.nextLine();
        System.out.println("가격을 입력하세요 : ");
        int productAmount = sc1.nextInt();
        sc1.nextLine();

        int totalPrice = calc(productName,productAmount);
        CardPayment cardPayment = new CardPayment();
        // 카드결제
        cardPayment.pay(totalPrice);
    }

    private static int calc(String productName, int productAmount) {
        if(productName == "자켓"){
            return 149000*productAmount;
        }
        else if (productName =="셔츠") {
            return 39900 * productAmount;
        }
        else if(productName == "슬랙스"){
            return 54900 * productAmount;
        }
        return 0;
    }

    public static void login(){

    }
}

interface Pay {
    void pay(int amount);
}

class CardPayment implements Pay{
    public void pay(int amount){
        System.out.println("카드 결제 완료 : " + amount);
    }
}


class Product{
    String productName;
    int price;

    public Product(){}
    public Product(String productName,int price){
        this.productName = productName;
        this.price = price;
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
