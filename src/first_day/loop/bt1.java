package first_day.loop;

/*
Viết chuơng trình nhập vào số nguyên n, in ra kết quả n!
Dùng vòng lặp for, while để giải quyết bài toán trên.
Vd: 3! = 3 x 2 x 1 = 6
*/

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = sc.nextInt();
        // Dùng vòng lặp for
        int factorial1 = 1;
        for (int i = 1; i <= n; i++) {
            factorial1 *= i;
        }
        System.out.printf("C1. Kết quả %d! = %d", n, factorial1);
        // Dùng vòng lặp while
        int factorial2 = 1;
        int i = 1;
        while (i <= n) {
            factorial2 *= i;
            i++;
        }
        System.out.printf("\nC2. Kết quả %d! = %d", n, factorial2);
    }
}
