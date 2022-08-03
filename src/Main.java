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
    public static void installApp(int year, int[] os) {
        for (int i = 0; i < os.length; i++) {
            if (os[i]==0&&year>2015) {
                System.out.println("установите облегченную версию приложения для IOS");
            } else if (os[i] == 0&&year<=2015) {
                System.out.println("установите обычную версию приложения для IOS");
            } else if (os[i] == 1 && year > 2015) {
                System.out.println("установите облегченную версию приложения для Android");
            } else {
                System.out.println("установите обычную версию приложения для Android");
            }
        }

    }
    public static void main(String[] args) {
//       1е задание
        int year=2021;
        comeLeapYear(year);

//        2е задание
        int[] oS={0,1};
        int IO = oS[0];
        int AN = oS[1];
        int yearOs=2016;
        installApp(yearOs,oS);
    }
}