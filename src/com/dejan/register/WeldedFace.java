package com.dejan.register;

public class WeldedFace extends User{
    private String id="";
    private String name="";
    private String adrres="";
    private String phoneNumber="";
    private String city="";

    public WeldedFace(String id, String name, String adrres, String phoneNumber, String city) {
        this.id = id;
        this.name = name;
        this.adrres = adrres;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeldedFace that = (WeldedFace) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


    @Override
    public String toString() {
        return "WeldedFace{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adrres='" + adrres + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
