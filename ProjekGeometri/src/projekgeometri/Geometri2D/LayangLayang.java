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
public class LayangLayang implements Bangun2Dimensi{

    double diagonal1, diagonal2,sisimiring1, sisimiring2, luaslayang, kelilinglayang;
    
    public LayangLayang(double diagonal1,double diagonal2, double sisimiring1, double sisimiring2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisimiring1 = sisimiring1;
        this.sisimiring2 = sisimiring2;
        this.kelilinglayang = HitungKeliling();
        this.luaslayang = HitungKeliling();
    }
    
    @Override
    public double HitungLuas() {
        luaslayang = diagonal1 * diagonal2 / 2;
        return luaslayang;
    }

    @Override
    public double HitungKeliling() {
        kelilinglayang = 2 * (sisimiring1 + sisimiring2);
        return kelilinglayang;
    }

    @Override
    public void tampilkan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
