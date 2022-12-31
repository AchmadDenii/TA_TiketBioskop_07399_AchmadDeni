package entity;

public class PesanTiket {
    private String judulFilm;
    private int kodeFilm;
    private double jamTayang;
    private int jumlahTiket;
    private double hargaTiket;

    public PesanTiket(String judulFilm, int kodeFilm, double jamTayang, int jumlahTiket, double hargaTiket) {
        this.judulFilm = judulFilm;
        this.kodeFilm = kodeFilm;
        this.jamTayang = jamTayang;
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = hargaTiket;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public int getKodeFilm() {
        return kodeFilm;
    }

    public void setKodeFilm(int kodeFilm) {
        this.kodeFilm = kodeFilm;
    }

    public double getJamTayang() {
        return jamTayang;
    }

    public void setJamTayang(double jamTayang) {
        this.jamTayang = jamTayang;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}