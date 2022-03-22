/* 
NIM          : 13020200179
Nama         : Ria Fitriani Palallo
Hari/Tanggal : Minggu/13-03-2022
Waktu        : 00.23 WITA
*/

public class Oprator {
    public static void main(String[] args) {
        boolean Bool1, Bool2, TF ; int i,j, hsl ;
        float x,y,res;
        
        System.out.println ("OPERASI LOGICAL BOOL");
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; 
        System.out.println ("Bool1 && Bool2 = "+ TF);
        TF = Bool1 || Bool2 ;
        System.out.println ("Bool1 || Bool2 = "+ TF);
        TF = ! Bool1 ; 
        System.out.println ("!Bool1 = "+ TF);
        TF = Bool1 ^Bool2;
        System.out.println ("Bool1 ^ Bool2 = "+ TF);
       
        System.out.println ("\nOPERASI NUMERIK");
        i = 5; j = 2 ;
        hsl = i+j;
        System.out.println ("i + j = "+ hsl);
        hsl = i - j;
        System.out.println ("i - j = "+ hsl);
        hsl = i / j;
        System.out.println ("i / j = "+ hsl);
        hsl = i * j;
        System.out.println ("i * j = "+ hsl);
        hsl = i /j ; 
        System.out.println ("i / j (Pembagian bulat) = "+ hsl);
        hsl = i%j ; 
        System.out.println ("i % j (Sisa modulo) = "+ hsl);
        
        System.out.println ("\nOPERASI NUMERIK");
        x = 5 ; y = 5 ;
        res = x + y;
        System.out.println ("x + y = "+ res);
        res = x - y;
        System.out.println ("x - y = "+ res);
        res = x / y;
        System.out.println ("x / y = "+ res);
        res = x * y;
        System.out.println ("x * y = "+ res);
        
        System.out.println ("\nOPERASI RELATIONAL NUMERIK");
        TF = (i==j);
        System.out.println ("(i == j) = "+ TF);
        TF = (i!=j);
        System.out.println ("(i != j) = "+ TF);
        TF = (i < j);
        System.out.println ("(i < j) = "+ TF);
        TF = (i > j);
        System.out.println ("(i > j) = "+ TF);
        TF = (i <= j);
        System.out.println ("(i <= j) = "+ TF);
        TF = (i >= j);
        System.out.println ("(i >= j) = "+ TF);
       
        System.out.println ("\nOPERASI RELATIONAL NUMERIK");
        TF = (x != y);
        System.out.println ("(x != y) = "+ TF);
        TF = (x < y); 
        System.out.println ("(x < y) = "+ TF);
        TF = (x > y); 
        System.out.println ("(x > y) = "+ TF);
        TF = (x <= y); 
        System.out.println ("(x <= y) = "+ TF);
        TF = (x >= y);
        System.out.println ("(x >= y) = "+ TF);
    }
}
