/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Kamis/17-03-2022
Waktu        : 20.59 WITA
*/

import java.util.Scanner;
public class PrintXinterasi {
    public static void main(String[] args) {
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); 
        if (x == 999){
            System.out.print ("Kasus kosong \n");
        }
        else{ 
            Sum = x;
            for (;;){
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt();
                if(x==999)
                    break;
                else{
                    Sum = Sum + x; 
                }
            }
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
    }
}