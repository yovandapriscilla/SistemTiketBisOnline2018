/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.JadwalHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class TestAddNewJadwal1 {
    public static void main(String[] args) throws ParseException {
        try {
            String kodeJadwal = "a11";
            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat format2 = new SimpleDateFormat("H:mm:ss");
            String tglBerangkat = "20181201";
            Date date1 = format1.parse(tglBerangkat);
            String tglSampai = "20181201";
            Date date2 = format1.parse(tglSampai);
            String jamBerangkat = "12:00:00";
            Date date3 = format2.parse(jamBerangkat);
            String jamSampai = "16:00:00";
            Date date4 = format2.parse(jamSampai);
            String noBus = "a34";
            String terminalAsal = "Jombor";
            String terminalTujuan = "Solo";
            String hargaTiket = "25000";
            JadwalHelper helper = new JadwalHelper();
            helper.addNewJadwal(kodeJadwal, date1, date2, date3, date4, noBus, terminalAsal, 
                    terminalTujuan, hargaTiket);
        } catch (ParseException ex) {
            Logger.getLogger(TestAddNewJadwal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
