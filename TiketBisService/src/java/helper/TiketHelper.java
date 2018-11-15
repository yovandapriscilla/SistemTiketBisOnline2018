/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Jadwal;
import pojos.Tiket;
import util.TiketBisHibernateUtil;

/**
 *
 * @author ASUS
 */
public class TiketHelper {
    public TiketHelper() {
    }
    
    public List<Tiket> getTiket() {
        List<Tiket> result = null;
        Session session = TiketBisHibernateUtil.getSessionFactory().openSession();
        String query = "from Tiket t";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
    
    public void addNewTiket(
            String kodeTiket,
            String noKursi,
            String namaCalonPenumpang,
            int nik,
            int umur,
            String email,
            String noTelepon,
            String alamat,
            String metodePembayaran,
            String statusTiket,
            String kodeJadwal) {
        Session session = TiketBisHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Tiket tiket = new Tiket(kodeTiket, noKursi, namaCalonPenumpang, nik, umur, email, noTelepon, alamat, metodePembayaran, statusTiket, kodeJadwal);
        session.saveOrUpdate(tiket);
        tx.commit();
        session.close();
    }
}
