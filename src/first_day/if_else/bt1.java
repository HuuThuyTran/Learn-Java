package first_day.if_else;
import java.util.Scanner;

/*
Bài tập: Tìm x, y khi biết tổng và hiệu
case 1: Tong = 14, Hieu = 4 => x = 9, y = 5
case 2: Tong = 8, Hieu = 5 => x = 6.5, y = 1.5
*/

public class bt1 {
    public static void main(String[] args) {
        // Khai báo biến và nhập liệu
        Scanner sc = new Scanner(System.in);
        double x, y, tong, hieu;

        // Nhập tổng và hiệu
        System.out.print("Mời nhập tổng 2 số: ");
        tong = sc.nextDouble();
        System.out.print("Mời nhập hiệu 2 số: ");
        hieu = sc.nextDouble();

        // Tính x, y
        x = (tong + hieu) / 2;
        y = tong - x;

        // In kết quả
        System.out.printf("Kết quả: x = %.1f, y = %.1f", x, y);
    }
}
