package first_day.if_else;
/*
Bài tập:
Đề bài: Viết chương trình cho người dùng nhập vào 1 tháng bất kỳ từ 1 - 12 => Cho biết tháng đó có bao nhiêu ngày?

Gợi ý:
Tháng 1, 3, 5, 7, 8, 10, 12: Có 31 ngày
Tháng 4, 6, 9, 11: Có 30 ngày

Nếu là tháng 2: Yêu cầu nhập thêm năm:
- Nếu năm nhuận thì tháng 2 có 29 ngày
- Nếu năm không nhuận thì tháng 2 có 28 ngày
*/

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        // Khai bao biến và nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        int month;

        // Nhập tháng từ 1 -> 12
        System.out.print("Nhập vào tháng (1-12): ");
        month = sc.nextInt();

        // Kiểm tra tháng đó có nằm trong khoảng từ 1 đến 12 không
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ! Vui lòng nhập tháng từ 1 đến 12.");
        } else {
            // Kiểm tra số ngày trong tháng đó
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("Tháng " + month + " có 31 ngày.");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("Tháng " + month + " có 30 ngày.");
                    break;
                case 2:
                    // Yêu cầu nhập năm
                    System.out.print("Nhập vào năm: ");
                    int year = sc.nextInt();

                    // Kiểm tra năm nhuận hay không
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println("Tháng 2 của năm " + year + " có 29 ngày.");
                    } else {
                        System.out.println("Tháng 2 của năm " + year + " có 28 ngày.");
                    }
                    break;
            }
        }
    }
}
