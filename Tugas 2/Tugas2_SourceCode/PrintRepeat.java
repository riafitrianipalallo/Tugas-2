/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Rabu/16-03-2022
Waktu        : 23.02 WITA
*/

import java.util.Scanner;
public class PrintRepeat {
    public static void main(String[] args) {
    int N;
    int i;
    Scanner masukan=new Scanner(System.in);
    
    System.out.print ("Nilai N >0 = ");
  
    N = masukan.nextInt();
    i = 1;
   
    System.out.print ("Print i dengan REPEAT: \n");
    do{
        System.out.print (i+"\n"); 
        i++;
    }
    while (i <= N); 
    }
}
