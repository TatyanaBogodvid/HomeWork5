public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int iOS = 0;
        int android = 1;
        int clientOS = 1;
        if(clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");
        }

        //Задача 2
        System.out.println("Задача 2");
        int deviceYear = 2015;
        int clientDeviceYear = 2016;
        if(clientOS == iOS && clientDeviceYear >= deviceYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if(clientOS == android && clientDeviceYear >= deviceYear) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == iOS && clientDeviceYear <= deviceYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == android && clientDeviceYear <= deviceYear){
            System.out.println("Установите облегченную версию для Android по ссылке");
        }

        //Задача 3
        System.out.println("Задача 3");
        int year = 202;
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является высокосным");
        } else {
                System.out.println(year + " год не является высокосным");
            }

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int bazaDeliveryTime = 1;
        int bazaDeliveryDistance = 20;
        int interval = 40;
        if (deliveryDistance <= bazaDeliveryDistance) {
            System.out.println("Потребуется дней: " + bazaDeliveryTime);
        } else if(deliveryDistance > bazaDeliveryDistance && deliveryDistance < (bazaDeliveryDistance + interval)){
            System.out.println("Потребуется дней: " + (bazaDeliveryTime + bazaDeliveryTime));
        } else if(deliveryDistance > (bazaDeliveryDistance + interval) && deliveryDistance < (bazaDeliveryDistance + 2 * interval)){
            System.out.println("Потребуется дней: " + (3 * bazaDeliveryTime));
        } else if(deliveryDistance > (bazaDeliveryDistance + 2 * interval) && deliveryDistance < (bazaDeliveryDistance + 3 * interval)) {
            System.out.println("Потребуется дней: " + (4 * bazaDeliveryTime));
        }

        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь. Зима");
                break;
            case 2:
                System.out.println("Февраль. Зима");
                break;
            case 3:
                System.out.println("Март. Весна");
                break;
            case 4:
                System.out.println("Апрель. Весна");
                break;
            case 5:
                System.out.println("Май. Весна");
                break;
            case 6:
                System.out.println("Июнь. Лето");
                break;
            case 7:
                System.out.println("Июль. Лето") ;
                break;
            case 8:
                System.out.println("Август. Лето");
                break;
            case 9:
                System.out.println("Сентябрь. Осень");
                break;
            case 10:
                System.out.println("Октябрь. Осень");
                break;
            case 11:
                System.out.println("Ноябрь. Осень");
                break;
            case 12:
                System.out.println("Декабрь. Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}