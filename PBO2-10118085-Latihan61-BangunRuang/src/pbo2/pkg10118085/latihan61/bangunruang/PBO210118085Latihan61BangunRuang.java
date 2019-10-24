/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan61.bangunruang;

/**
 *
 * @author Risky
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Tugas : Bangun Ruang
 */
public class PBO210118085Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Bola bola = new Bola() {};
        bola.setJari(7);
        System.out.printf("Hasil Volume Bola = %.1f cm3%n", bola.hitungVolume());
        
        Tabung tabung = new Tabung() {};
        tabung.setJari(10);
        tabung.setTinggi(21);
        System.out.printf("Hasil Volume Tabung = cm3%n", tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut() {};
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.printf("Hasil Volume Kerucut = cm3%n", kerucut.hitungVolume());
    }
}
