package com.juaracoding.utils;

public enum TestCases {

    T1("pengguna dapat login ke dalam sistem dengan sukses menggunakan kredensial yang benar."),
    T2("pengguna tidak dapat login ke dalam sistem dengan krudensial yang salah."),
    T3("pengguna dapat menambahkan barang ke dalam keranjang");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
