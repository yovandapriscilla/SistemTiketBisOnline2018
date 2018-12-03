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
            String jamBerangkat,
            String jamSampai,
            String nomorBus,
            String terminalAsal,
            String terminalTujuan,
            String hargaTiket,
            String kotaAsal,
            String kotaTujuan) {
        Session session = TiketBisHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Jadwal jadwal = new Jadwal(kodeJadwal, tanggalBerangkat, tanggalSampai, jamBerangkat, jamSampai, nomorBus, 
                terminalAsal, terminalTujuan, hargaTiket, kotaAsal, kotaTujuan);
        session.saveOrUpdate(jadwal);
        tx.commit();
        session.close();
    }

    public List<Jadwal> cari(
            String kotaAsal,
            String kotaTujuan,
            Date tanggalBerangkat) {
        Session session = TiketBisHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String query = "from Jadwal j where j.kotaAsal=:kotaAsal AND j.kotaTujuan=:kotaTujuan AND j.tanggalBerangkat=:tanggalBerangkat";
        Query q = session.createQuery(query);
        q.setParameter("kotaAsal", kotaAsal);
        q.setParameter("kotaTujuan", kotaTujuan);
        q.setParameter("tanggalBerangkat", tanggalBerangkat);
        List<Jadwal> list = q.list();
        tx.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
