package InventryManagementLLD;

public class Address {

    int pincode;
    String city;
    String state;

    Address(int pincode,String city,String state)
    {
        this.pincode = pincode;
        this.city =city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
