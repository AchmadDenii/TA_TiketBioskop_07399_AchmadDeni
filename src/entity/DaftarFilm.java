package entity;

public class DaftarFilm extends PesanTiket{

    public DaftarFilm(String judulFilm, int kodeFilm, double jamTayang, int jumlahTiket, double hargaTiket) {
        super(judulFilm, kodeFilm, jamTayang, jumlahTiket, hargaTiket);
    }

    public void Tampil() {
        System.out.println("Judul DaftarFilm                  :" + getJudulFilm());
    }
}