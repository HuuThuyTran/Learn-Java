package first_day.try_catch;

// Try Catch dùng để bắt lỗi chương trình khi chạy, tránh chương trình bị crash
// Có thẻ sử dụng nhiều catch để bắt nhiều lỗi khác nhau


public class try_catch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Kết quả: " + c);
        } catch (ArithmeticException ar) {
            System.out.println("Lỗi: " + ar.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc khối try-catch.");
        }
    }
}
