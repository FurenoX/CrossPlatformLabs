package KI36.Haladzun.Lab7;

/**
 * Описує труси
 */
public class Pants extends Clothes{
    private final String type = "труси";

    public Pants() {
        setColor();
        setPrice();
    }

    @Override
    protected void setColor() {
        switch ((int)(Math.random() * 3)){
            case 0 -> color = "сірий";
            case 1 -> color = "чорний";
            case 2 -> color = "синій";
        }
    }

    @Override
    protected void setPrice() {
        price = (int)(40 + Math.random() * 100);
    }

    @Override
    public void showInfo() {
        System.out.println(type + " колір " + getColor() + " ціна: " + getPrice() + " грн.");
    }
}
