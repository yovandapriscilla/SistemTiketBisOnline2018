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
 * @author ASUS
 */
public class TestTiket1 {

    public static void main(String[] args) {
        TiketHelper helper = new TiketHelper();
        List<Tiket> list = helper.getTiket();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
