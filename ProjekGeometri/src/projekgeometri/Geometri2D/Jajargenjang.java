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
public class Jajargenjang implements Bangun2Dimensi{
    double alasjjg, tinggijjg, sisimiringjjg, luasjjg, kelilingjjg;
    
    public Jajargenjang(double alasjjg, double tinggijjg, double sisimiringjjg){
        this.alasjjg = alasjjg;
        this.tinggijjg = tinggijjg;
        this.sisimiringjjg = sisimiringjjg;
        this.luasjjg = HitungLuas();
        this.kelilingjjg = HitungKeliling();
    
    }
    
    @Override
    public double HitungLuas() {
        luasjjg = alasjjg * tinggijjg;
        return luasjjg;
    }

    @Override
    public double HitungKeliling() {
       kelilingjjg = 2 * (alasjjg + sisimiringjjg);
       return kelilingjjg;
    }

    @Override
    public void tampilkan() {
        System.out.println("Luas Jajar Genjang = " + luasjjg);
        System.out.println("Keliling Jajar Genjang = " + kelilingjjg);
    }
    
}
