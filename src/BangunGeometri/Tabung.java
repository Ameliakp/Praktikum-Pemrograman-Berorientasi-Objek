/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunGeometri;

/**
 *
 * @author user
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    
    private double tinggi, luaspermukaan, volume;;
    
    public Tabung() {
        
    }
    
    public Tabung(double jarijari, double tinggi) {
        super(jarijari);
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
        return 3.14 * super.getJariJari() * super.getJariJari() * getTinggi();
    }

    @Override
    public double LuasPermukaan() {
        return Keliling() * tinggi + 2 * Luas(); 
    }
    
    public void setAll(double jarijari, double tinggi){
        this.setJariJari(jarijari);
        this.setTinggi(tinggi);
        
        this.Keliling();
        this.Luas();
        this.LuasPermukaan();
        this.Volume();
    }
    
    @Override
    public void display(){
        System.out.println("Luas Lingkaran = " + Luas());
        System.out.println("Keliling Lingkaran = " + Keliling());
        System.out.println("Volume = " + Volume());
        System.out.println("Luas Permukaan Tabung = " + LuasPermukaan());
    }
    
}
