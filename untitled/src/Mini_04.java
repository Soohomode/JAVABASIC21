import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

// 유수호
public class Mini_04 {
    public static void main(String[] args) {

        // “주민등록번호 생성 프로그램”

        System.out.println("[주민등록번호 계산]");

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();

        // 성별숫자
        int genderNumber = 0;

        if (year >= 2000) {
            genderNumber = (Objects.equals(gender, "m")) ? 3 : 4;
        } else if (year >= 1900) {
            genderNumber = (Objects.equals(gender, "m")) ? 1 : 2;
        }

        // 뒷6자리
        int backNumber = rd.nextInt(999999) + 1;

        System.out.printf("%02d%02d%02d - %d%06d", year % 100, month, day, genderNumber, backNumber);

    }
}
