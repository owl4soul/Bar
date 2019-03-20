package bar;

import bar.drinks.Drink;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static private boolean endConversation;
    static Scanner scan = new Scanner(System.in);
    static Drink drink;

    public static void main(String[] args) {
        System.out.println(Drink.menu.get(1));
        conversation();
    }

    static void conversation() {
        while (!endConversation) {
            Drink drink = null;
            askDrink();
            askSupplements(drink);
        }
    }

    static void askDrink() {
        try {
            System.out.println("Что Вам приготовить? Введите номер: ");
            int input = scan.nextInt();
            //Сверяем номер с барной картой (menu), если попадает в диапазон возможных напитков, то готовим
            if (input < 1 || input >= Drink.menu.size()) {
                throw new IllegalArgumentException();
            } else {
                drink = Drink.menu.get(input);
            }

        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("ОШИБКА! Возможно, были введены буквы или другие символы, кроме цифр, попробуйте снова.");
            askDrink();
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("ОШИБКА! В меню нет такого напитка, повторите ввод.");
            askDrink();
        }
    }

    static void askSupplements(Drink drink) {
        try {
            System.out.println("Что добавить в Ваш напиток? Введите номер: ");
            int input = scan.nextInt();
            System.out.println("Может, еще что-нибудь?");
            int input2 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("ОШИБКА! Возможно, были введены буквы или другие символы, кроме цифр, перечислите добавки заново.");
            askSupplements(drink);
        }
    }
}


