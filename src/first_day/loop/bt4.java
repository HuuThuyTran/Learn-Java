package first_day.loop;

/*
Bài tập
Viết chương trình: Tìm những số chia hết cho 3 từ 10 đến 50
*/

public class bt4 {
    public static void main(String[] args) {
        for (int i = 10; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
