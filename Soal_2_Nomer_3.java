package UKL_XR7_Sem1.Soal_2;

import java.util.Scanner;

public class Soal_2_Nomer_3 {
    public static void main(String[] args) {
        String jawab = "";
        System.out.println("Selamat Datang di Fun Math Quizz");
        System.out.print("Apakah Anda Siap Untuk Memulai (Ya/ Tidak)? ");
        Scanner c = new Scanner(System.in);
        String pil = c.nextLine();

        if (pil.equalsIgnoreCase("Ya")) {

            do {
                Quizz(c);
                System.out.print("\nMasih Ingin Bermain (Ya/ Tidak)?: ");
                jawab = c.next();

                if (jawab.equalsIgnoreCase("Tidak")) {
                    System.out.println("Terimakasih Sudah Bermain, Sampai Jumpa Lain Waktu!");
                }

            } while (jawab.equalsIgnoreCase("ya"));

        } else if (pil.equalsIgnoreCase("Tidak")) {
            System.out.println("Sampai Jumpa Lain Waktu");

        } else {
            System.out.println("Error");
        }
        c.close();
    }

    public static void Quizz(Scanner c) {
        double JawabanUser, JawabanB;
        // String jawab = "";
        double[] bilangan = { (int) (Math.random() * 100), (int) (Math.random() * 100) };
        int operator = (int) (Math.random() * 3);
        System.out.println("Pecahkan Soal Berikut!");
        // do {
        switch (operator) {
            case 0:
                System.out.println(bilangan[0] + " * " + bilangan[1]);
                JawabanB = bilangan[0] * bilangan[1];
                System.out.print("Jawaban: ");
                JawabanUser = c.nextDouble();

                if (JawabanUser == JawabanB) {
                    System.out.println("Selamat Jawaban Anda Benar");
                } else {
                    System.out.println("Maaf Jawaban Anda Belum Benar, Jawaban Yang Benar Adalah: " + JawabanB);
                }
                break;

            case 1:
                System.out.println(bilangan[0] + " / " + bilangan[1]);
                JawabanB = bilangan[0] / bilangan[1];
                System.out.print("Jawaban: ");
                JawabanUser = c.nextDouble();

                if (JawabanUser == JawabanB) {
                    System.out.println("Selamat Jawaban Anda Benar");
                } else {
                    System.out.println("Maaf Jawaban Anda Belum Benar, Jawaban Yang Benar Adalah: " + JawabanB);
                }
                break;

            case 2:
                System.out.println(bilangan[0] + " % " + bilangan[1]);
                JawabanB = bilangan[0] % bilangan[1];
                System.out.print("Jawaban: ");
                JawabanUser = c.nextDouble();

                if (JawabanUser == JawabanB) {
                    System.out.println("Selamat Jawaban Anda Benar");
                } else {
                    System.out.println("Maaf Jawaban Anda Belum Benar, Jawaban Yang Benar Adalah: " + JawabanB);
                }
                break;

            // System.out.print("\nMasih Ingin Bermain (Ya/ Tidak)?: ");
            // jawab = c.next();

            // if (jawab.equalsIgnoreCase("Tidak")) {
            // System.out.println("Terimakasih Sudah Bermain, Sampai Jumpa Lain Waktu!");
            // }
            // }
            // } while (jawab.equalsIgnoreCase("ya"));
        }
    }
}
