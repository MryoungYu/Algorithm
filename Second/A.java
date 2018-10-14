/import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 每次做操作时月份或日期加1，会改变（月份 + 日期）的奇偶性，所以核心思想是判断奇偶性来判断是否取胜
 * 易知：11月3日和10月4日是必胜的日期，即月+日是偶数的日期是必胜日
 * 但是，留意一个特殊的情况，每月到了最后一天时，日期加1会变到下一天，每个月如果有31天（或者闰年2月29天），则不会发生变化。
 * 那么，2月（28天）、4、6、9、11，这5个月到了最后一天时，如果轮到Adam操作，可以通过选择增加月份避免奇偶性不发生变化。因此除了月+日为偶数的日期之外，应该加上9月30日和11月30日。
 * 因为这几个月的最后一天2月28日，4月30日，6月30日的月+日为偶数，可以纳入奇偶归纳。
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> resList = new ArrayList<>();
        int i = 0;
        for (i = 0; i < n; i++) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            if (month == 9 && day == 30) {
                resList.add("YES");
            } else if (month == 11 && day == 30) {
                resList.add("YES");
            } else if ((month + day) % 2 == 0) {
                resList.add("YES");
            } else {
                resList.add("NO");
            }
        }
        for (String res : resList) {
            System.out.println(res);
        }
    }
}
