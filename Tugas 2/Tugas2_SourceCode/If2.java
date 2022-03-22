/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Selasa/15-03-2022
Waktu        : 10.42 WITA
*/

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        int a;
        Scanner masukan=new Scanner(System.in);
        
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        }
        else {
            System.out.println ("Nilai a negatif "+ a);
        }
    }  
}
