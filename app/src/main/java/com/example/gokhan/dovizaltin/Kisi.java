package com.example.gokhan.dovizaltin;

public class Kisi {
    private boolean kadinMi;
    private String isim;

    public Kisi(String isim, boolean kadinMi){
        super();
        this.isim = isim;
        this.kadinMi=kadinMi;
    }

    public boolean isKadinMi() {
        return kadinMi;
    }

    public void setKadinMi(boolean kadinMi) {
        this.kadinMi = kadinMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
