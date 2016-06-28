/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class nilai_kelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pemesanan tempat di memory
        int[] nilaikelas = new int [5];
        nilaikelas [0] = 100;
        nilaikelas [1] = 85;
        nilaikelas [2] = 75;
        nilaikelas [3] = 88;
        nilaikelas [4] = 90;
        
        //tanpa pesan tempat di memory
        int[] nilai_kelas = {100,85,75,88,90};
        double rata = (nilaikelas[0]+nilaikelas[1]+nilaikelas[2]+nilaikelas[3]+nilaikelas[4])/5;
        System.out.println(nilai_kelas[3]);
        
        System.out.println(nilaikelas[3]);
        nilaikelas[3] = 80;
        System.out.println(nilaikelas[3]);
        System.out.println("Nilai Rata-rata = "+rata);
    }
    
}
