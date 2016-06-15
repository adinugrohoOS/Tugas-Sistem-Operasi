/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class Array_Multidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int jumlah_data = 4;
      int jumlah_field = 3;
      String nama_mhs[] = new String [jumlah_data];
      String[] identitas[] = new String [jumlah_data][jumlah_field];
      
      nama_mhs[0]="Agus Santoso";//nama mahsiswa ke-1
      nama_mhs[1]="Adi Rahmat";//nama mahasiswa ke-2
      nama_mhs[2]="Indra Irawan";//nama mahasiswa ke-3
      
      identitas[0][0]="50";//data berat badan mahasiswa ke-1
      identitas[0][1]="170";//data tinggi badan mahasiswa ke-1
      identitas[0][2]="22";//data umur mahasiswa ke-1
    
      identitas[1][0]="60";//data berat badan mahasiswa ke-2
      identitas[1][1]="165";//data tinggi badan mahasiswa ke-2
      identitas[1][2]="24";//data umur mahasiswa ke-2
      
      identitas[2][0]="65";//data berat badan mahasiswa ke-3
      identitas[2][1]="180";//data tinggi badan mahasiswa ke-3
      identitas[2][2]="23";//data umur mahasiswa ke-3
      
      //mencetak data mahasiswa pertama
        System.out.println("==============================");
        System.out.println("Nama Mahasiswa : "+nama_mhs[0]);
        System.out.println("==============================");
        System.out.println("Berat Badan    : "+identitas[0][0]);
        System.out.println("Tinggi Badan   : "+identitas[0][1]);
        System.out.println("Umur           : "+identitas[0][2]);
    }
    
}
