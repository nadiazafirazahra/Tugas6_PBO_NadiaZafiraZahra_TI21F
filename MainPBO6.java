package PBONadiaZafiraZahra;

/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class MainPBO6 {
 public static void main(String[] args) {
        BangunDatar segitiga=new SegiTiga(12, 20);
        BangunDatar lingkaran=new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : "+segitiga.getLuas());
        System.out.println("Luas dari bangun datar luangkaran : "+lingkaran.getLuas());
    }
}   