package com.example.gokhan.dovizaltin;

public class Currency {
    private  String selling,buying,code,change_rate;

    public Currency(String code, String selling, String buying, String change_rate){
        this.code = code;
        this.selling = selling;
        this.buying = buying;
        this.change_rate = change_rate;
    }

    public String getSelling() {
        return selling;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public String getBuying() {
        return buying;
    }

    public void setBuying(String buying) {
        this.buying = buying;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getChange_rate() {
        return change_rate;
    }

    public void setChange_rate(String change_rate) {
        this.change_rate = change_rate;
    }
}
