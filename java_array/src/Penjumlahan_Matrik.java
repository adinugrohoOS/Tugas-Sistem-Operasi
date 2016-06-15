
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
public class Penjumlahan_Matrik {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int mA [][] = {{7,2,32},{3,5,12}};
        //int mB [][] = {{8,21,3},{3,6,10}};
  
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah baris = ");
        int Baris = masukan.nextInt();
        System.out.println("Masukkan Jumlah Kolom");
        int Kolom = masukan.nextInt();
        
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
        for (int i=0; i<mA.length; i++){
            for(int j=0; j<mA[i].length; j++){
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
        for (int i=0; i<mB.length; i++){
            for(int j=0; j<mB[i].length; j++){
                System.out.print(mB[i][j]+" ");
            }
                System.out.println();
        }
        System.out.println("Tentukan pilihan Operasi perhitungan : 1. Penjumlahan (+) ");
        System.out.println("                                       2. Pengurangan (-)");
        System.out.println("                                       3. Pembagian (/)");
        System.out.println("Masukkan bilangan yang anda pilih : ");
        int bil = masukan.nextInt();
        
        if (bil==1){
        System.out.println("Penjumlahan Matriks A dan Matriks B :");
            for (int i=0; i<mA.length; i++){
                for(int j=0; j<mA[i].length; j++){
                    System.out.print(mA[i][j]+mB[i][j]+" ");
                }
                    System.out.println();
            }    
        }else if(bil==2){
         System.out.println("Pengurangan Matriks A dan Matriks B :");
            for (int i=0; i<mA.length; i++){
                for(int j=0; j<mA[i].length; j++){
                    System.out.print(mA[i][j]-mB[i][j]+" ");
                }
                    System.out.println();
            }
        }else if(bil==3){
         System.out.println("Pembagian Matriks A dan Matriks B :");
            for (int i=0; i<mA.length; i++){
                for(int j=0; j<mA[i].length; j++){
                    System.out.print(mA[i][j]/mB[i][j]+" ");
                }
                    System.out.println();
            }
         } 
     }
 }
