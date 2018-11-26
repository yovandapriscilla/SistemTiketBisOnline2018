/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.JadwalHelper;
import helper.TiketHelper;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Jadwal;

/**
 *
 * @author ASUS
 */
public class TestAddNewTiket1 {

    public static void main(String[] args) throws ParseException {
        try {
            String kodeTiket = "be209182";
            String noKursi = "c02";
            String namaCalonPenumpang = "lupa nama";
            int nik = 21354568;
            int umur = 20;
            String email = "diasiapa@gmail.com";
            String noTelepon = "0813245687";
            String alamat = "jalan.mana aja";
            String metodePembayaran = "BRI";
            String statusTiket = "Proses";
            String noRekening = "16531426";

            JadwalHelper jadHelp = new JadwalHelper();
            List<Jadwal> list = jadHelp.getJadwal();
            String j = list.get(0).getKodeJadwal();
            System.out.println(j);

            TiketHelper helper = new TiketHelper();
            helper.addNewTiket(kodeTiket, noKursi, namaCalonPenumpang, nik, umur, email, noTelepon, alamat,
                    metodePembayaran, statusTiket, j, noRekening);
        } catch (Exception ex) {
            Logger.getLogger(TestAddNewJadwal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
