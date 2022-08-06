import java.time.LocalDate;

public class Main {
    public static boolean isVisoc(int year){
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void isOlder(int currentYear, int year, int os) {
        if (os == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int getDays(int distance) {
        if(distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        int year = 400;
        int os = 0;
        int currentYear = LocalDate.now().getYear();
        int distance = 60;
        if(isVisoc(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        isOlder(currentYear, year, os);
        System.out.println("Потребуется дней - " + getDays(distance));
    }
}