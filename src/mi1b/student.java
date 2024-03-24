/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi1b;

/**
 *
 * @author DELL
 */
public class student {
    private int NoBp;
    String  nama, nobpjs;
    double indeksprestasi;
    public final int kodePTN = 001;

    public student(int x, String n, String s, double g) {
          NoBp =x;
          nama = n;
          nobpjs = s;
          indeksprestasi=g;
          
    }

   

    public int getNoBp() {
        return NoBp;
    }

    public void setNoBp( int noBp) {
        this.NoBp = noBp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNobpjs() {
        return nobpjs;
    }

    public void setNobpjs(String nobpjs) {
        this.nobpjs = nobpjs;
    }

    public double getIndeksprestasi() {
        return indeksprestasi;
    }

    public void setIndeksprestasi(double indeksprestasi) {
        this.indeksprestasi = indeksprestasi;
    }

}
