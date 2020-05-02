package com.thesarthakarora.patientdatachecker;

import com.google.gson.Gson;

public class UserDetails {
    private String name;
    private String hospitalName;
    private String admissionDate;
    private String releaseDate;
    private String symptoms;
    private String email;
    private String address;
    private String comments;
    private String ipfsURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getIpfsURL() {
        return ipfsURL;
    }

    public void setIpfsURL(String ipfsURL) {
        this.ipfsURL = ipfsURL;
    }

    public static void main(String[] args) {

       String json = "{\"name\":\"Varun Ramnani\",\"hospitalName\":\"Hospital1\",\"admissionDate\":\"May 14, 2020\",\"releaseDate\":\"May 9, 2020\",\"symptoms\":\"asasasa\",\"email\":\"v@gmail.com\",\"comments\":\"add\",\"address\":\"0x1bb1d7321c09Aa0A2a03B71959Dcb62B4ea91dAF\",\"ipfsURL\":\"https://gateway.ipfs.io/ipfs/QmWYnHECugqJAnNsLYxaFuh46HrGR7uezqf4h8Re1acHdw\"}";
       Gson gson = new Gson();
        UserDetails user = gson.fromJson(json, UserDetails.class);
        System.out.println(user);
    }
}
