/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyger;

/**
 *
 * @author nfric
 */
public class Formula {

    private double oleo;
    private double agua;
    private double soda;
    private double ratio;

    public Formula() {
        oleo = agua = soda = ratio = 0.0f;
    }

    public Formula(double o, double a, double s) {
        oleo = o;
        agua = a;
        soda = s;
        ratio = 1.0f;
    }

    public void setRatio(double newOleo) {
        ratio = newOleo / oleo;
    }

    public double Oleo() {
        return oleo * ratio;
    }

    public double Agua() {
        return agua * ratio;
    }

    public double Soda() {
        return soda * ratio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        // Class name is Employ & have lastname
        Formula f = (Formula) obj;
        return this.oleo == f.oleo && this.agua == f.agua && this.soda == f.soda;
    }

}
