package first_day.if_else;

/*
Bài tập java 08: Viết chương trình giải phương trình bậc 2 : ax^2 + bx + c (ở đây chỉ viết cho trường hợp a # 0)
case1 : a=1, b=2, c=-3 Pt có 2 nghiệm x1=1.0 x2 = -3.0
case2 : a=1, b=2, c=1 Pt có nghiệm kép x1=x2 = -1.0
case3 : a=1, b=1, c=1 => Pt vô nghiệm
*/

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        // Khai báo bến và nhập dữ liệu
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhập hệ số a (a ≠ 0): ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();

        // Kiểm tra a có khác 0 không
        if (a == 0) {
            System.out.println("Hệ số 'a' phải khác 0. Vui lòng chạy lại chương trình và nhập giá trị hợp lệ.");
        } else {
            // Tính delta
            double delta = (b * b) - (4 * a * c);
            System.out.println("Delta = " + delta);
            // Giai phương trình bậc 2
            if (delta > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}
