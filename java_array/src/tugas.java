/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class tugas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("== Menampilkan Semua Angka ==");
        for( int i=0; i<angka.length; i++)
        System.out.print("| "+angka[i]+" |");
        System.out.println();
        System.out.println("== Menampilkan Angka Genap ==");
        for( int i=0; i<angka.length; i++){
            if(i%2==0){
                System.out.print("| "+angka[i]+" |");   
            }
        }
        System.out.println();
        System.out.println("== Menampilkan Angka Ganjil ==");
        for( int i=0; i<angka.length; i++){
            if(i%2!=0){
                System.out.print("| "+angka[i]+" |");   
            }
        }
        System.out.println();
        System.out.println();
        String [] hari = new String [7];
        //String[] hari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"}; 
        hari [0] = "Senin";
        hari [1] = "Selasa";
        hari [2] = "Rabu";
        hari [3] = "Kamis";
        hari [4] = "Jumat";
        hari [5] = "Sabtu";
        hari [6] = "Minggu";
        System.out.println("== Menampilkan Semua Hari ==");
        System.out.println(hari[0]+" "+hari[1]+" "+hari[2]+" "+hari[3]+" "+hari[4]+" "+hari[5]+" "+hari[6]);
        System.out.println("== Menampilkan Hari Selasa Sampai Hari Jum'at ==");
        System.out.println(hari[1]+" "+hari[2]+" "+hari[3]+" "+hari[4]);
    }
    
}
