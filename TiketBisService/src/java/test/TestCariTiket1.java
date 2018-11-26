/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.TiketHelper;
import java.util.List;
import pojos.Tiket;

/**
 *
 * @author wewen
 */
public class TestCariTiket1 {

    public static void main(String[] args) {
        String kodeJadwal = "JS015";
        TiketHelper helper = new TiketHelper();
        System.out.println(new Gson().toJson(helper.cari(kodeJadwal)));
    }
}
