package com.company.The_Losst;

import java.io.FileReader;

public class Hippo_Parser
{
    String NOMER,mesto,klichka,mast,naezdnik,rezvost,otstavania,sboi,narushenia;

    public Hippo_Parser(String NOMER, String klichka, String mast, String naezdnik) {
        this.NOMER = NOMER;
        this.klichka = klichka;
        this.mast = mast;
        this.naezdnik = naezdnik;
        this.rezvost = " ";
        this.otstavania = " ";
        this.sboi = " ";
        this.narushenia = " ";
        this.mesto = " ";
    }

    public String getNOMER() {
        return NOMER;
    }

    public void setNOMER(String NOMER) {
        this.NOMER = NOMER;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getKlichka() {
        return klichka;
    }

    public void setKlichka(String klichka) {
        this.klichka = klichka;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public String getNaezdnik() {
        return naezdnik;
    }

    public void setNaezdnik(String naezdnik) {
        this.naezdnik = naezdnik;
    }

    public String getRezvost() {
        return rezvost;
    }

    public void setRezvost(String rezvost) {
        this.rezvost = rezvost;
    }

    public String getOtstavania() {
        return otstavania;
    }

    public void setOtstavania(String otstavania) {
        this.otstavania = otstavania;
    }

    public String getSboi() {
        return sboi;
    }

    public void setSboi(String sboi) {
        this.sboi = sboi;
    }

    public String getNarushenia() {
        return narushenia;
    }

    public void setNarushenia(String narushenia) {
        this.narushenia = narushenia;
    }

    @Override
    public String toString() {
        return "Hippo_Parser{" +
                "NOMER='" + NOMER + '\'' +
                ", mesto='" + mesto + '\'' +
                ", klichka='" + klichka + '\'' +
                ", mast='" + mast + '\'' +
                ", naezdnik='" + naezdnik + '\'' +
                ", rezvost='" + rezvost + '\'' +
                ", otstavania='" + otstavania + '\'' +
                ", sboi='" + sboi + '\'' +
                ", narushenia='" + narushenia + '\'' +
                '}';
    }
}
