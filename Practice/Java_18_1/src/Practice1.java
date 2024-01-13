
public class Practice1 {
    public static void solution(int num) {

        int numReverse = 0; // 최종값 변수
        boolean isMinus = false; // 마이너스(음수)체크 변수

        if (num < 0) { // 0보다 작은 음수라면
            isMinus = true; // 음수 체크
            num *= - 1; // 음수를 양수로 변환
        }

        // 자릿수를 하나씩 떼와서 계산
        while (num > 0) {
            int r = num % 10; // ex) 12345 % 10 = 5 이 남은 5를 r 변수에 저장
            num /= 10; // 12345 / 10 = 1234.5 인데 0.5는 생략된다
            numReverse = numReverse * 10 + r;
            // 식이 진행될때마다 10을 곱함으로서 자릿수가 올라간다.
            // r변수에 있던 numReverse변수에 차곡차곡 저장
        }

        System.out.println(isMinus ? numReverse * -1 : numReverse);

    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}
