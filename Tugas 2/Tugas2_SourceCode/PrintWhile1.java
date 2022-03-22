/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Kamis/17-03-2022
Waktu        : 20.41 WITA
*/

import java.util.Scanner;
public class PrintWhile1 {
    public static void main(String[] args) {
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
            System.out.println (i++);
        } 
    }
}
