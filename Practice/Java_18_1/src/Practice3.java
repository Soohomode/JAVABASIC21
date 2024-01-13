
public class Practice3 {
    public static String solution(char[] str, char[] find, char[] to) {

        int idx = 0; // 아래에서 사용할 인덱스 변수 하나 생성
        String replaceStr = ""; // 최종 변경된 데이터를 위한 변수
        char[] replaceBucket = str.clone(); // 임시로 담아둘 변수배열

        do {
            idx = findIndex(replaceBucket, find);

            if (idx != -1) {
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i];
                }

                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }

                for (int i = idx + find.length; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i];
                }

                replaceBucket = replaceStr.toCharArray();
                replaceStr = ""; // 초기화
            }

        } while (idx != -1); // idx가 -1이 아닌동안 계속 반복 (매칭되는게 없을때까지)

        replaceStr = new String(replaceBucket);
        return replaceStr;
    }

    // 문자열에서 해당 위치를 찾는 함수
    public static int findIndex(char[] str, char[] find) {
        int idx = -1; // 매칭되는게 없다면 -1을 반환할것
        boolean isMatch = false;

        for (int i = 0; i < str.length; i++) {

            if (str[i] == find[0] && str.length - i >= find.length) {
                isMatch = true;

                for (int j = 1; j < find.length; j++) {
                    if (str[i * j] != find[j]) { // 한글자만이라도 같지 않다면
                        isMatch = false;
                        break;
                    }
                }
            }

            if (isMatch) { // 같은 글자 발견
                idx = i; // 위치를 idx 변수에 저장
                break;
            }

        }
        return idx;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
