/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Jumat/11-03-2022
Waktu        : 22.05 WITA
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bacakar {
    public static void main(String[] args) throws IOException {
    
    char cc;
    int bil;
    
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    System.out.print ("hello\n");
    System.out.print("baca 1 karakter : ");
    cc =dataIn.readLine().charAt(0);
    System.out.print("baca 1 bilangan : ");
    bil =Integer.parseInt(dataIn.readLine());
    
    System.out.print (cc +"\n" +bil+"\n");
    System.out.print ("bye \n");
    }
}
