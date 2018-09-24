/*
 
 */
package pbo3.pkg10117086.latihan3.input;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 *  Nama      : RD Muhammad Djulfikar BU
 *  NIM      : 10117086
 *  Kelas    : IF3
 *  Minggu 23 september 2018
 */
public class PBO310117086Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Masukan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
    }
    
}
