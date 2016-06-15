/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class array_sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nilai = new int[5];
        String[] nama = new String[5];
        char[] index = new char[5];
        
        nama[0]="farah"; nilai[0]=60; index[0]='c';
        nama[1]="farci"; nilai[1]=70; index[1]='B';
        nama[2]="fiki"; nilai[2]=80; index[2]='A';
        
        System.out.println("=====================================");
        System.out.println("Nama\t\tNilai\t\tIndex");
        System.out.println("=====================================");
        System.out.println(nama[0]+"\t\t"+nilai[0]+"\t\t"+index[0]);
        System.out.println(nama[1]+"\t\t"+nilai[1]+"\t\t"+index[1]);
        System.out.println(nama[2]+"\t\t"+nilai[2]+"\t\t"+index[2]);
        System.out.println(nama[3]+"\t\t"+nilai[3]+"\t\t"+index[3]);
    }
    
}
