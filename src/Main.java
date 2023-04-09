public class Main {
    public static void divisionInYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год являеться высокостным.");
        } else {
            System.out.println(year + " год не являеться высокостным.");
        }
    }

    public static void definitionClientProgram(int clientOS, int clientDeviceYear) {
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("«Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Не правильный вариант, попробуйте снова!");
        }
    }

    public static void deliveryDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет!");
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2013;
        divisionInYear(year);
    }


    public static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2023;
        definitionClientProgram(clientOS, clientDeviceYear);

    }

    public static void task3() {
        System.out.println("Задача 3");

        int distance = 19;
        deliveryDistance(distance);
    }
}