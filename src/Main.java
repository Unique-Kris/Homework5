public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS == 1) {System.out.println("Установите версию приложения для Android по ссылке");}
        else {System.out.println("Операционная система не определена");}

        System.out.println("Задание 2");
        int yearOfRelease = 2014;
        if (clientOS == 0 && yearOfRelease >= 2015) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS == 0 && yearOfRelease < 2015) {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 1 && yearOfRelease >= 2015) {System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS == 1 && yearOfRelease < 2015) {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else {System.out.println("Операционная система не определена");}

        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");}
        else {System.out.println("Год " + year + " не является високосным");}

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + day);}
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (day + 1));}
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (day + 2));}
        else {System.out.println("Доставка не осуществляется");}

        System.out.println("Задание 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }

}