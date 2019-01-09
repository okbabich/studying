package com.qa.studying.addressbook;

public class ContactData {
    private final String first_name;
    private final String last_name;
    private final String address;
    private final String mobile_phone;
    private final String mail;

    public ContactData(String first_name, String last_name, String address, String mobile_phone, String mail) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.mobile_phone = mobile_phone;
        this.mail = mail;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public String getMail() {
        return mail;
    }
}
