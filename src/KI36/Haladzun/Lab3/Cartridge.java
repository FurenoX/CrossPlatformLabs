package KI36.Haladzun.Lab3;

import java.util.Scanner;

/**
 * Описує предметну область патрона
 */
public class Cartridge {
    Scanner sc = new Scanner(System.in);
    private Cap cap;
    private Bullet bullet;
    private Powder powder;

    public Cartridge(){
        Lab3.setLog("Cartridge()\n");
        cap = new Cap();
        bullet = new Bullet(100);
        powder = new Powder(5);
    }

    /**
     * Робить вистріл
     * @return
     */
    public String shoot(){
        Lab3.setLog("shoot()\n");
        String result;

        if (cap.getCanBeUsed() == 0) {
            result = "Капсуль неможливо використати знову.";
        }else if (bullet.getWeight() == 0 || powder.getHowManyGr() == 0){
            result = "Ви не можете вистрелити. Патрон пустий.";
        } else {
            result = "Бах!!!";
            powder.setHowManyGr(0);
            bullet.setWeight(0);
            cap.setCanBeUsed();
        }
        return result;
    }

    /**
     * Заправляє патрон порохом
     */
    public void reloadPowder(){
        Lab3.setLog("reloadPowder()\n");
        System.out.println("Скільки грам пороху засипати?");
        powder.setHowManyGr(sc.nextInt());
    }

    /**
     * Вставляє в патрон нову кулю
     */
    public void reloadBullet(){
        Lab3.setLog("reloadBullet()\n");
        System.out.println("Кулю якої ваги Ви хочете використати?");
        bullet.setWeight(sc.nextInt());
    }
}
