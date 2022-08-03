public class Main {

//   1е задание
    public static void comeLeapYear(int leapYear) {
        if (leapYear % 4 == 0) {
            System.out.println(leapYear + "- високосный год");
        } else {
            System.out.println(leapYear+"-не високосный год");
        }
    }
//
    public static void main(String[] args) {
//       1е задание
        int year=2021;
        comeLeapYear(year);
    }
}