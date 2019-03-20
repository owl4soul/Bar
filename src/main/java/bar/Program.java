package bar;

import bar.drinks.Drink;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static private boolean endConversation;
    static Scanner scan;
    static Drink drink = new Drink();
    static Stock stock = new Stock();

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        stock.showStock();
        conversation();
    }

    static void conversation() {
        drink = new Drink();
        askDrink();
        askSupplements(drink);
        askAgain(drink);


//        while (!endConversation) {
//
//            askDrink();
//            stock.showStock();
//            askSupplements(drink);
//            stock.showStock();
//            askAgain(drink);
//            stock.showStock();
//            Bar.countTotalPrice(drink);
//
//
//        }
    }

    static void askDrink() {

        System.out.println("Что Вам приготовить? Введите номер: ");
        String input = scan.nextLine();
        if (!stopAsking(input)) {
            try {
                int num = Integer.parseInt(input);
                if (num < 1 || num > 3) {
                    throw new IllegalArgumentException();
                } else {
                    drink.classicDrink(num);
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
        } else {
            System.out.println("Вы отказались делать заказ. Всего доброго");
            System.exit(0);
        }
    }

    static void askSupplements(Drink drink) {
        System.out.println("Что добавить в Ваш напиток? Введите номер: ");
        String input = scan.next();
        try {
            if (stopAsking(input)) {
                return;
            } else {
                int num = Integer.parseInt(input);
                drink.totalDrink(num);
                System.out.println("в напитке шотов: " + drink.getShot());
                System.out.println("в напитке молока: " + drink.getMilk());
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("ОШИБКА! Возможно, были введены буквы или другие символы, кроме цифр, " +
                    "перечислите добавки заново.");

            askSupplements(drink);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("ОШИБКА! Невозможно прочитать цифры.");
            askSupplements(drink);
        }

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
                System.out.println("в напитке шотов: " + drink.getShot());
                System.out.println("в напитке молока: " + drink.getMilk());

            } catch (NumberFormatException e) {
                System.out.println(e.toString());
                System.out.println("Не понял, что вы сказали? ");
                System.out.println("в напитке шотов: " + drink.getShot());
                System.out.println("в напитке молока: " + drink.getMilk());
                askAgain(drink);
            }
            askAgain(drink);
        }

    }


    static boolean stopAsking(String input) {
        if (input.isEmpty()) {
            System.out.println("Раз Вы молчите, значит ничего не нужно.");
            return true;
        } else if (input.equalsIgnoreCase("stop")
                || input.equalsIgnoreCase("стоп")) {
            System.out.println("Как скажете.");
            stock.showStock();
            System.out.println("_________________________");
            drink.showDrink();
            System.out.println("_________________________");
            System.out.println("Общая стоимость напитка: ");
            Bar.countTotalPrice(drink);
            System.out.println("_________________________");


            System.out.println("Завершить программу? Нажмите 0 для выхода из программы.");
            try {
                String input2 = scan.next();
                int num = Integer.parseInt(input2);
                if (num == 0) {
                    System.exit(0);
                } else {
                    conversation();
                    return true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Хм...тогда продолжим");
                conversation();
            } catch (NumberFormatException e) {
                System.out.println("...");
                conversation();
            }

        } else {
            return false;
        }
        return false;
    }

}


