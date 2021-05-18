package com.dejan.register;

public class Individual extends User{
    private String firstName="";
    private String LastName="";
    private String personalID="";
    private String adrres="";
    private String phoneNumber="";
    private String city="";

    public Individual(String firstName, String lastName, String personalID, String adrres, String phoneNumber, String city) {
        this.firstName = firstName;
        LastName = lastName;
        this.personalID = personalID;
        this.adrres = adrres;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
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

        Individual that = (Individual) o;

        return personalID != null ? personalID.equals(that.personalID) : that.personalID == null;
    }

    @Override
    public int hashCode() {
        return personalID != null ? personalID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", personalID='" + personalID + '\'' +
                ", adrres='" + adrres + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
