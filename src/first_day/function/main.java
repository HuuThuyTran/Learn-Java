package first_day.function;

// Bài java 21:
// Khi muốn tái sử dụng một đoạn mã nhiều lần trong chương trình, ta sẽ sử dụng function
// Function giúp code của chương trình gọn gàng, dễ đọc và dễ bảo trì hơn
// Cú pháp:
// <access-modifier> <data-type> <function-name>(<parameters>) {
//      // body function (đoạn code xử lý)
//      return <data>;
// }
// static thuộc về class, ko static thuộc về object

public class main {
    public static void main(String[] args) {
        helloWorld();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // Tạo hàm ptb2
    public static void ptb2(int a, int b, int c) {
        // Giải phương trình bậc hai: ax^2 + bx + c = 0

        // Kiểm tra a có bằng 0 không
        if (a == 0) {
            System.out.println("Phương trình không phải bậc hai");
            return;
        }

        // Tính delta
        double delta = b * b - (4 * a * c);

        // Xét các trường hợp của delta
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            System.out.println(STR."Phương trình có nghiệm kép: x1 = x2 = \{x}");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println(STR."Phương trình có hai nghiệm phân biệt: x1 = \{x1}, x2 = \{x2}");
        }
    }

    // Tạo hàm nhập phép tính
    public static void calculator(int a, int b, String operator) {
        switch (operator) {
            case "+" -> System.out.println(STR."Kết quả: \{a + b}");
            case "-" -> System.out.println(STR."Kết quả: \{a - b}");
            case "*" -> System.out.println(STR."Kết quả: \{a * b}");
            case "/" -> {
                if (b == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0");
                } else {
                    System.out.println(STR."Kết quả: \{a / b}");
                }
            }
            default -> System.out.println("Lỗi: Phép toán không hợp lệ");
        }
    }

    public static void helloWorld() {
        System.out.println("Hello World");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println(STR."Sum: \{sum(10, 20)}");
        System.out.println("-----------------");
        System.out.println("-----------------");
        ptb2(1, 2, 3);
        ptb2(1, 2, 1);
        ptb2(1, 2, -3);
        System.out.println("-----------------");
        System.out.println("-----------------");
        calculator(10, 5, "+");
        calculator(10, 5, "-");
        calculator(10, 5, "*");
        calculator(10, 0, "/");
        calculator(10, 5, "/");
    }
}
