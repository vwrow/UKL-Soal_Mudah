package UKL_XR7_Sem1.Soal_1;

import java.util.Scanner;

public class Soal_1_Nomer_2 {
    public static void main(String[] args) {
                Scanner b = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        double number = b.nextDouble();
        long number2 = (long) number;

        if (number2 % 2 == 0 ) {
            System.out.println(number2 +" Bilangan Genap");
        } else { 
            System.out.println(number2 +" Bilangan Ganjil");
        }

        System.out.println(number2%2);
        b.close();
    }
}
