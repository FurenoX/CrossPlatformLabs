package KI36.Haladzun.Lab6;

import KI36.Haladzun.Lab5.Count;

import java.io.*;
import java.util.Scanner;

/**
 * Клас для роботи з файлами
 */
public class Files {
    private final File file = new File("src/KI31/Haladzun/Lab6/result.txt");
    private final File binFile = new File("src/KI31/Haladzun/Lab6/result.bin");

    /**
     * Записує результат у текстовий файл
     * @param x
     * @throws FileNotFoundException
     */
    public void txtSave(double x) throws FileNotFoundException
    {
        PrintWriter fout = new PrintWriter(file);
        fout.print(Count.count(x));
        fout.close();
    }

    /**
     * Виводить результат з текстового файлу
     * @throws FileNotFoundException
     */
    public void txtShow() throws FileNotFoundException
    {
        Scanner fin = new Scanner(file);
        System.out.println(fin.next() + " - результат з текстового файлу");
        fin.close();
    }

    /**
     * Записує результат у бінарний файл
     * @param x
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binSave(double x) throws FileNotFoundException, IOException
    {
        DataOutputStream binFout = new DataOutputStream(new FileOutputStream(binFile));
        binFout.writeDouble(Count.count(x));
        binFout.close();
    }


    /**
     * Виводить результат з бінарного файлу
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binShow() throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(binFile));
        System.out.println(dis.readDouble() + " - результат з бінарного файлу");
        dis.close();
    }
}
