package KI36.Haladzun.Lab4;

import java.util.Scanner;

/**
 * Клас-драйвер для розумного патрона
 */
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CleverCartridge clCartridge = new CleverCartridge();
        String result = "";

        while (true) {
            System.out.println("\tМеню:");
            System.out.println("1 - вистрелити");
            System.out.println("2 - перезарядити патрон");

            int command = sc.nextInt();

            if (command == 1) {
                result = clCartridge.shoot();
                System.out.println(result);
            } else if (command == 2) {
                clCartridge.reloadCartridge();
            } else {
                System.out.println("Ви ввели невірну команду.");
            }

            if (result.equals("Капсуль неможливо використати знову.")){
                break;
            }
        }
    }
}
