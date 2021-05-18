package com.dejan.register;

public abstract class User {
    private String adrres="";
    private String phoneNumber="";
    private String city="";

    public String getAdrres() {
        return adrres;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
