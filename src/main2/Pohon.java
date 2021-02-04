//Package
package main2;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Pohon {
    
    //Variabel Instance
    String nama;
    int tinggi;
    
    //Method Void untuk nama pohon (pemberian nama)
    void setNama(String nama){
        this.nama = nama;
    } 
    //Method Void untuk tinggi pohon (Memberi nilai pada tinggi pohon)
    void setTinggi(int tinggi){
        this.tinggi = tinggi;
        
    }
    //Menampilkan/mendapatkan nama pohon
    String getNama(){
        return this.nama;
        
    }
    //Menampilkan/mendapatkan nilai tinggi pohon
    int getTinggi(){
        return this.tinggi;
    }
}
