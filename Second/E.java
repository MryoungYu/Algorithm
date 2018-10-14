import java.util.Scanner;

/*
 * 反过来推即可
 * 如何能够在自己的回合里使m大于n？即当前的m > n/9，这样乘9就行了。
 * 那么如何逼迫对方回合结束后m > n / 9呢？那就是我方操作后令m > n / 18即可，这样对方即使乘以2，也够我方赢得。
 * 以此类推，每轮都除以 2*9 = 18，如果剩下的数比9小，那么先做的人（18181818118）可以达到这个值，就有必胜策略。反之如果大于9，那么先手的人达不到这个值，后手的人可以达到，则后手的ZBT必胜。
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = in.nextInt();
        while (d > 18) {
            d = d / 18;
        }
        if (d > 9) {
            System.out.println("ZBT");
        } else {
            System.out.println("181818181818");
        }
    }
}
