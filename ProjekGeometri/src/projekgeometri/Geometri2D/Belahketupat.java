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
public class Belahketupat implements Bangun2Dimensi{

    double diagonalbelah1, diagonalbelah2, sisimiringbelah, luasbelahketupat, kelilingbelahketupat;
    
    public Belahketupat (double diagonalbelah1,double diagonalbelah2,double sisimiringbelah){
        this.diagonalbelah1 = diagonalbelah1;
        this.diagonalbelah2 = diagonalbelah2;
        this.sisimiringbelah = sisimiringbelah;
        this.luasbelahketupat = HitungLuas();
        this.kelilingbelahketupat = HitungKeliling();
    }
    
    @Override
    public double HitungLuas() {
        luasbelahketupat = 0.5 * diagonalbelah1 * diagonalbelah2;
        return luasbelahketupat;
    }

    @Override
    public double HitungKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tampilkan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
