package com.firejobcourse.apps;
import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Avin on 08/08/2018.
 */

public class Loker {
    public String pekerjaan;
    public String perusahaan;
    public String alamat;
    public String website;

    public Loker() {
    }

    public Loker(String pekerjaan, String perusahaan, String alamat, String website) {
        this.pekerjaan = pekerjaan;
        this.perusahaan = perusahaan;
        this.alamat = alamat;
        this.website = website;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("pekerjaan", pekerjaan);
        result.put("perusahaan", perusahaan);
        result.put("alamat", alamat);
        result.put("website", website);
        return result;
    }

}
