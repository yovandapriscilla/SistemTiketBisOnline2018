/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Jadwal;
import util.TiketBisHibernateUtil;

/**
 *
 * @author ASUS
 */
public class JadwalHelper {
    public JadwalHelper() {
    }
    
    public List<Jadwal> getJadwal() {
        List<Jadwal> result = null;
        Session session = TiketBisHibernateUtil.getSessionFactory().openSession();
        String query = "from Jadwal l";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
    
    public void addNewJadwal(
            String kodeJadwal,
            Date tanggalBerangkat,
            Date tanggalSampai,
            Date jamBerangkat,
            Date jamSampai,
            String nomorBus,
            String terminalAsal,
            String terminalTujuan,
            String hargaTiket) {
        Session session = TiketBisHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Jadwal jadwal = new Jadwal(kodeJadwal, tanggalBerangkat, tanggalSampai, jamBerangkat, jamSampai, 
                nomorBus, terminalAsal, terminalTujuan, hargaTiket);
        session.saveOrUpdate(jadwal);
        tx.commit();
        session.close();
    }
}
