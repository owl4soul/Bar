package bar;

import bar.drinks.Drink;

import java.util.Scanner;

public class Program {
    static private boolean endConversation;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        conversation();
    }

    static void conversation() {
        while (!endConversation) {
            askDrink();
            askSupplements();
        }
    }

    static void askDrink() {
        try {
            System.out.println("Что Вам приготовить? Введите номер: ");
            int input = scan.nextInt();
            //Сверяем номер с барной картой (menu)
            for (int i = 0; i < Drink.menu.values().size(); i++) {

            }

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Произошла ошибка. Возможно, вы неверно ввели номер, попробуйте снова.");
            askDrink();
        }
    }

    static void askSupplements() {
        try {
            System.out.println("Что добавить в Ваш напиток? Введите номер: ");
            int input = scan.nextInt();
            System.out.println("Может, еще что-нибудь?");
            int input2 = scan.nextInt();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Произошла ошибка. Возможно, вы неверно ввели номер, перечислите добавки заново.");
            askSupplements();
        }
    }
}


