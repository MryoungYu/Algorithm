import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 在做带余除法的过程中，先有选择权（商大于1）的一方，可以改变形势，因此必胜。
 * 对于(m, n)，令m = k * n + b,假设得到(n, b)的一方会获胜，则选择(n, n + b)，此时下一轮对手只能选择(n, b)，则我方获胜。
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> resList = new ArrayList<>();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a < b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            int flag = 1;
            while (a / b == 1 && a % b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
                flag = 1 - flag;
            }
            if (flag == 1) {
                resList.add("Stan wins");
            } else {
                resList.add("Ollie wins");
            }
        }
        for (String res : resList) {
            System.out.println(res);
        }
    }
}
