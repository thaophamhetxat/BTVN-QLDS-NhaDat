package com.codegym;

import java.util.*;

public class ManageGiaoDich {
    List<GiaoDich> giaoDich = new ArrayList<GiaoDich>();

    static Scanner scanner = new Scanner(System.in);
    static SortGiaoDich sortGiaoDich = new SortGiaoDich();

    public void addGiaoDich(String loaiGiaoDich) {
        GiaoDich giaoDichs = create(loaiGiaoDich);
        giaoDich.add(giaoDichs);
    }

    public void thanhTien(String phanLoai) {
        GiaoDich giaoDichs = create(phanLoai);
        giaoDich.add(giaoDichs);
    }

    public GiaoDich create(String loaiGiaoDich) {
        System.out.println("mã giao dịch");
        int maGiaoDich = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngày giao dịch");
        String ngayGiaoDich = scanner.nextLine();
        System.out.println("Đơn giá");
        int donGia = Integer.parseInt(scanner.nextLine());
        System.out.println("Diện tích");
        int dienTich = Integer.parseInt(scanner.nextLine());
        System.out.println("Phan loại");
        String phanLoai = scanner.nextLine();

        if (loaiGiaoDich == "Nha") {
            System.out.println("Địa chỉ nhà: ");
            String diaChi = scanner.nextLine();
            return new Nha(maGiaoDich, ngayGiaoDich, donGia, dienTich, phanLoai, diaChi);
        }
        if (loaiGiaoDich == "Dat") {
            return new Dat(maGiaoDich, ngayGiaoDich, donGia, dienTich, phanLoai);
        }
        return null;
    }

    public void demSoLuong(String loaiGiaoDich) {
        int count = 0;
        if (loaiGiaoDich == "Nha") {
            for (GiaoDich g : giaoDich) {
                count++;
                System.out.println("số lượng giao dịch nhà là :" + count);
            }
        }
        if (loaiGiaoDich == "Dat") {
            for (GiaoDich g : giaoDich) {
                count++;
                System.out.println("số lượng giao dịch đất là :" + count);
            }
        }

    }

    public void show() {
        for (GiaoDich g : giaoDich) {
            System.out.println(g);
        }
    }

    public void xoaTheoNgay() {
        String ngayGD = scanner.nextLine();
        giaoDich.removeIf(x -> x.getNgayGiaoDich().equals(ngayGD));
    }

    public void tinhTienNgay(String phanLoai) {
        String ngayTinhTien = scanner.nextLine();
        if (phanLoai == "Nha") {
            for (GiaoDich g : giaoDich) {
                if (g.getPhanLoai().equals(ngayTinhTien)) {
                    if (g.getPhanLoai().equals("A")) {
                        System.out.println("Thành tiền: " + (Integer.parseInt(String.valueOf(g.getDienTich())) * Integer.parseInt(String.valueOf(g.getDonGia())) * 1.5));
                    }
                    if (g.getPhanLoai().equals("B") ||
                            g.getPhanLoai().equals("C")) {
                        System.out.println("Thành tiền: " + (Integer.parseInt(String.valueOf(g.getDienTich())) * Integer.parseInt(String.valueOf(g.getDonGia()))));
                    }
                }

            }
        }if(phanLoai == "Dat"){
            for(GiaoDich g:giaoDich){
                if(g.getPhanLoai().equals(ngayTinhTien)){
                    if(g.getPhanLoai().equals("CaoCap")){
                        System.out.println("Thành tiền: "+(Integer.parseInt(String.valueOf(g.getDienTich())) * Integer.parseInt(String.valueOf(g.getDonGia()))));
                    }if(g.getPhanLoai().equals("Thuong")){
                        System.out.println("Thành tiền: "+(Integer.parseInt(String.valueOf(g.getDienTich())) * Integer.parseInt(String.valueOf(g.getDonGia()))) /100 * 90);
                    }
                }
            }
        }


    }

    public void sort() {
        Collections.sort(giaoDich, sortGiaoDich);
    }


}
