import java.util.Objects;
import java.util.Scanner;

// 유수호
public class Mini_03 {
    public static void main(String[] args) {
        // 놀이동산 입장권 계산 프로그램

        Scanner sc = new Scanner(System.in);

        int pay = 10000; // 기본 입장료

        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String yugong = sc.next();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String bokji = sc.next();

        if (age < 3) { // 나이 할인
            pay = 0;
        } else if (age < 13 && pay > 4000) { // 현재 입장료가 4000원 보다 비싸면 특별할인
            pay = 4000;
        }

        if (time >= 17 && pay > 4000) { // 시간 할인
            pay = 4000;
        }

        if (Objects.equals(yugong, "y") && pay > 8000) { // 유공자 할인
            pay = 8000;
        }

        if (Objects.equals(bokji, "y") && pay > 8000) { // 복지카드 할인
            pay = 8000;
        }

        System.out.printf("입장료: %d원", pay);

    }
}
