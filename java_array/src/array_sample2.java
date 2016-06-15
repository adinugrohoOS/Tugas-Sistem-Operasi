/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class array_sample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int angka[] = new int [10];
    
    for( int i=0; i<10; i++)
        angka[i]= i;
    for( int i=1; i<10; i++)
        System.out.print(angka[i]);
        System.out.println();
        
        char huruf[]= {'a','b','c','d','e','f'};
        for( int i=0; i<huruf.length; i++)
            System.out.print(huruf[i]);
    }

}
