package model;
import entity.PesanTiket;

import java.util.ArrayList;

public class PesanTiketModel {
    static ArrayList<PesanTiket> arraytiket = new ArrayList<>();
    public static ArrayList<PesanTiket>all(){
        return arraytiket;
    }
    public void initialdata(){
        arraytiket.add(new PesanTiket("senin", 123, 12.00 , 12, 2022));
        arraytiket.add(new PesanTiket("selasa", 123, 12.00, 12, 2022));
        arraytiket.add(new PesanTiket("rabu", 123, 12.00, 12, 2022));
        arraytiket.add(new PesanTiket("kamis", 123, 12.00, 12, 2022));
        arraytiket.add(new PesanTiket("jumat", 123, 12.00, 12, 2022));
        arraytiket.add(new PesanTiket("sabtu", 123, 12.00, 12, 2022));
        arraytiket.add(new PesanTiket("minggu", 123, 12.00, 12, 2022));
    }
    public static PesanTiket cari(String hari, int tanggal, int bulan, int tahun){
        for(PesanTiket objek : arraytiket){
            return objek;
        }
        return null;
    }
}
