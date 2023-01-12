package entity;

public class Pembeli {
    private User pembeli;
    private boolean legit;
    private int filmIndex;

    public Pembeli(User pembeli, boolean legit, int filmIndex) {
        this.pembeli = pembeli;
        this.legit = legit;
        this.filmIndex = filmIndex;
    }

    public User getPembeli() {
        return pembeli;
    }

    public void setPembeli(User pembeli) {
        this.pembeli = pembeli;
    }

    public boolean isLegit() {
        return legit;
    }

    public void setLegit(boolean legit) {
        this.legit = legit;
    }

    public int getFilmIndex() {
        return filmIndex;
    }

    public void setFilmIndex(int filmIndex) {
        this.filmIndex = filmIndex;
    }
}
