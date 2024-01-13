// Java 프로그래밍 - 컬렉션 프레임워크

import java.util.*;

public class Main {

    public static void main(String[] args) {

//      1. List
//      1-1. ArrayList
        ArrayList list1 = new ArrayList(); // 객체 생성
        list1.add(1); // add로 데이터를 하나씩 추가
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1); // [1, 2, 3]
        list1.remove(Integer.valueOf(2));
        // remove(2)면 index 2값 제거, Integer.valueOf(2)면 2 값을 찾아서 제거
        System.out.println("list1 = " + list1); // [1, 3]
        list1.add(0, 10);
        System.out.println("list1 = " + list1); // [10, 1, 3]
        System.out.println("list1.size() = " + list1.size()); // size 출력
        System.out.println("list1.contains(1) = " + list1.contains(1)); // 값이 들어있는지
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10)); // 10의 인덱스위치확인

//      1-2. LinkedList
        System.out.println("== LinkedList ==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);

        // ArrayList와 다른 사용방법
        list2.addFirst(10); // 가장 처음에 데이터를 넣음
        list2.addLast(20); // 가장 마지막에 데이터를 넣음
        System.out.println("list2 = " + list2);

        list2.remove(Integer.valueOf(1)); // 특정값 지움
        System.out.println("list2 = " + list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println("list2 = " + list2);
        System.out.println(list2.size());


//      2. Set
//      2-1. HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1); // Set은 그냥 값 넣으면, 인덱스가 아니라 특정값을 지운다
        System.out.println("set1 = " + set1); // [2, 3]
        set1.add(2); // 중복된 값은 넣어지지 않는다.
        set1.add(3); // 마찬가지
        System.out.println("set1 = " + set1); // [2, 3]
        System.out.println(set1.size());
        System.out.println(set1.contains(2));


//      2-2. TreeSet 자료구조에 중요
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2); // Set은 그냥 값 넣으면, 인덱스가 아니라 특정값을 지운다
        System.out.println("set2 = " + set2);
        set2.clear(); // 모든 데이터 삭제
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15); // 중복값은 안들어감
        System.out.println("set2 = " + set2);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(10)); // lower는 입력값보다 작은값을 출력해줌
        System.out.println(set2.higher(10)); // higher는 높은값



//      3. Map
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap(); // 객체 생성
        map1.put(1, "kiwi"); // 키, 값 이 쌍으로 들어가야함
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);
        
        map1.remove(2); // 해당 키 값을 입력해서 지운다
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1)); // 데이터를 꺼내 올때도 키값 입력


//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap(); // 객체 생성
        map2.put(10, "kiwi");
        map2.put(5, "apple");
        map2.put(15, "mango");
        System.out.println("map2 = " + map2);

        // 이용하는 관점에서의 차이
        System.out.println(map2.firstEntry()); // 첫번째 쌍 데이터
        System.out.println(map2.firstKey()); // 첫번째 키
        System.out.println(map2.lastEntry()); // 마지막 쌍 데이터
        System.out.println(map2.lastKey()); // 마지막 키
        System.out.println(map2.lowerEntry(10)); // 10보다 작은 키값의 쌍 데이터
        System.out.println(map2.higherEntry(10)); // 10보다 큰 키값의 쌍 데이터

    }
}
