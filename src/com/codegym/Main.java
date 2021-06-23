package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManageGiaoDich manageGiaoDich = new ManageGiaoDich();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("1. Thêm giao dịch");
            System.out.println("2. Tính tổng số lượng");
            System.out.println("3. xóa giao dịch theo ngày");
            System.out.println("4. tính tiền giao dịch theo ngày");
            System.out.println("5. tìm mã giao dịch");
            System.out.println("6. Xắp xếp theo mã");
            System.out.println("7. Show");
            System.out.println("8. Edit");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1: {
                    System.out.println("      1. Thêm giao dịch nhà");
                    System.out.println("      2. Thêm giao dịch đất");
                    int select = Integer.parseInt(scanner.nextLine());
                    switch (select) {
                        case 1:
                            manageGiaoDich.addGiaoDich("Nha");
                            break;
                        case 2:
                            manageGiaoDich.addGiaoDich("Dat");
                            break;
                    }
                }
                break;
                case 6:
                    manageGiaoDich.sort();
                    break;
                case 2: {
                    System.out.println("      1.  giao dịch nhà");
                    System.out.println("      2.  giao dịch đất");
                    int select = Integer.parseInt(scanner.nextLine());
                    switch (select) {
                        case 1:
                            manageGiaoDich.demSoLuong("Nha");
                            break;
                        case 2:
                            manageGiaoDich.demSoLuong("Dat");
                            break;
                    }
                }
                break;
                case 7:
                    manageGiaoDich.show();
                    break;
                case 8:
                    System.exit(0);
                case 3: {
                    System.out.println("Nhập ngày cần xóa:");
                    manageGiaoDich.xoaTheoNgay();
                } break;
                case 4:{
                    System.out.println("      1.  tính tiền giao dịch nhà");
                    System.out.println("      2.  tính tiền giao dịch đất");
                    int select = Integer.parseInt(scanner.nextLine());
                    switch (select){
                        case 1: {
                            System.out.println("Nhập ngày cần tính:");
                            manageGiaoDich.tinhTienNgay("Nha");
                        }break;
                        case 2:{
                            System.out.println("Nhập ngày cần tính:");
                            manageGiaoDich.tinhTienNgay("Dat");
                        }break;
                    }
                }break;
                case 5: manageGiaoDich.search();break;
            }

        }
    }
}
