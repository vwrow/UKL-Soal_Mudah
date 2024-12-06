package UKL_XR7_Sem1.Soal_3;

import java.util.Scanner;

public class Soal_3_Nomer_1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Jumlah Siswa: ");

        int jumSis = a.nextInt();
        String[] DataNilai = new String[jumSis];
        double total = 0;

        for (int i = 0; i < DataNilai.length; i++) {
            System.out.print("Nilai Siswa " + (i + 1) + ": ");
            total = total + a.nextDouble();
        }

        System.out.print("Rata - Rata: " + (total / jumSis));
        a.close();
    }
}
