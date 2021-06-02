package inflearn.codesquad.part2Gugudan.C8_classgugudan;
/*
210601 https://www.inflearn.com/course/java-codesquad/lecture/7205?tab=curriculum
인프런 만들어 가면서 배우는 JAVA 플레이그라운드
파트2.구구단
Class 8. 클래스로 구구단 다시 구현
 */
public class C8_classgugudan {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for(int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for(int i=0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
