package entity;

public class PilihKursi extends PesanTiket{
    protected boolean status;
    public PilihKursi(String judulFilm, int kodeFilm, double jamTayang, int jumlahTiket, double hargaTiket, boolean status) {
        super(judulFilm, kodeFilm, jamTayang, jumlahTiket, hargaTiket);
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
