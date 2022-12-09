package KI36.Haladzun.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ���� Lab2 ������ ������ �17 �� ����������� ������ �2
 *
 * @author Haladzun
 * @version 1.0
 */
public class Lab2 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        String[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("������ ����� ��������� �������: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new String[nRows][nRows];
        System.out.print("\n������ ������-����������: ");
        filler = in.nextLine();

        exit:
        for (int i = 0; i < nRows; i++){
            for (int j = 0; j < nRows; j++) {
                if (filler.length() == 1) {
                    if (i == 0 || j == 0 || i == (nRows - 1) || j == (nRows - 1))
                        arr[i][j] = filler;
                    else
                        arr[i][j] = " ";
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");

                } else if (filler.length() == 0) {
                    System.out.print("\n�� ������� ������ ����������");
                    break exit;
                } else {
                    System.out.print("\n�������� ������� ������������");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();

    }
}

