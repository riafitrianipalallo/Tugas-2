/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Senin/14-03-2022
Waktu        : 22.34 WITA
*/

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        
        Scanner masukan=new Scanner(System.in);
        int a;
       
        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
     }
}
