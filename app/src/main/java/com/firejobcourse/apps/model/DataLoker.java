package com.firejobcourse.apps.model;

public class DataLoker {
    String pekerjaan, alamat,perusahaan,website;

    public DataLoker(String pekerjaan, String alamat, String perusahaan, String website) {
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.perusahaan = perusahaan;
        this.website = website;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
