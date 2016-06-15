/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class babArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mendeklarasikan array 1 dimensi bernama "angka"
        int angka[];
        
        //mengalokasikan sebanyak 5 elemen
        angka = new int[5];
        //cetak jumlah elemen pada array "angka"
        System.out.println("Jumlah elemen pada array angka = "+angka.length);
        
        //menmgisi setiap elemen array
        angka[0] = 5;
        angka[1] = 3;
        angka[2] = 7;
        angka[3] = 2;
        angka[4] = 4;
        
        //cetak isi array pada indeks ke-1
        System.out.println("Array angka pada indeks ke-1 = "+angka[1]);
        //cetak isi array pada indeks ke-2
        System.out.println("Array angka pada indeks ke-2 = "+angka[2]);
        //cetak isi array pada indeks ke-4
        System.out.println("Array angka pada indeks ke-4 = "+angka[4]);
    }
    
}
