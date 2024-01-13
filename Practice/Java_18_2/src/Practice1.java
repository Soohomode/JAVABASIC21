import java.util.HashMap;

public class Practice1 {
    public static void solution(String s) {

        HashMap<Character, Integer> map = new HashMap<>(); // 키와 값으로 쌍으로 이루어진
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0; // 변환될 결과를 더해서 저장할 변수
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) { // index는 0부터 lenght는 1부터이기 때문에 -1
            if (map.get(arr[i]) < map.get(arr[i + 1])) { // 앞에 숫자가 뒤에숫자보다 작은경우
                sum -= map.get(arr[i]); // 해당 값을 빼줌
            } else {
                sum += map.get(arr[i]); // 해당 값을 더해줌
            }

        }
        sum += map.get(arr[arr.length - 1]); // 맨 마지막에있는 수를 더해줌
        System.out.println(sum);

    }

    public static void main(String[] args) {
        // Test code
        solution("III");
        solution("IV");
        solution("VI");
        solution("XIII");
        solution("XXVI");
        solution("MCMXCIV");
    }
}
