/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Jumat/18-03-2022
Waktu        : 14.33 WITA
*/

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
       int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
       Scanner masukan = new Scanner(System.in);
       System.out.print("Masukkan total detik : ");
       totalDetik = masukan.nextInt();
       detikSekarang = totalDetik%60;
       
       totalMenit = totalDetik/60;
       menitSekarang = totalMenit%60;
       
       totalJam = totalMenit/60;
       jamSekarang = totalJam%24;
       System.out.println("Hasil konversi waktu (Jam:Menit:Detik) = ("+jamSekarang+":"+menitSekarang+":"+detikSekarang+")");
    }
}
