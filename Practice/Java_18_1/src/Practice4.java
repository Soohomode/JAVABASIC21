
public class Practice4 {
    public static void solution(int n, int type) {

        if (type == 1) {
            type1(n);
        } else if (type == 2) {
            type2(n);
        } else if (type == 3) {
            type3(n);
        } else if (type == 4) {
            type4(n);
        } else if (type == 5) {
            type5(n);
        }
    }

    public static void type1(int n) {
        System.out.println("== Type1 ==");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void type2(int n) {
        System.out.println("== Type2 ==");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void type3(int n) {
        System.out.println("== Type3 ==");

        for (int i = 0; i < n; i++) { // 바깥줄
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" "); // 공백 출력
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void type4(int n) {
        System.out.println("== Type4 ==");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { // 공백 부분
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) { // 별찍는 부분
                System.out.print("*");
            }
            System.out.println();
            
        }

        System.out.println();
    }

    public static void type5(int n) {
        System.out.println("== Type5 ==");
        // 상단부
        for (int i = 0; i <= n / 2; i++) { // 상단부이기에, n / 2를 한다 (반 half) 3줄 찍어야하기에 <=
            for (int j = 0; j < n / 2 - i; j++) { // 공백 부분
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) { // 별 출력 부분
                System.out.print("*");
            }
            System.out.println();

        }

        // 하단부
        for (int i = n / 2; i > 0; i--) { // 하단부는 i = n / 2를 한다 i-- 2줄 찍는다 (n이 5일경우)
            for (int j = 0; j < n / 2 + 1 - i; j++) { // 공백 부분
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) { // 별 출력 부분
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
//        type1(3);
        solution(3, 1);
        solution(3, 2);
        solution(3, 3);
        solution(3, 4);
        solution(7, 5);
    }
}
