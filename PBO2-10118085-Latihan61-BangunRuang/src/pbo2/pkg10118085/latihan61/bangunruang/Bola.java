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
public class Bola implements BangunRuang{
    private int jari;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume(){
        return 4.0/3.0 * 22.0/7.0 * Math.pow(jari, 3);
    }
}
