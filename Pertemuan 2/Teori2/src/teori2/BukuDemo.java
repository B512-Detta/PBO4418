/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori2;

/**
 *
 * @author acer
 */
public class BukuDemo extends Buku {
    String Judul;
    String Pengarang;
    String Penerbit;
    int Tahun;
    public BukuDemo(){
        
    }
    public void setJudul(String newJudul){
        Judul = newJudul;
    }
    public void setPengarang(String newPengarang){
        Pengarang = newPengarang;
    }
    public void setPenerbit(String newPenerbit){
        Penerbit = newPenerbit;
    }
    public void setTahun(int newTahun){
        Tahun = newTahun;
    }
}
