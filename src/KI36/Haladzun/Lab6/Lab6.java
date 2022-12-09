package KI36.Haladzun.Lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Клас-драйвер для роботи з файлами
 */
public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Files files = new Files();

        try {
            System.out.println("Введіть Х:");
            double x = sc.nextDouble();
            files.txtSave(x);
            files.txtShow();
            files.binSave(x);
            files.binShow();
        } catch (FileNotFoundException fnf) {
            System.out.println("Файл не знайдено.");
        } catch (IllegalArgumentException ia) {
            System.out.println("В результаті обчислення відбувається ділення на 0.");
        } catch (InputMismatchException im) {
            System.out.println("Ви ввели Х неправильно.");
        } catch (IOException io) {
            System.out.println("Помилка вводу чи виводу.");
        }
    }
}
