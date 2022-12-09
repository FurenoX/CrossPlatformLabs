package KI36.Haladzun.Lab7;

import java.util.Scanner;

/**
 * Клас-драйвер для шухляди
 */
public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drawer<Clothes> drawer = new Drawer<>();
        String command;
        boolean makeNextLoop = true;

        while (makeNextLoop) {
            System.out.println("\tМеню:");
            System.out.println("1 - Запхати нову річ до шухляди");
            System.out.println("2 - Витягти річ із шухляди");
            System.out.println("3 - Показати все, що лежить у шухляді");
            System.out.println("4 - Знайти найдорожчу річ");
            System.out.println("0 - Вийти з програми");

            command = sc.next();

            switch (command) {
                case "1" -> {
                    System.out.println("Що ви хочете покласти до шухляди?");
                    System.out.println("1 - Труси");
                    System.out.println("2 - Шкарпетки");
                    switch (sc.next()) {
                        case "1" -> drawer.put(new Pants());
                        case "2" -> drawer.put(new Socks());
                        default -> System.out.println("Ви ввели невірну команду");
                    }
                }
                case "2" -> drawer.takeOut();
                case "3" -> drawer.showAll();
                case "4" -> drawer.findTheMostExpensive();
                case "0" -> makeNextLoop = false;
                default -> System.out.println("Ви ввели невірну команду");
            }
        }
        System.out.println("До побачення.");
    }
}
