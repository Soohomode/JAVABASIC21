// Java 프로그래밍 - 스트림

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//      1. 스트림 생성

//      1-1. 배열 스트림
        System.out.println("== 배열 스트림 == ");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("== fori =="); // 기존 방식 for문
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("== forEach =="); // 기존 방식 foreach
        for (String item: arr) {
            System.out.println(item);
        }

        System.out.println("== to Stream ==");
        Stream stream1 = Arrays.stream(arr); // 배열을 stream으로 변환
        stream1.forEach(System.out::println); // 출력방법


//      1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);

        System.out.println("== to Stream ==");
        Stream stream2 = list1.stream(); // ArrayList를 Stream으로 변환
//        stream2.forEach(System.out::println); // 출력방법
        stream2.forEach(넘버 -> System.out.println("넘버 = " + 넘버));


//      1-3. 스트림 builder
        System.out.println("== 스트림 builder ==");
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build(); // 데이터 추가방법
        streamBuilder.forEach(System.out::println);

//      1-4. 스트림 generate
        System.out.println("== 스트림 generate ==");
        Stream streamGenerate = Stream.generate( () -> "abc" ).limit(3);
        streamGenerate.forEach(System.out::println);


//      1-5. 스트림 iterate
        System.out.println("== 스트림 iterate ==");
        Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(3);
        // Stream.iterate(초기값, 식).limit(몇번째까지);
        streamIterate.forEach(System.out::println);


//      1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림 ==");
        IntStream intStream = IntStream.range(1, 5); // 1부터 4까지의 데이터를 만듬
        // rangeClosed(1, 5); 는 1부터 5까지 데이터를 만든다
        intStream.forEach(System.out::println); // 1, 2, 3, 4



//      2. 스트림 중개 연산

//      2-1. Filtering
        System.out.println("== Filtering ==");
        IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 == 0);
        // 짝수 찾기
        intStream2.forEach(System.out::println);


//      2-2. Mapping
        System.out.println("== Mapping ==");
        IntStream intStream3 = IntStream.range(1, 10).map(n -> n + 1);
        // 데이터에 + 1 해서 출력
        intStream3.forEach(n -> System.out.print(n + " "));
        System.out.println();



//      2-3. Sorting
        System.out.println("== Sorting ==");
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();
        IntStream intStreamSort = intStream4.sorted(); // 정렬 오름차순
        intStreamSort.forEach(System.out::println);



//      3. 최종 연산

//      3-1. Sum, Average
        System.out.println("== sum, average ==");
        int sum = IntStream.range(1, 5).sum(); // 1부터 4까지 합을 해준다 = 10
        double average = IntStream.range(1, 5).average().getAsDouble(); // 평균
        // getAsDouble을 해야 double로 가져옴

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


//      3-2. Min, Max
        System.out.println("== min, max ==");
        int min = IntStream.range(1, 5).min().getAsInt(); // getAsInt로 int로 가져옴
        System.out.println("min = " + min); // 최소값
        int max = IntStream.range(1, 5).max().getAsInt();
        System.out.println("max = " + max); // 최대값


//      3-3. reduce
        System.out.println("== reduce ==");
        Stream<Integer> stream3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)).stream();
        System.out.println(stream3.reduce((x, y) -> x + y).get());

//      3-4. forEach
        System.out.println("== forEach == ");
        IntStream.range(1, 10).filter(n -> n == 5).forEach(System.out::println);


    }
}


