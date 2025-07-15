package com.devsimwave.section02.functionalinterface.api.predicate;

import com.devsimwave.section02.functionalinterface.api.predicate.dto.Players;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Application6 {
    public static void main(String[] args) {
        /* Predicate 인터페이스는 true/false 판단할 때 사용되는 함수형 인터페이스다.
         *
         * Predicate 인터페이스의 종류
         *
         * 인터페이스 명 : Predicate<T>
         * 설명        : 객체 T를 받아 조건을 검사하고 true/false 반환
         *
         * 인터페이스 명 : BiPredicate<T, U>
         * 설명        : 두 객체 T, U를 받아 조건 검사 후 true/false 반환
         *
         * 인터페이스 명 : IntPredicate
         * 설명        : 기본형 int를 받아 조건을 검사하고 true/false 반환
         *
         * 인터페이스 명 : LongPredicate
         * 설명        : 기본형 long을 받아 조건을 검사하고 true/false 반환
         *
         * 인터페이스 명 : DoublePredicate
         * 설명        : 기본형 double을 받아 조건을 검사하고 true/false 반환
         *
         */

        Players player1 = new Players("흥민쏜", "토트넘", "forward", 33);
        Players player2 = new Players("민재킴", "뮌헨", "defender", 28);
        Players player3 = new Players("김미히", "뮌헨", "defender", 29);
        Players player4 = new Players("노이어", "뮌헨", "defender", 38);

        // Predicate<T>
        Predicate<Players> isForward = player -> "forward".equals(player.getPosition());
        System.out.println("isForward: " + isForward.test(player1));

        // BiPredicate<T, U>
        BiPredicate<Players, Players> sameAge = (p1, p2) -> p1.getAge() == p2.getAge();
        System.out.println("sameAge: " + sameAge.test(player1, player2));  // false

        // IntPredicate
        IntPredicate isOlderThan30 = age -> age > 30;
        System.out.println("isOlderThan30: " + isOlderThan30.test(player1.getAge()));

        // LongPredicate
        LongPredicate isLongPositive = l -> l > 0L;
        System.out.println("isLongPositive: " + isLongPositive.test(100L));

        // DoublePredicate
        DoublePredicate isHighScore = score -> score >= 8.5;
        System.out.println("isHighScore: " + isHighScore.test(7.8));  // false

        /**
         * 주요 조합 메서드
         * - and()     : 두 조건이 모두 true일 때 true
         * - or()      : 둘 중 하나라도 true면 true
         * - negate()  : 조건 결과를 반대로 뒤집음 (true → false)
         * - isEqual() : 객체가 특정 값과 같은지 비교
         */

        // 조합: and()
        Predicate<Players> isKoreanForward =
                isForward.and(player -> "토트넘".equals(player.getTeam()));
        System.out.println("isKoreanForward: " + isKoreanForward.test(player1));

        // 조합: negate()
        Predicate<Players> isNotForward = isForward.negate();
        System.out.println("isNotForward: " + isNotForward.test(player2));

        // isEqual()
        Predicate<String> isJava = Predicate.isEqual("Java");
        System.out.println("isJava: " + isJava.test("Java"));

        /*
        *  실무에서 자주 사용하는 메소드
        * - filter() : Stream에서 조건에 맞는 요소만 남김 Predicate<T>
        * - removeIf() :조건에 맞는 요소를 컬렉션에서 제거 Predicate<T>
        * - Optional.filter(): 값이 특정 조건을 만족할 때만 유지 Predicate
        * */

        // filter
        List<Players> players = new ArrayList<>(List.of(player1, player2, player3, player4));

        players.stream()
                .filter(player -> player.getAge() > 30)
                .forEach(System.out::println);

        // removeIf
        players.removeIf(player -> player.getAge() > 30);
        System.out.println(players);

        Optional<String> name = Optional.of("Java");

        Optional<String> result = name.filter(s -> s.length() >= 4);
        System.out.println("Optional.filter() 조건 만족: " + result);

        Optional<String> fail = name.filter(s -> s.startsWith("X"));
        System.out.println("Optional.filter() 조건 불만족: " + fail);
    }
}
