/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.JadwalHelper;
import java.util.List;
import pojos.Jadwal;

/**
 *
 * @author ASUS
 */
public class TestJadwal1 {
    public static void main(String[] args) {
        JadwalHelper helper = new JadwalHelper();
        List<Jadwal> list = helper.getJadwal();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
