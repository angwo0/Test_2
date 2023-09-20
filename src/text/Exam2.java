package text;

public class Exam2 {
    public static void main(String[] args) {

        // 높이를 입력해주세요 : 3                // 출력
        star(3);
        /*

         *

         ***

         *****

         */

        // 높이를 입력해주세요 : 5
        star(5);
        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이를 입력해주세요 : 7
        star(7);
        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */
    }
    public static void star (int idx) {
        int line = 0;
        for (int i = 1; i <= idx; i++) {
            for (int j = 1; j <= idx * 2; j++) {
                line = idx - i;
                if (line < j && j < (idx * 2) - line) {
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

