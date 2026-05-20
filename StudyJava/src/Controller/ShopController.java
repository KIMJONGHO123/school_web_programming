package Controller;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import Common.CardPayment;
import Common.Payment;
import Domain.Product;
import Service.MemberService;

public class ShopController {

    private Scanner sc = new Scanner(System.in);

    public void start() {

        login();

        MemberService memberService = new MemberService();
        memberService.printAdultMembers();

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("자켓", 149000));
        products.add(new Product("셔츠", 39900));
        products.add(new Product("슬랙스", 54900));

        System.out.println("\n=== 상품 목록 ===");

        for (Product p : products) {

            System.out.println(
                    "상품명 : " + p.getProductName()
                            + ", 금액 : " + p.getPrice() + "원");
        }

        int totalPrice = 0;

        while (true) {

            System.out.print("\n구매할 상품명 (종료 : 끝) : ");
            String productName = sc.nextLine();

            if (productName.equals("끝")) {
                break;
            }

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            boolean found = false;

            for (Product p : products) {

                if (p.getProductName().equals(productName)) {

                    totalPrice += p.getPrice() * quantity;
                    found = true;

                    System.out.println("상품 추가 완료!");
                    break;
                }
            }

            if (!found) {
                System.out.println("존재하지 않는 상품입니다.");
            }
        }

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("\n총 금액 : " + df.format(totalPrice) + "원");

        Payment payment = new CardPayment();
        payment.pay(totalPrice);

        sc.close();
    }

    private void login() {

        String savedId = "admin";
        String savedPw = "1234";

        while (true) {

            System.out.print("아이디 : ");
            String id = sc.nextLine();

            System.out.print("비밀번호 : ");
            String pw = sc.nextLine();

            if (id.equals(savedId) && pw.equals(savedPw)) {

                System.out.println("로그인 성공!\n");
                break;

            } else {

                System.out.println("로그인 실패! 다시 입력하세요.\n");
            }
        }
    }
}