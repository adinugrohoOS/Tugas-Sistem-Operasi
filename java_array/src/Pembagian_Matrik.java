
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class Pembagian_Matrik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Baris;
        int Kolom;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah baris = ");
        Baris = masukan.nextInt();
        System.out.println("Masukkan Jumlah Kolom");
        Kolom = masukan.nextInt();
        
        //menginputkan nilai matrik A
        System.out.println("Matriks A :");
        int mA[][] = new int [Baris][Kolom];
        for(int i=0;i<Baris;i++){
            for(int j=0;j<Kolom;j++){
                System.out.print("Input Matrik A baris ke-"+(i+1)+" kolom ke-"+(j+1)+" = ");
                mA[i][j] = masukan.nextInt();
            }
        }
        //menampilkan matrik A
        for (int i=0; i<mA.length; i++)
        {
            for(int j=0; j<mA[i].length; j++)
            {
                System.out.print(mA[i][j]+" ");
            }
            System.out.println();
        }
        //menginputkan nilai matrik B
        System.out.println("Matriks B :");
        int mB[][] = new int [Baris][Kolom];
               for(int i=0;i<Baris;i++){
            for(int j=0;j<Kolom;j++){
                System.out.print("Input Matrik B baris ke-"+(i+1)+" kolom ke-"+(j+1)+" = ");
                mB[i][j] = masukan.nextInt();
            }
        }
        //menampilkan matrik B
        for (int i=0; i<mB.length; i++)
        {
            for(int j=0; j<mB[i].length; j++)
            {
                System.out.print(mB[i][j]+" ");
            }
            System.out.println();
        }
        //Hasil mA / mB
        System.out.println("Pembagian Matriks A dan Matriks B :");
        for (int i=0; i<mA.length; i++)
        {
            for(int j=0; j<mA[i].length; j++)
            {
                System.out.print(mA[i][j] / mB[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
