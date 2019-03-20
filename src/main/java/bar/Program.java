package bar;

import bar.drinks.Drink;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static private boolean endConversation;
    static Scanner scan = new Scanner(System.in);
    static Drink drink;

    public static void main(String[] args) {
        Drink dr = new Drink();
//        Drink.supplements.get(1);
        Drink.menu.get(2);
        conversation();
    }

    static void conversation() {
        while (!endConversation) {
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
                drink = Drink.menu.get(1);
                System.out.println("шотов " + drink.getShot());
                System.out.println("молока " + drink.getMilk());
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
        boolean stopAskSupplements = false;
        do {
            try {
                System.out.println("Что добавить в Ваш напиток? Введите номер: ");
                String input = scan.next();
                if (!stopAsking(input)) {
                    int num = Integer.parseInt(input);
                    Drink.totalDrink(drink, num);
                    System.out.println("в напитке шотов: " + drink.getShot());
                } else {
                    int num = Integer.parseInt(input);
                    System.out.println("Может, еще что-нибудь?");
                    String input2 = scan.nextLine();
                    if (!stopAsking(input2)) {

                    }
                }


            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                System.out.println("ОШИБКА! Возможно, были введены буквы или другие символы, кроме цифр, перечислите добавки заново.");
                askSupplements(drink);
            }
        } while (!stopAskSupplements);
    }

    static boolean stopAsking(String input) {
        if (input == null) {
            System.out.println("Раз Вы молчите, значит ничего не нужно.");
            return true;
        } else if (input.equalsIgnoreCase("stop")
                || input.equalsIgnoreCase("стоп")
                || input.equalsIgnoreCase("отстань")) {
            System.out.println("Как скажете.");
            return true;
        } else {
            return false;
        }
    }

}


