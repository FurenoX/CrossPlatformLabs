package KI36.Haladzun.Lab7;

/**
 * Описує шкарпетки
 */
public class Socks extends Clothes{
    private final String type = "шкарпетки";

    public Socks(){
        setColor();
        setPrice();
    }

    @Override
    protected void setColor() {
        switch ((int)(Math.random() * 3)){
            case 0 -> color = "зелений";
            case 1 -> color = "червоний";
            case 2 -> color = "фіолетовий";
        }
    }

    @Override
    protected void setPrice() {
        price = (int)(20 + Math.random() * 70);
    }

    @Override
    public void showInfo() {
        System.out.println(type + " колір: " + getColor() + " ціна: " + getPrice() + " грн.");
    }
}
