/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunGeometri;

/**
 *
 * @author user
 */
public class Lingkaran implements MenghitungBidang{
    private double jarijari, luas, keliling;
   
    
    public Lingkaran() {
        
    }
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public Lingkaran(double jarijari, double tinggi) {
        this.jarijari = jarijari;
    }

    public double getJariJari() {
        return jarijari;
    }

    public void setJariJari(double jariJari) {
        this.jarijari = jarijari;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    @Override
    public double Luas() {
         return 3.14 * jarijari * jarijari;
    }

    @Override
    public double Keliling() {
        return 2* 3.14 * jarijari;
    }
    
    public void display() {
        System.out.println("");
    }
    
}
