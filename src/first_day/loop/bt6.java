package first_day.loop;

/* Bài tập java 17:
Số hoàn hảo là số: Tổng các ước thực của nó bằng chính nó (ví dụ: 6 = 1+2+3)
Tìm tất cả những số hoàn thiện trong phạm vi từ 1-1000 */

public class bt6 {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum += i;
            }
            if (n == sum)
                System.out.println(n + " là số hoàn hảo");
        }
    }
}
