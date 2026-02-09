package first_day.loop;

/* Bài tập Java 13:
Viết chương trình nhập số a từ bàn phím,
Nếu a chẵn thì tính tổng các số chẵn từ 0 đến a
Nếu a lẻ thì in ra dòng chữ “tôi o tính tổng số lẻ, bye bye ” và thoát chương trình
*/

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        // Khai báo biến và nhập số a từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        // Kiểm tra a chẵn hay lẻ
        if (a % 2 != 0) {
            System.out.println("Tôi o tính tổng số lẻ, bye bye");
        } else {
            int sum = 0;
            for (int i = 0; i <= a; i++) {
                sum += i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến " + a + " là: " + sum);
        }
    }
}
