package KI36.Haladzun.Lab5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Клас-драйвер для обрахунку виразу
 */
public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (PrintWriter pw = new PrintWriter("src/KI31/Haladzun/Lab5/result.txt")){
            System.out.println("Введіть Х:");
            double result = Count.count(sc.nextDouble());
            System.out.println("1/tg(2x) = " + result);
            pw.print("1/tg(2x) = " + result);
        } catch (FileNotFoundException fnf) {
            System.out.println("Файл не знайдено.");
        } catch (IllegalArgumentException ia) {
            System.out.println("В результаті обчислення відбувається ділення на 0.");
        } catch (InputMismatchException im) {
            System.out.println("Ви ввели Х неправильно.");
        }
    }
}
