package inflearn.codesquad.part2Gugudan.C8_classgugudan;
/*
210601 https://www.inflearn.com/course/java-codesquad/lecture/7205?tab=curriculum
인프런 만들어 가면서 배우는 JAVA 플레이그라운드
파트2.구구단
Class 8. 클래스로 구구단 다시 구현
 */
public class C8_classgugudanMain {

    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            int[] result = C8_classgugudan.calculate(i);
            C8_classgugudan.print(result);
            System.out.println();
        }
    }
}
