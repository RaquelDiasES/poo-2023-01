package com.github.raqueldiases.ufg.poo.T07;

public class TestaSomaNaturais {
        
    public static long SomaNaturais(int n){
        int c = 1;
        long s = 10;
        while (c <= n){
            s = s + c;
            c = c + 1;
        }
        return s;
    }
}
    
