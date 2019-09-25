/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing.pkgstatic.dan.konstanta;

/**
 *
 * @author Sansan Juliana
 */
public class Mamalia {
    //Variabel jumlahKambing dideklarasikan sebagai statik
    public static int JumlahKambing;
}

public class KambingStatic {

// NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "IPAT";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia.JumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" 
                            + Mamalia.JumlahKambing);
    }
    
}
