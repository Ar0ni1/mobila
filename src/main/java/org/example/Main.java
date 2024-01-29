package org.example;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("Добро пожаловать в супер программу");
            System.out.println("1 - тест на совершеннолетие");
            System.out.println("2 - параметры круга");
            System.out.println("3 - Выйти из программы");
            int viborPolzovatelia = scanner.nextInt();

            if (viborPolzovatelia == 1) {
                scanner.nextLine();
                System.out.println("Привет! Введи свою фамилию, имя, отчество");
                System.out.print("Фамилия: ");
                String lastName = scanner.nextLine();
                System.out.print("Имя: ");
                String firstName = scanner.nextLine();
                System.out.print("Отчество: ");
                String middleName = scanner.nextLine();
                System.out.print("Дата рождения (дд.мм.гггг): ");
                String birthDate = scanner.nextLine();
                LocalDate date = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                LocalDate today = LocalDate.now();
                Period age = Period.between(date, today);
                System.out.println(firstName + " " + middleName);
                if (age.getYears() >= 18) {
                    System.out.println("Вам есть 18 лет");
                } else {
                    System.out.println("Вам нет 18 лет");
                }
            } else if (viborPolzovatelia == 2) {
                System.out.println("Введите диаметр");
                double diametr = scanner.nextDouble();
                double radius = diametr / 2;
                double ploshad = Math.PI * radius * radius;
                double perimetr = 2 * Math.PI * radius;
                System.out.println("Радиус круга равна " + radius);
                System.out.println("Площадь круга равна " + ploshad);
                System.out.println("Периметр круга равна " + perimetr);
            } else if (viborPolzovatelia == 3) {
                exitProgram = true;
            } else {
                System.out.println("Неверная команда");
            }
        }
    }
}