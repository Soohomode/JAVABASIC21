import java.util.Scanner;

// 유수호
public class Mini_02 {
    public static void main(String[] args) {
        // 결제 금액 캐시백 계산 프로그램

        System.out.println("[캐시백 계산]");

        Scanner sc = new Scanner(System.in);

        System.out.print("결제 금액을 입력해 주세요.(금액):");

        int cash = sc.nextInt();
        int cashBack = 0;

        if (cash >= 3000) {
            cashBack = 300;
        } else if (cash >= 2000) {
            cashBack = 200;
        } else if (cash >= 1000) {
            cashBack = 100;
        } else {
            cashBack = 0;
        }

        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", cash, cashBack);

    }
}
