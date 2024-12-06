package UKL_XR7_Sem1.Soal_3;

import java.util.Scanner;

public class Soal_3_Nomer_2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        boolean Duplikat = false;
        System.out.print("Array Length: ");
        int lenght = p.nextInt();
        int[] Data = new int[lenght];

        for (int i = 0; i < Data.length; i++) {
            System.out.print("Data " + (i + 1) + ": ");
            Data[i] = p.nextInt();
        }

        System.out.println();

        CariDup(lenght, Data, Duplikat);

        if (!Duplikat) {
            System.out.println("Tidak Ada Data Yang Sama/ Duplikat");
        }
        p.close();
    }

    public static void CariDup (int length, int Data[], boolean Duplikat) {
        for (int i = 0; i < Data.length; i++) {
            for (int j = i + 1; j < Data.length; j++) {
                if (Data[i] == Data[j]) {
                    System.out.println("Data ke-" + (i + 1) + " Memiliki Data Yang Sama Dengan Data ke-"
                            + (j + 1) + " Dengan Mengandung Nilai: " + Data[i]);
                    Duplikat = true;
                }
            }
        }

    }
}
