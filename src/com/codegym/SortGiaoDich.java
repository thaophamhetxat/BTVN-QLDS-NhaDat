package com.codegym;

import java.util.Comparator;

public class SortGiaoDich implements Comparator<GiaoDich> {


    @Override
    public int compare(GiaoDich o1, GiaoDich o2) {
        return o1.getNgayGiaoDich().compareTo(o2.ngayGiaoDich);
    }
}
