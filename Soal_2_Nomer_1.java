package UKL_XR7_Sem1.Soal_2;

import java.util.Scanner;

public class Soal_2_Nomer_1 {
     public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Yang Ingin Dihitung: ");
        int bilangan = g.nextInt();

        if (bilangan < 0) {
            System.out.println("System Error (Negative Number)");
        } else {
            long faktor = 1;

            for (int i = 1; i <= bilangan; i++) {
                faktor *= i;
            }

            System.out.println("Faktorial Bilangan " + bilangan + " Adalah: " + faktor);
        }

        g.close();
    }
}
