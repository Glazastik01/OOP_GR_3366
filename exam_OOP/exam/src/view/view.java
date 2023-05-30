package view;

public class view {
    public static void start() {
        System.out.println("Калькулятор комплексных чисел\n--------------------------------");
    }

    public static void inputCN1() {
        System.out.println("Введите первое комплексное число:");
    }

    public static void inputCN2() {
        System.out.println("Введите второе комплексное число:");
    }

    public static void inputReal() {
        System.out.println("Действительное число:");
    }

    public static void inputImaginery() {
        System.out.println("Мнимое число:");
    }

    public static void results() {
        System.out.println("Результат:");
    }

    public static void againOr() {
        System.out.println("Продолжить?\n1. Да\n2. Нет");
    }

    public static void actions() {
        System.out.println("1. Сложение\n2. Умножение\n3. Деление");
    }
}