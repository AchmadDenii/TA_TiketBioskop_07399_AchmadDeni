package model;

import entity.DaftarFilm;

import java.util.ArrayList;
public class DaftarFilmModel {
    private ArrayList<DaftarFilm> DataFilm;
    public ArrayList<DaftarFilm> getDataFilm;

    public void DaftarFilm(){
        DataFilm = new ArrayList<>();
    }
    public ArrayList<DaftarFilm>getDataFilm(){
        return DataFilm;
    }
}
