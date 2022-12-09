package KI36.Haladzun.Lab3;

/**
 * Описує предметну область пороху
 */
public class Powder {
    private int howManyGr;

    public Powder(int howManyGr){
        Lab3.setLog("Powder()\n");
        this.howManyGr = howManyGr;
    }

    /**
     * Встановлює кількість пороху
     * @param howManyGr
     */
    public void setHowManyGr(int howManyGr) {
        Lab3.setLog("setHowManyGr()\n");
        this.howManyGr = howManyGr;
    }

    /**
     * Повертає кількість пороху
     * @return
     */
    public int getHowManyGr(){
        Lab3.setLog("getHowManyGr()\n");
        return howManyGr;
    }
}
