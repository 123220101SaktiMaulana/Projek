/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekgeometri.Geometri2D;

import projekgeometri.Bangun2Dimensi;

/**
 *
 * @author Aibra
 */
public class PersegiPanjang implements Bangun2Dimensi{
        double panjangpp, lebarpp, luaspp, kelilingpp;
        
        public PersegiPanjang(double panjangpp, double lebarpp){
            this.panjangpp = panjangpp;
            this.lebarpp = lebarpp;
            this.luaspp = HitungLuas();
            this.kelilingpp = HitungKeliling();
        
        
        }
    @Override
    public double HitungLuas() {
        luaspp = panjangpp * lebarpp;
        return luaspp;
    }

    @Override
    public double HitungKeliling() {
        kelilingpp = (panjangpp * 2) + (lebarpp * 2);
        return kelilingpp;
    }

    @Override
    public void tampilkan() {
        System.out.println("Luas Persegi Panjang = " + luaspp);
        System.out.println("Keliling Persegi Panjang = " + kelilingpp);
    }
    
}
