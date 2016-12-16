package com.eusecom.attendance.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START blog_user_class]
@IgnoreExtraProperties
public class Attendance {

    public String usico;
    public String usid;
    public String ume;
    public String dmxa;
    public String dmna;
    public String daod;
    public String dado;
    public String dnixa;
    public String hodxb;
    public String longi;
    public String lati;
    public String datm;

    public Attendance() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }



    public Attendance(String usico, String usid, String ume, String dmxa, String dmna, String daod, String dado, String dnixa,
                      String hodxb, String longi, String lati, String datm) {
        this.usico = usico;
        this.usid = usid;
        this.ume = ume;
        this.dmxa = dmxa;
        this.dmna = dmna;
        this.daod = daod;
        this.dado = dado;
        this.dnixa = dnixa;
        this.hodxb = hodxb;
        this.longi = longi;
        this.lati = lati;
        this.datm = datm;
    }


    public String getUsico() {

        return this.usico;

    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("usico", usico);
        result.put("usid", usid);
        result.put("ume", ume);
        result.put("dmxa", dmxa);
        result.put("dmna", dmna);
        result.put("daod", daod);
        result.put("dado", dado);
        result.put("dnixa", dnixa);
        result.put("hodxb", hodxb);
        result.put("longi", longi);
        result.put("lati", lati);
        result.put("datm", datm);

        return result;
    }
    // [END post_to_map]

}
// [END blog_user_class]
