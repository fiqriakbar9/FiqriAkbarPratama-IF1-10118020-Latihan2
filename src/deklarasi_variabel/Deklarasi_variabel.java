/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deklarasi_variabel;

/**
 *
 * Nama : Fiqri Akbar Pratama
 * NIM  : 10118020  
 * Kelas: IF-1 
 * Deskripsi Program : program ini berisi program tentang pendeklarasian
 * variabel
 * 
 */
public class Deklarasi_variabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       // Deklarasi awal variabel
       int nilaiInt;
       final double PHI = 3.14; //konstanta uppercase
       boolean nilaiLogika;
       char nilaiKarakter;
       
       // Memberi nilai ke variabel
       nilaiInt = 78;
       nilaiLogika = false;
       nilaiKarakter = 'D';
       
       // Menampilkan Hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = : " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}
