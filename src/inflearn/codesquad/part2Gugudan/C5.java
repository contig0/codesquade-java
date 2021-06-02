package inflearn.codesquad.part2Gugudan;

import java.util.Scanner;

/*
210601 https://www.inflearn.com/course/java-codesquad/lecture/7202?tab=curriculum
인프런 만들어 가면서 배우는 JAVA 플레이그라운드
파트2.구구단
Class 5. 8,9단 구현 - 값 입력 및 조건문
 */

public class C5 {
    public static void main(String[] args) {

        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("사용자가 입력한 값 : " + number);

        if(number < 2) {
            System.out.println("값을 잘못 입력했습니다.");
        } else if (number > 9) {
            System.out.println("값을 잘못 입력했습니다.");
        } else {
            for(int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}
