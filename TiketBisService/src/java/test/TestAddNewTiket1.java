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
//            String kodeTiket = "1154568";
            String noKursi = "D01";
            String namaCalonPenumpang = "Dia aja";
            String nik = "1154568";
            String umur = "22";
            String email = "dia5@gmail.com";
            String noTelepon = "0821245687";
            String alamat = "jalan aja";
            String metodePembayaran = "BCA";
            String statusTiket = "Proses";
            String noRekening = "165314226";

            JadwalHelper jadHelp = new JadwalHelper();
            List<Jadwal> list = jadHelp.getJadwal();
            String j = list.get(0).getKodeJadwal();
            System.out.println(j);

            TiketHelper helper = new TiketHelper();
            helper.addNewTiket(nik, noKursi, namaCalonPenumpang, nik, umur, email, noTelepon, alamat,
                    metodePembayaran, statusTiket, j, noRekening);
        } catch (Exception ex) {
            Logger.getLogger(TestAddNewJadwal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
