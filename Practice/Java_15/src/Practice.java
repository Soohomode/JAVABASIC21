// Practice
// 로또 번호 만들기 (set을 이용해서)

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1; // 0에서 44까지 랜덤하게 나옴 + 1해서 45까지
            set.add(num); // set은 중복을 허용 x 중복되지 않은 값이 들어갈때까지 반복
        }

        LinkedList list = new LinkedList(set); // LinkedList 쓰는 이유 오름차순 정렬을 위해
        Collections.sort(list);
        System.out.println("로또 번호 : " + list);


    }
}
