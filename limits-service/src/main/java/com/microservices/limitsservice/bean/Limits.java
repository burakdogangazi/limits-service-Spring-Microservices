package com.microservices.limitsservice.bean;

public class Limits {

    private int maximum;
    private int minumum;

    public Limits(){
        super();
    }

    public Limits(int maximum, int minumum) {
        this.maximum = maximum;
        this.minumum = minumum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinumum() {
        return minumum;
    }

    public void setMinumum(int minumum) {
        this.minumum = minumum;
    }
}
