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
            String kodeJadwal = "JS022";
            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
            String tglBerangkat = "20181205";
            Date date1 = format1.parse(tglBerangkat);
            String tglSampai = "20181205";
            Date date2 = format1.parse(tglSampai);
            String jamBerangkat = "10:00";
            String jamSampai = "15:00";
            String noBus = "J23";
            String terminalAsal = "Jombor";
            String terminalTujuan = "Solo";
            String hargaTiket = "50000";
            String kotaAsal = "Jogjakarta";
            String kotaTujuan = "Semarang";
            JadwalHelper helper = new JadwalHelper();
            helper.addNewJadwal(kodeJadwal, date1, date2, jamBerangkat, jamSampai, noBus, 
                    terminalAsal, terminalTujuan, hargaTiket, kotaAsal, kotaTujuan);
        } catch (ParseException ex) {
            Logger.getLogger(TestAddNewJadwal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
