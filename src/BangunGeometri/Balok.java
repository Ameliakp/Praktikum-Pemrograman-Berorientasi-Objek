/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunGeometri;

/**
 *
 * @author user
 */
public class Balok extends PersegiPanjang implements MenghitungRuang  {
    protected double tinggi;
    
    public Balok() {
        
    }
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    
    @Override
    public double Volume() {
        return Luas() * this.tinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2 * (this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.tinggi + this.lebar);
    }
    
    public void setAll(double panjang, double lebar, double tinggi){
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        
        this.Keliling();
        this.Luas();
        this.LuasPermukaan();
        this.Volume();
    }

    @Override
    public void display() {
        System.out.println("Keliling Persegi Panjang = " + Keliling());
        System.out.println("Luas Persegi Panjang = " + Luas());
        System.out.println("Volume Balok = " + Volume());
        System.out.println("Luas Permukaan Balok = " + LuasPermukaan());
    }
    
}
