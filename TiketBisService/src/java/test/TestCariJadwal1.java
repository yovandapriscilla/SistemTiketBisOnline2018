/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.JadwalHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wewen
 */
public class TestCariJadwal1 {

    public static void main(String[] args) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String tglBerangkat = "20181201";
            Date date;
            date = format.parse(tglBerangkat);
            String kotaAsal = "Jogjakarta";
            String kotaTujuan = "Solo";
            JadwalHelper helper = new JadwalHelper();
            System.out.println(new Gson().toJson(helper.cari(kotaAsal, kotaTujuan, date)));
        } catch (ParseException ex) {
            Logger.getLogger(TestCariJadwal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
