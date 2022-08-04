public class Main {

//   1е задание
    public static void comeLeapYear(int leapYear) {
        if (leapYear % 4 == 0) {
            System.out.println(leapYear + "- високосный год");
        } else {
            System.out.println(leapYear+"-не високосный год");
        }
    }
//2е задание
    public static void installApp(int year, int os) {
        if (year > 2015 && os == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year > 2015 && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year <= 2015 && os == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (year <= 2015 && os == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }


    public static void main(String[] args) {
//
//       1е задание

        int year=2021;
        comeLeapYear(year);

//
//        2е задание

        int ios=0;
        int androidOs=1;
        int yearOs=2014;
        installApp(yearOs,ios);
    }
}