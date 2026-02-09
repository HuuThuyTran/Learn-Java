package first_day.loop;

/*
Bài tập:
Viết chương trình: Tính tổng S= 1! + 2! + 3! + ... + n!
*/

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }

        System.out.println("Tổng S= 1! + 2! + ... + " + n + "! là: " + sum);
    }
}
