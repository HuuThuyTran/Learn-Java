package first_day.if_else;

/*
Bài tập Java 09: Viết chương trình nhập vào tháng trong năm, cho biết tháng đó thuộc quý mấy
Gợi ý :
1 năm có 4 quý, mỗi quý 3 tháng :
- Quý 1 : tháng 1, 2, 3
- Quý 2 : tháng 4, 5, 6
- Quý 3 : tháng 7, 8, 9
- Quý 4 : tháng 10, 11, 12
*/

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tháng trong năm (1-12): ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 3) {
            System.out.println("Tháng " + month + " thuộc Quý 1.");
        } else if (month >= 4 && month <= 6) {
            System.out.println("Tháng " + month + " thuộc Quý 2.");
        } else if (month >= 7 && month <= 9) {
            System.out.println("Tháng " + month + " thuộc Quý 3.");
        } else if (month >= 10 && month <= 12) {
            System.out.println("Tháng " + month + " thuộc Quý 4.");
        } else {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập số từ 1 đến 12.");
        }
    }
}
