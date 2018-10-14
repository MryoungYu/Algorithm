import java.util.Arrays;
import java.util.Scanner;

/*
 * 事实上我们只需要关心黑色三角形（第一个输入的三角形）的位置在哪
 * 如果黑色三角形在边上，则JMCat胜利，那么顶点可能情况有可能情况有(k,k+1,k+2)(n-1,0,1)(n-2,n-1,0)三种，其中n为边数，k为0到n-1的任意值
 * 如果边数为偶数，则猫必胜；如果边数为奇数且黑三角不在外边，则猫必败。
 * 原因：剪下在中间的三角形，偶数边三角形需要偶数步，奇数三角形需要奇数步。因为在剪下黑色三角形的那个回合，黑色三角形会和最后一个三角形连在一起，即只剩2个三角形。
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int[] triangle = new int[3];
        triangle[0] = in.nextInt();
        triangle[1] = in.nextInt();
        triangle[2] = in.nextInt();
        Arrays.sort(triangle);
        for (i = 1; i < n - 2; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
        }
        if (triangle[0] + 1 == triangle[1] && triangle[1] + 1 == triangle[2]) {
            System.out.println("JMcat Win");
        } else if (triangle[0] + n == triangle[2] + 1 && triangle[0] + 1 == triangle[1]) {
            System.out.println("JMcat Win");
        } else if (triangle[0] + n == triangle[1] + 1 && triangle[1] + 1 == triangle[2]) {
            System.out.println("JMcat Win");
        } else if (n % 2 == 1){
            System.out.println("PZ Win");
        } else {
            System.out.println("JMcat Win");
        }
    }
}
