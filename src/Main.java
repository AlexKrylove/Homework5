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
        //
        System.out.println("Task4");
        int deliveryDist = 95;
        if (deliveryDist >0 && deliveryDist <=20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDist > 20 && deliveryDist <=60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDist > 60 && deliveryDist <=100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не возможна");
        }
        //
        System.out.println("Task5");
        int month = 14;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("SRPING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}