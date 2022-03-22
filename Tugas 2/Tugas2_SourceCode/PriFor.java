/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Rabu/16-03-2022
Waktu        : 21.42 WITA
*/

import java.util.Scanner;

public class PriFor {
    public static void main(String[] args) {
        int i,N;
        Scanner masukan=new Scanner(System.in);
        
        System.out.print ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");
        N=masukan.nextInt();
        
        for (i = 1; i <= N; i++){
            System.out.println (i); 
        }
        System.out.println ("Akhir program \n");
    }
}
