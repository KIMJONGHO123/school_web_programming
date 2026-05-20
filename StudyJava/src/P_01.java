import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

class Member {
    String name;
    int age;
    String gender;

    Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Product {
    String productName;
    int price;

    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
}

// 결제 인터페이스
interface Payment {
    void pay(int amount);
}

//카드 결제 클래스
class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제 완료!");
    }
}

// 현금 결제 클래스
class CashPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println(String.format("현금으로 %d원 결제 완료!", amount));
    }
}

public class P_01 {
    public static void main(String[] args) {
        /*
        통합 미니 시스템

        1) 요구사항
        아이디,비밀번호 입력
        - 저장된 계정 : admin/1234
        -로그인 성공 시 다음단계 진행
        -로그인 실패 시 재입력

        2) 회원정보 초기화
        -Member Class (이름, 나이, 성별)
        -초기 회원
          유재석/53/남, 하하/46/남, 이수지/19/여

          >>회원정보 필터
          >>20세 이상 회원만 출력

        3) 상품정보 초기화
        -Product Class (상품명, 금액)
        -초기상품
          자켓/149000, 셔츠/39900, 스랙스/54900

        4) 선택된 상품 금액 계산
        - 상품명, 수량 입력 받고 자동 계산

        5) 카드 결제
        - 결제 인터페이스 상속 받아서 현금/카드 결제

     */

        Scanner sc = new Scanner(System.in);

        // 1) 로그인
        String savedId = "admin";
        String savedPw = "1234";

        while (true) {
            System.out.print("아이디: ");
            String inputId = sc.nextLine();
            System.out.print("비밀번호: ");
            String inputPw = sc.nextLine();

            if (inputId.equals(savedId) && inputPw.equals(savedPw)) {
                System.out.println("로그인 성공!\n");
                break;
            } else {
                System.out.println("로그인 실패. 다시 입력해주세요.\n");
            }
        }

        // 2) 회원정보 초기화
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("유재석", 53, "남"));
        members.add(new Member("하하", 46, "남"));
        members.add(new Member("이수지", 19, "여"));

        System.out.println("=== 20세 이상 회원 목록 ===");
        for (Member m : members) {
            if (m.age >= 20) {
                System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 성별: " + m.gender);
            }
        }
        System.out.println();

        // 3) 상품정보 초기화
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("자켓", 149000));
        products.add(new Product("셔츠", 39900));
        products.add(new Product("슬랙스", 54900));

        System.out.println("=== 상품 목록 ===");
        for (Product p : products) {
            System.out.println("상품명: " + p.productName + ", 금액: " + p.price + "원");
        }

        // 4) 선택된 상품 금액 계산, 여러가지 상품 구매 가능하도록 수정
        int totalPrice = 0;
        while (true) {
            System.out.print("구매할 상품명 (종료하려면 '끝' 입력): ");
            String selectedProduct = sc.nextLine();
            if (selectedProduct.equals("끝")) {
                break;
            }
            System.out.println("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 개행 문자 제거
            boolean found = false;
            for (Product p : products) {
                if (p.productName.equals(selectedProduct)) {
                    totalPrice += p.price * quantity;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("상품명이 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
        

        //5) 카드 결제 결제 수단 선택
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println(String.format("구매할 물품의 총 금액은 %s 원입니다", df.format(totalPrice)));
        System.out.println("결제 수단을 선택하세요 (1: 카드, 2: 현금): ");
        int paymentMethod = sc.nextInt();
        Payment payment;
        if (paymentMethod == 1) {
            payment = new CardPayment();
        } else {
            payment = new CashPayment();
        }
        payment.pay(totalPrice);

        sc.close();
    }
}
