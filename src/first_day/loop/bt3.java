package first_day.loop;

/* Bài tập Java 14: Viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím.
1. Nhập n = 7, Bỏ qua cộng tổng với số 3 => in ra kết quả (gợi ý đáp án : 1+5+7 = 13)
2. Thử break khi vòng lặp chạy đến giá trị n=3
*/

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            int sum = 0;
            for (int i = 1; i <= n; i+=2) {
                if (i == 3) {
                    continue; // Bỏ qua số 3
                    //break;
                }
                sum += i;
            }
            System.out.println("Tổng các số lẻ từ 1 đến " + n + " (bỏ qua số 3) là: " + sum);
        }
    }
}
