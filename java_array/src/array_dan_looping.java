/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author dell-pc
 */
public class array_dan_looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah_elemen;
        JOptionPane.showMessageDialog(null, "program Sederhana Input Data Nama Mahasiswa");
        jumlah_elemen = Integer.parseInt(JOptionPane.showInputDialog("Berapa Jumlah Data Mahasiswa Yang Diinginkan?? = "));
        
        String nama_mahasiswa[] = new String[jumlah_elemen];
        
        for( int index =0; index < jumlah_elemen; index++){
            nama_mahasiswa[index] = JOptionPane.showInputDialog("Input nama pada indeks ke-"+index);
        }
        for( int index =0; index < jumlah_elemen; index++){
             System.out.println("Data pada indeks ke-"+index+":" +nama_mahasiswa[index]);
        }
    }
    
}
