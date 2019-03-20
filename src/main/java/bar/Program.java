package bar;

import bar.drinks.Drink;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static private boolean endConversation;
    static Scanner scan = new Scanner(System.in);
    static Drink drink = new Drink();
    static Stock stock = new Stock();

    public static void main(String[] args) {

        stock.showStock();

        conversation();
    }

    static void conversation() {
        while (!endConversation) {
            askDrink();
            stock.showStock();
            askSupplements(drink);
            stock.showStock();
            askAgain(drink);
            stock.showStock();


        }
    }

    static void askDrink() {
        try {
            System.out.println("Что Вам приготовить? Введите номер: ");
            int input = scan.nextInt();
            if (input < 1 || input > 3) {
                throw new IllegalArgumentException();
            } else {
                drink.classicDrink(input);
                System.out.println("шотов " + drink.getShot());
                System.out.println("молока " + drink.getMilk());
                drink.showDrink();
                return;
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
        Drink tmpDrink = drink;
        boolean stopAskSupplements = false;
        do {
            try {
                System.out.println("Что добавить в Ваш напиток? Введите номер: ");
                String input = scan.next();

                while (!stopAsking(input)) {
                    int num = Integer.parseInt(input);
                    drink.totalDrink(num);
                    System.out.println("в напитке шотов: " + drink.getShot());
                    System.out.println("в напитке молока: " + drink.getMilk());
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                System.out.println("ОШИБКА! Возможно, были введены буквы или другие символы, кроме цифр, перечислите добавки заново.");
                drink = tmpDrink;
                askSupplements(drink);
            }
        } while (!stopAskSupplements);
    }

    static void askAgain(Drink drink) {
        System.out.println("Может, еще что-нибудь?");
        String input = scan.next();
            if (stopAsking(input)) {
                return;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    drink.totalDrink(num);
                    askAgain(drink);
                } catch (NumberFormatException e) {
                    System.out.println(e.toString());
                }
            }

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


