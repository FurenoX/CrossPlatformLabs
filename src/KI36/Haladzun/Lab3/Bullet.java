package KI36.Haladzun.Lab3;

/**
 * Описує предметну область кулі
 */
public class Bullet {
    int weight;

    public Bullet(int weight){
        Lab3.setLog("Bullet()\n");
        this.weight = weight;
    }

    /**
     * Встановлює вагу кулі
     * @param weight
     */
    public void setWeight(int weight){
        Lab3.setLog("setWeight\n");
        this.weight = weight;
    }

    /**
     * Повертає вагу кулі
     * @return
     */
    public int getWeight(){
        Lab3.setLog("getWeight\n");
        return weight;
    }
}
