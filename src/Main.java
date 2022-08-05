public class Main {

    //   1е задание
    /*
    *         int year=2022;
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println(year+"год является високосным");
        }else{
            System.out.println(year+"год не является високосным");
        }*/
    public static void comeLeapYear(int leapYear) {
        if ((leapYear%4==0)&&(leapYear%100!=0)||(leapYear%400==0)) {
            System.out.println(leapYear + "- високосный год");
        } else {
            System.out.println(leapYear + "-не високосный год");
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

    //    3е задание
    public static short goDistance (short distance) {
        short time=1;
        if ( distance<=20) {
            time=1;
        } else if (distance > 20 && distance < 60) {
            time=2;
        } else if (distance >= 60 && distance < 100) {
            time=3;
        }
        return time;
    }


    public static void main(String[] args) {
//
//       1е задание

        int year = 2000;
        comeLeapYear(year);

//
//        2е задание

        int ios = 0;
        int androidOs = 1;
        int yearOs = 2014;
        installApp(yearOs, ios);

//        3е задание
        short deliveryDistance=80;
        System.out.println("Потребуеться время на доставку-"+goDistance(deliveryDistance)+" дня");


     /*   short deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуеться дней" + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуеться дней" + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуеться дней" + 3);
        } */
    }
}