package KI36.Haladzun.Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Описує шухляду
 * @param <T>
 */
public class Drawer<T extends Clothes> {
    private List<T> clothes;

    public Drawer() {
        clothes = new ArrayList<>();
    }

    /**
     * Ставить річ у шухляду
     * @param clothe
     */
    public void put(T clothe) {
        clothes.add(clothe);
    }

    /**
     * Виймає річ
     */
    public void takeOut() {
        if (!clothes.isEmpty()) {
            System.out.println("Введіть номер речі, яку хочете витягти");
            Scanner sc = new Scanner(System.in);
            showAll();
            try {
                clothes.remove(sc.nextInt() - 1);
            } catch (InputMismatchException ime) {
                System.out.println("Ви повинні ввести НОМЕР речі");
            } catch (IndexOutOfBoundsException iob) {
                System.out.println("Такої речі в шухляді немає");
            }
        } else
            System.out.println("Шухляда пуста");
    }

    /**
     * Виводить інформацію про найдорожчу річ
     */
    public void findTheMostExpensive() {
        try {
            T mostExpensive = clothes.get(0);
            for (T clothe : clothes) {
                if (clothe.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = clothe;
                }
            }
            if (!clothes.isEmpty())
                System.out.print("Найдорожча річ у шухляді це ");
            mostExpensive.showInfo();
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("Шухляда пуста");
        }
    }

    /**
     * Виводить список всіх речей
     */
    public void showAll() {
        if (clothes.isEmpty())
            System.out.println("Шухляда пуста");
        else {
            for (int i = 0; i < clothes.size(); i++) {
                System.out.print(i + 1 + ". ");
                clothes.get(i).showInfo();
            }
        }
    }
}
