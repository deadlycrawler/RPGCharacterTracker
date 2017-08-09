package com.tools.radio.rpgcharactertracker;

//this class is to store the core stats for a character, Strenght Inteligence etc.

public class coreStats {
    Integer str = 0;
    Integer dex = 0;
    Integer con = 0;
    Integer Inteligence = 0;
    Integer wis = 0;
    Integer cha = 0;
    Integer HP = 0;

    public coreStats(Integer str, Integer dex, Integer con, Integer Inteligence, Integer wis, Integer cha, Integer HP) {

        this.str = str;
        this.dex = dex;
        this.con = con;
        this.Inteligence = Inteligence;
        this.wis = wis;
        this.cha = cha;
        this.HP = HP;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public Integer getCon() {
        return con;
    }

    public void setCon(Integer con) {
        this.con = con;
    }

    public Integer getInteligence() {
        return Inteligence;
    }

    public void setInteligence(Integer inteligence) {
        Inteligence = inteligence;
    }

    public Integer getWis() {
        return wis;
    }

    public void setWis(Integer wis) {
        this.wis = wis;
    }

    public Integer getCha() {
        return cha;
    }

    public void setCha(Integer cha) {
        this.cha = cha;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }


}
