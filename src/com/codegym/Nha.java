package com.codegym;

public class Nha extends GiaoDich{
    String diaChi;

    public Nha() {
    }

    public Nha(String loaiNha, String diaChi) {
        this.diaChi = diaChi;
    }

    public Nha(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nha(int maGiaoDich, String ngayGiaoDich, int donGia, int dienTich, String phanLoai, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich, phanLoai);
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nha{" +
                "maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                ", loaiNha='" +  '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
