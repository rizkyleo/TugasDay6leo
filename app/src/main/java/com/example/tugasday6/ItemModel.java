package com.example.tugasday6;

public class ItemModel {
    private String namaitem;
    private int logoitem;
    private String deskripsi;
    private String harga;

    public ItemModel(String namaitem, int logoitem, String deskripsi, String harga) {
        this.namaitem = namaitem;
        this.logoitem = logoitem;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getNamaitem() {
        return namaitem;
    }

    public void setNamaitem(String namaitem) {
        this.namaitem = namaitem;
    }

    public int getLogoitem() {
        return logoitem;
    }

    public void setLogoitem(int logoitem) {
        this.logoitem = logoitem;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

