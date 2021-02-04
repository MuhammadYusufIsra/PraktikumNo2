//Package
package main2;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Main2 {
    //Method main
    public static void main(String[] args) {
        //Object
        Pohon cemara = new Pohon();
        //Pemberian atribut
        cemara.setNama("Cemara");
        cemara.setTinggi(20);
        
        //Object
        Pohon kelapa = new Pohon();
        //Pemberian Atribut
        kelapa.setNama("Kelapa");
        kelapa.setTinggi(30);

        //Cetak
        System.out.println("Nama Pohon pertama = "+cemara.nama);
        System.out.println("Tinggi Pohon pertama = "+cemara.tinggi+" m");    
        System.out.println("----------------------------------");
        System.out.println("Nama Pohon kedua = "+kelapa.nama);   
        System.out.println("Tinggi Pohon kedua = "+kelapa.tinggi+" m");
    }
}
