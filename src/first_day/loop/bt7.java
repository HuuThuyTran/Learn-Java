package first_day.loop;

/* Bài tập java 18:
Viết chương trình nhập số nguyên a > 0 từ bàn phím.
Cho biết đó có phải số nguyên tố ( số nguyên tố là số > 1, và chỉ chia hết cho 1 và chính nó )
Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng phần mềm không? Nếu chọn không thì thoát ctrinh */

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Nhập số nguyên a > 0: ");
            int a = sc.nextInt();

            if (a < 0) {
                System.out.println("Vui lòng nhập số nguyên dương.");
            } else {
               if (a <= 1) {
                   System.out.println(a + " không phải là số nguyên tố.");
               } else {
                   boolean isPrime = true;
                   for (int i = 2; i < Math.sqrt(a); i++) {
                       if (a % i == 0) {
                           isPrime = false;
                           break;
                       }
                   }
                   if (isPrime) {
                       System.out.println(a + " là số nguyên tố.");
                   } else {
                       System.out.println(a + " không phải là số nguyên tố.");
                   }
               }
            }

            System.out.print("Bạn có muốn tiếp tục sử dụng phần mềm không? (y/n): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Kết thúc chương trình.");
    }
}
