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
    public static void installApp(int year, boolean os) {
        if (year > 2015&&os) {
            System.out.println("установите облегченную версию для "+os);
        } else if (year <= 2015 && os) {
            System.out.println("установите обычную версию для "+os);
        }
    }
    public static void main(String[] args) {
//       1е задание
        int year=2021;
        comeLeapYear(year);

//        2е задание
        boolean IOS=true;

        boolean Android=true;
        int yearOs=2016;
        installApp(yearOs, IOS);
    }
}