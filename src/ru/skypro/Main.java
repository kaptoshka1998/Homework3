package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }

        // Задание 2
        int year = 2100;
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                if (clientOS == 1 && year >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
        }

        // Задание 3
        //переменная года используется из прошлого задания
        if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
                System.out.println("Потребуется дней: 2");
            } else {
                if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
                    System.out.println("Потребуется дней: 3");
                }
            }
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Это месяц зимы");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Это месяц весны");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Это месяц лета");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Это месяц осени");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}
