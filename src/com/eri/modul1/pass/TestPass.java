package com.eri.modul1.pass;

public class TestPass {
    int nomer1;
    int nomer2;

    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Method pass by value, parameter berupa tipe data primitf
    public void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }

    //Method by reference, parameter berupa tipe data class
    public void calculate(TestPass pass){
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }

}
