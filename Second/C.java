import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 两个数中如果出现1，就直接胜利了，输出Matrix67
 * 接着，2和3最为特殊，因为它俩无论怎样都会分解出1来，称它为必败数。当两个数都是必败数时，Matrix67只能将其中一个拆成包含1的一对数，Shadow胜利。
 * 再考虑4,5,6，这三个数可以只拆出2和3来，可以只拆出必败数，Matrix67胜利
 * 接着7和8，无法只拆出必败数2和3，也是必败数。
 * 依次类推，（2,3,7,8）无法成（12,13）->(17,18)...因此，个位数是2,3,7,8的数是必败数，当两个数都是必败数时Shadow胜利，否则Matrix67胜利
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        List<String> resList = new ArrayList<>();
        while (n-- > 0) {
            String input = in.nextLine();
            String[] arrStr = input.split(" ");
            String strA = arrStr[0];
            String strB = arrStr[1];
            char a = strA.charAt(strA.length() - 1);
            char b = strB.charAt(strB.length() - 1);
            if ((a == '3' || a == '2' || a == '7' || a == '8') && (b == '3' || b == '2' || b == '7' || b == '8')) {
                resList.add("Shadow");
            } else {
                resList.add("Matrix67");
            }
        }
        for (String res : resList) {
            System.out.println(res);
        }
    }
}
