package com.Owner;

import com.adress.Adress;

public class Owner {
    private String name;
    private String RFC;
    private String ine;
    private String birth_date;
    private Adress adress;



    public Owner(String name, String RFC, String ine, Adress adress){
        this.name = name;
        this.RFC = RFC;
        this.ine = ine;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }





    public String toString(){
        return "Owner [ Name: " + this.name +
                ", RFC: " + this.RFC +
                ", INE: " + this.ine +
                "\nAdress: " + this.adress.getCity() + ", " + this.adress.getState()  +  " ]";
    }
}
