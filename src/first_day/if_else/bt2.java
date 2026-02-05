package first_day.if_else;
import java.util.Scanner;

/*
Bài tập: Viết chương trình nhập vào chiều cao, cân nặng, tính BMI và xuất ra thông báo
BMI < 15: Thân hình quá gầy
BMI >= 15 and BMI < 16: Thân hình gầy
BMI >= 16 and BMI < 18.5: Thân hình hơi gầy
BMI >= 18.5 and BMI < 25: Thân hình bình thường
BMI >= 25 and BMI < 30: Thân hình hơi béo
BMI >= 30 and BMI < 35: Thân hình béo
BMI >= 35: Thân hình quá béo
*/

public class bt2 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        double chieuCao, canNang, bmi;

        // Nhập chiều cao và cân nặng
        System.out.print("Nhập chiều cao (m): ");
        chieuCao = sc.nextDouble();
        System.out.print("Nhập cân nặng (kg): ");
        canNang = sc.nextDouble();

        // Tính BMI
        bmi = canNang / (Math.pow(chieuCao, 2));
        System.out.printf("BMI của bạn là: %.1f \n", bmi);

        // Xuất kết quả
        System.out.print("Kết quả đánh giá thân hình => ");
        if (bmi < 15) {
            System.out.println("Thân hình quá gầy");
        } else if (bmi >= 15 && bmi < 16) {
            System.out.println("Thân hình gầy");
        } else if (bmi >= 16 && bmi < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Thân hình bình thường");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Thân hình béo");
        } else {
            System.out.println("Thân hình quá béo");
        }
    }
}
