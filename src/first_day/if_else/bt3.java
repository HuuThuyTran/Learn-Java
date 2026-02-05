package first_day.if_else;

/*
Bài tập: Viết chương trình nhập vào 1 năm dương lịch, kiểm tra năm đó có phải năm nhuận hay không .
Gợi ý : Năm nhuận là năm
(chia hết cho 4, và không chia hết cho 100) hoặc ( chia hết cho 400)

Case test :
Năm nhuận : 2004, 2008, 2012, 2016, 2020, 2024
Năm không nhuận : 1900, 2005
*/

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        int year;

        // Nhập năm
        System.out.print("Nhập vào một năm dương lịch: ");
        year = sc.nextInt();

        // Kiểm tra năm đó PHẢI LÀ SỐ DƯƠNG
        if (year > 0) {
            // Kiểm tra năm nhuận
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " là năm nhuận.");
            } else {
                System.out.println(year + " không phải là năm nhuận.");
            }
        } else {
            System.out.println("Năm không hợp lệ! Vui lòng nhập năm dương lịch.");
        }

    }
}
