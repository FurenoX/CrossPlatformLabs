package KI36.Haladzun.Lab4;

/**
 * Описує предметну область патрона
 */
public abstract class Cartridge {
    protected int capCanBeUsed;
    protected boolean bulletIsLoaded;
    protected boolean powderIsLoaded;

    public Cartridge(){
        capCanBeUsed = 5;
        bulletIsLoaded = true;
        powderIsLoaded = false;
    }

    /**
     * Робить вистріл
     * @return
     */
    public abstract String shoot();

    /**
     * Заправляє патрон порохом та вставляє кулю
     */
    public void reloadCartridge(){
        powderIsLoaded = true;
        bulletIsLoaded = true;
    }
}
