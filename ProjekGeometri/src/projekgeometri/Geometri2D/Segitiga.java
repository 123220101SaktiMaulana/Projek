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
public class Segitiga implements Bangun2Dimensi{
    double alassegitiga, tinggisegitiga,luassegitiga,kelilingsegitiga;

    public Segitiga(double alassegitiga,double tinggisegitiga){
        this.alassegitiga = alassegitiga;
        this.tinggisegitiga = tinggisegitiga;
        this.luassegitiga = HitungLuas(); // Hitung luas saat objek dibuat
        this.kelilingsegitiga = HitungKeliling(); // Hitung keliling saat objek dibuat
    }
  
    @Override
    public double HitungLuas() {
        luassegitiga = 0.5 * alassegitiga * tinggisegitiga;
        return luassegitiga;
    }

    @Override
    public double HitungKeliling() {
        kelilingsegitiga =  alassegitiga + tinggisegitiga + Math.sqrt((alassegitiga * alassegitiga) + (tinggisegitiga * tinggisegitiga));
        return kelilingsegitiga;
    }

    @Override
    public void tampilkan() {
        System.out.println("Luas Segitiga = " + luassegitiga);
        System.out.println("Keliling Segitiga = " + kelilingsegitiga);
    }  
}
