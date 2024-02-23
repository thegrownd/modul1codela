import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
	
	System.out.println("===============================");
	System.out.println("Punya yazid jangan ganggu gugat");
	System.out.println("===============================");

        System.out.print("Masukkan Nama Anda: ");
        String nama = inputScanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jenisKelamin = inputScanner.nextLine();

        System.out.print("%n Masukkan Tanggal Lahir Anda (Tahun-Bulan-Hari): ");
        String tanggalLahirInput = inputScanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);


        System.out.println("Nama : " + nama);
        System.out.print("Jenis Kelamin :");
        if (jenisKelamin.equalsIgnoreCase("L")) {
            System.out.print("Laki-laki");
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            System.out.print("Perempuan");
        }
        System.out.println();
        System.out.println("Umur Anda :" + selisih.getYears() + " tahun " + selisih.getMonths() + " bulan");

        inputScanner.close();
    }
}