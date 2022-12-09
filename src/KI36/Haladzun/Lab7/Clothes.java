package KI36.Haladzun.Lab7;

/**
 * Описує одяг
 */
public abstract class Clothes {
    protected String color;
    protected int price;

    /**
     * Встановлює колір
     */
    protected abstract void setColor();

    /**
     * Встановлює ціну
     */
    protected abstract void setPrice();

    /**
     * Показує всю інформацію
     */
    public abstract void showInfo();

    /**
     * Повертає колір
     * @return
     */
    protected String getColor() {
        return color;
    }

    /**
     * Повертає ціну
     * @return
     */
    protected int getPrice() {
        return price;
    }
}
