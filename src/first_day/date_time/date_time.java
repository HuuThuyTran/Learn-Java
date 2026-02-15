package first_day.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date_time {
    public static void main(String[] args) {
        // Lấy ngày giờ hiện tại
        LocalDate currentDate = LocalDate.now();
        System.out.println("Ngày hiện tại: " + currentDate);
        // Tạo một ngày cụ thể
        LocalDate specificDate = LocalDate.of(2024, 6, 15);
        System.out.println("Ngày cụ thể: " + specificDate);
        // So sánh hai ngày
        if (currentDate.isBefore(specificDate)) {
            System.out.println("Ngày hiện tại trước ngày cụ thể.");
        } else if (currentDate.isAfter(specificDate)) {
            System.out.println("Ngày hiện tại sau ngày cụ thể.");
        } else {
            System.out.println("Ngày hiện tại và ngày cụ thể là cùng một ngày.");
        }
        // Thêm ngày vào ngày hiện tại
        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println("Ngày sau 10 ngày: " + futureDate);
        // Trừ ngày từ ngày hiện tại
        LocalDate pastDate = currentDate.minusDays(5);
        System.out.println("Ngày trước 5 ngày: " + pastDate);
        // Lấy ngày trong tuần
        String dayOfWeek = currentDate.getDayOfWeek().toString();
        System.out.println("Ngày(Thứ) trong tuần: " + dayOfWeek);
        // Lấy ngày trong tháng
        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println("Ngày trong tháng: " + dayOfMonth);
        // Lấy ngày trong năm
        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("Ngày trong năm: " + dayOfYear);
        // Lấy năm
        int year = currentDate.getYear();
        System.out.println("Năm: " + year);
        // Lấy tháng
        int month = currentDate.getMonthValue();
        System.out.println("Tháng: " + month);
        // Lấy ngày
        int day = currentDate.getDayOfMonth();
        System.out.println("Ngày: " + day);
        // Kiểm tra xem năm có phải là năm nhuận không
        boolean isLeapYear = currentDate.isLeapYear();
        String answer = isLeapYear ? "Có" : "Không";
        System.out.println("Năm nhuận: " + answer);
        // Lấy ngày đầu tiên của tháng
        LocalDate firstDayOfMonth = currentDate.withDayOfMonth(1);
        System.out.println("Ngày đầu tiên của tháng: " + firstDayOfMonth);
        // Lấy ngày cuối cùng của tháng
        LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
        System.out.println("Ngày cuối cùng của tháng: " + lastDayOfMonth);
        // Ngăn cách dòng
        System.out.println("-----------------------------------");
        // Lấy giờ hiện tại
        LocalTime currentTime = LocalTime.now();
        System.out.println("Giờ hiện tại: " + currentTime);
        // Tạo một giờ cụ thể
        LocalTime specificTime = LocalTime.of(14, 30, 0);
        System.out.println("Giờ cụ thể: " + specificTime);
        // So sánh hai giờ
        if (currentTime.isBefore(specificTime)) {
            System.out.println("Giờ hiện tại trước giờ cụ thể.");
        } else if (currentTime.isAfter(specificTime)) {
            System.out.println("Giờ hiện tại sau giờ cụ thể.");
        } else {
            System.out.println("Giờ hiện tại và giờ cụ thể là cùng một giờ.");
        }
        // Thêm giờ vào giờ hiện tại
        LocalTime futureTime = currentTime.plusHours(2);
        System.out.println("Giờ sau 2 giờ: " + futureTime);
        // Trừ giờ từ giờ hiện tại
        LocalTime pastTime = currentTime.minusHours(1);
        System.out.println("Giờ trước 1 giờ: " + pastTime);
        // Lấy giờ, phút, giây từ giờ hiện tại
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println(STR."Giờ: \{hour}, Phút: \{minute}, Giây: \{second}");
        // Kiểm tra xem giờ có phải là buổi sáng hay buổi chiều
        String timeOfDay = (hour < 12) ? "Buổi sáng" : "Buổi chiều";
        System.out.println("Thời gian trong ngày: " + timeOfDay);
        // Lấy giờ đầu tiên của ngày
        LocalTime startOfDay = LocalTime.MIDNIGHT;
        System.out.println("Giờ đầu tiên của ngày: " + startOfDay);
        // Lấy giờ cuối cùng của ngày
        LocalTime endOfDay = LocalTime.MAX;
        System.out.println("Giờ cuối cùng của ngày: " + endOfDay);
        // Ngăn cách dòng
        System.out.println("-----------------------------------");
        // Lấy ngày và giờ hiện tại
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Ngày giờ hiện tại: " + now);
        // Tạo một ngày và giờ cụ thể
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 6, 15, 14, 30, 0);
        System.out.println("Ngày giờ cụ thể: " + specificDateTime);
        // So sánh hai ngày và giờ
        if (now.isBefore(specificDateTime)) {
            System.out.println("Ngày giờ hiện tại trước ngày giờ cụ thể.");
        } else if (now.isAfter(specificDateTime)) {
            System.out.println("Ngày giờ hiện tại sau ngày giờ cụ thể.");
        } else {
            System.out.println("Ngày giờ hiện tại và ngày giờ cụ thể là cùng một thời điểm.");
        }
        // Thêm ngày và giờ vào ngày giờ hiện tại
        LocalDateTime futureDateTime = now.plusDays(5).plusHours(3);
        System.out.println("Ngày giờ sau 5 ngày và 3 giờ: " + futureDateTime);
        // Trừ ngày và giờ từ ngày giờ hiện tại
        LocalDateTime pastDateTime = now.minusDays(2).minusHours(1);
        System.out.println("Ngày giờ trước 2 ngày và 1 giờ: " + pastDateTime);
        // Lấy các thành phần của ngày giờ hiện tại
        int currentYear = now.getYear();
        int currentMonth = now.getMonthValue();
        int currentDay = now.getDayOfMonth();
        int currentHour = now.getHour();
        int currentMinute = now.getMinute();
        int currentSecond = now.getSecond();
        System.out.println(STR."Năm: \{currentYear}, Tháng: \{currentMonth}, Ngày: \{currentDay}, Giờ: \{currentHour}, Phút: \{currentMinute}, Giây: \{currentSecond}");
        // Ngăn cách dòng
        System.out.println("-----------------------------------");
        // Format ngày
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Ngày được định dạng: " + formattedDate);
        // Format giờ
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Giờ được định dạng: " + formattedTime);
        // Format ngày giờ
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(dateTimeFormatter);
        System.out.println("Ngày giờ được định dạng: " + formattedDateTime);
        // Phân tích chuỗi thành ngày
        String dateString = "20-06-2024";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Ngày phân tích từ chuỗi: " + parsedDate);
        // Phân tích chuỗi thành giờ
        String timeString = "15:45:30";
        LocalTime parsedTime = LocalTime.parse(timeString, timeFormatter);
        System.out.println("Giờ phân tích từ chuỗi: " + parsedTime);
        // Phân tích chuỗi thành ngày giờ
        String dateTimeString = "20-06-2024 15:45:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("Ngày giờ phân tích từ chuỗi: " + parsedDateTime);
    }
}
