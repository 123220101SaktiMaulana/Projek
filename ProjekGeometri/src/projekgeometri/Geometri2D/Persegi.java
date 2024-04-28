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
public class Persegi implements Bangun2Dimensi{
    double sisipersegi,luaspersegi,kelilingpersegi;
    
    public Persegi(double sisipersegi){
        this.sisipersegi = sisipersegi;
        this.luaspersegi = HitungLuas();
        this.kelilingpersegi = HitungKeliling(); 
    }
    
    @Override
    public double HitungLuas() {
        luaspersegi = sisipersegi * sisipersegi;
        return luaspersegi;
    }

    @Override
    public double HitungKeliling() {
        kelilingpersegi = sisipersegi * 4 ;
        return kelilingpersegi;
    }

    @Override
    public void tampilkan() {
        System.out.println("Luas Persegi = " + luaspersegi);
        System.out.println("Keliling Persegi = " + kelilingpersegi);
    }
    
}
