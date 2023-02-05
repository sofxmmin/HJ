package ch17.sec02;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

public class ParalleStreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("람다식");
        list.add("박병렬");

        //병렬처리
        Stream<String> paralleStram = list.parallelStream(); //병렬 스트림 얻기
        paralleStram.forEach(name -> {
            System.out.println(name + " : " + Thread.currentThread().getName());
        });
    }

}
