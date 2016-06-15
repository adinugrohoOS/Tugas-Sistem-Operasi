/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-pc
 */
public class matrik_1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m[][] = {{7,2,32},{3,5,12}};
        
        //menampilkan matriks m
        System.out.println("Matriks m :");
        for(int i=0; i<m.length; i++)
          {
            for(int j=0; j<m[i].length; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
          }
   
    }    
}
