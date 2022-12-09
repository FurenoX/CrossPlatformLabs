package KI36.Haladzun.Lab3;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Клас-драйвер для патрона
 */
public class Lab3 {
    private static String log = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartridge cartridge = new Cartridge();
        String result = "";

        while (true) {
            System.out.println("\tМеню:");
            System.out.println("1 - вистрелити");
            System.out.println("2 - перезарядити патрон");

            int command = sc.nextInt();

            if (command == 1) {
                result = cartridge.shoot();
                System.out.println(result);
            } else if (command == 2) {
                cartridge.reloadBullet();
                cartridge.reloadPowder();
            } else {
                System.out.println("Ви ввели невірну команду.");
            }

            if (result.equals("Капсуль неможливо використати знову.")){
                break;
            }

            try(PrintStream fout = new PrintStream("src/KI31/Haladzun/Lab3/log.txt")){
                fout.print(log);
            }
            catch (FileNotFoundException e){
                System.out.println("Файл не знайдено.");
            }
        }
    }

    /**
     * Дописує функції у змінну log
     * @param log
     */
    public static void setLog(String log){
        Lab3.log += log;
    }
}
