package KI36.Haladzun.Lab3;

/**
 * Описує предметну область гільзи
 */
public class Cap {
    int canBeUsed;

    public Cap(){
        Lab3.setLog("Cap()\n");
        canBeUsed = 5;
    }

    /**
     * Зменшує кількість вистрілів до поламки гільзи
     */
    public void setCanBeUsed() {
        Lab3.setLog("setCanBeUsed()\n");
        canBeUsed--;
    }

    /**
     * Повертає кількість вистрілів до поламки гільзи
     * @return
     */
    public int getCanBeUsed() {
        Lab3.setLog("getCanBeUsed\n");
        return canBeUsed;
    }
}
