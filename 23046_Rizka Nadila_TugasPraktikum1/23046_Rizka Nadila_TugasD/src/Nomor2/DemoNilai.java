package Nomor2;

/**
 *
 * @author Rizka Nadila
 */
public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilai1 = new Nilai();
        nilai1.Nim = "23046";
        nilai1.Nama = "Rizka Nadila";
        nilai1.NilaiAbsen = 20;
        nilai1.NilaiTugas = 100;
        nilai1.NilaiUts = 80;
        nilai1.NilaiUas = 70;
        nilai1.Nilai();
        nilai1.CetakNilai();
    }
}