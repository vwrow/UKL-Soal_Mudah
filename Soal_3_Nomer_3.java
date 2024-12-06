package UKL_XR7_Sem1.Soal_3;

import java.util.Scanner;

public class Soal_3_Nomer_3 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Array Length: ");
        int length = p.nextInt();
        int[] data = new int[length];
        int[] frekuensi = new int[length];
        boolean[] terhitung = new boolean[length];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Data " + (i + 1) + ": ");
            data[i] = p.nextInt();
        }

        CariFrek(length, data, frekuensi, terhitung);
        ShowFrek(length, data, frekuensi);
        p.close();
    }

    
    public static void CariFrek(int length, int[] data, int[] frekuensi, boolean[] terhitung) {
        for (int i = 0; i < length; i++) {
            if (!terhitung[i]) {
                int count = 1;
                for (int j = i + 1; j < length; j++) {
                    if (data[i] == data[j]) {
                        count++;
                        terhitung[j] = true;
                    }
                }
                frekuensi[i] = count;
            }
        }
    }

    public static void ShowFrek(int length, int[] data, int[] frekuensi) {
        System.out.println("\nFrekuensi Data:");
        for (int i = 0; i < length; i++) {
            if (frekuensi[i] > 0) {
                System.out.println("Data " + data[i] + " Muncul " + frekuensi[i] + " Kali.");
            }
        }
    }
}
