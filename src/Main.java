public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Андроид по ссылке");
        }
        //
        System.out.println("Task2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию для IOS по ссылке");
            }else if (clientOS == 1 ) {
                System.out.println("Установите версию для Андроид по ссылке");
            }
        }
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
            }
        }
        //
        System.out.println("Task3");
        int year = 2020;
        if (year % 4 == 0 && year % 400 != 0 || year % 400 ==0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}