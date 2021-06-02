package inflearn.codesquad.part2Gugudan;
/*
210601 https://www.inflearn.com/course/java-codesquad/lecture/7203?tab=curriculum
인프런 만들어 가면서 배우는 JAVA 플레이그라운드
파트2.구구단
Class 5. 8,9단 구현 - 값 입력 및 조건문
 */
public class C6_arraygugudan {
    public static void main(String[] args) {
        // 2단
        int[] result = new int[9];
        for(int i = 0; i < result.length; i++) {
            result[i] = 2 * (i + 1);
        }
        for(int i=0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        // 3단
        int[] times3 = new int[9];
        for(int i = 0; i < result.length; i++) {
            result[i] = 3 * (i + 1);
        }
        for(int i=0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    };
}
