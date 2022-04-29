import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(13,7,0);
        s.PrintJudul();
        int hasilTambah = s.HitungTambah(13,7);
        System.out.println("Hasil Tambah = " + hasilTambah);
        int hasilPerkalian = s.Hitungkali(13,7);
        System.out.println("Hasil Kali = " + hasilPerkalian);
    }
}
