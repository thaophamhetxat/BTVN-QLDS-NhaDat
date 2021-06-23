package com.codegym;

public class Dat extends GiaoDich{

    public Dat(){}

    public Dat(int maGiaoDich, String ngayGiaoDich, int donGia, int dienTich, String phanLoai) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich, phanLoai);
    }

    @Override
    public String toString() {
        return "Dat{" +
                "loaiDat='" +  '\'' +
                ", maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }
}
