package pojos;
// Generated Nov 8, 2018 1:25:58 PM by Hibernate Tools 4.3.1



/**
 * Tiket generated by hbm2java
 */
public class Tiket  implements java.io.Serializable {


     private String kodeTiket;
     private Jadwal jadwal;
     private String noKursi;
     private String namaCalonPenumpang;
     private int nik;
     private int umur;
     private String email;
     private String noTelepon;
     private String alamat;
     private String metodePembayaran;
     private String statusTiket;
     private String kodeJadwal;

    public Tiket() {
    }

    public Tiket(Jadwal jadwal, String noKursi, String namaCalonPenumpang, int nik, int umur, String email, String noTelepon, String alamat, String metodePembayaran, String statusTiket, String kodeJadwal) {
       this.jadwal = jadwal;
       this.noKursi = noKursi;
       this.namaCalonPenumpang = namaCalonPenumpang;
       this.nik = nik;
       this.umur = umur;
       this.email = email;
       this.noTelepon = noTelepon;
       this.alamat = alamat;
       this.metodePembayaran = metodePembayaran;
       this.statusTiket = statusTiket;
       this.kodeJadwal = kodeJadwal;
    }
   
    public String getKodeTiket() {
        return this.kodeTiket;
    }
    
    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }
    public Jadwal getJadwal() {
        return this.jadwal;
    }
    
    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    public String getNoKursi() {
        return this.noKursi;
    }
    
    public void setNoKursi(String noKursi) {
        this.noKursi = noKursi;
    }
    public String getNamaCalonPenumpang() {
        return this.namaCalonPenumpang;
    }
    
    public void setNamaCalonPenumpang(String namaCalonPenumpang) {
        this.namaCalonPenumpang = namaCalonPenumpang;
    }
    public int getNik() {
        return this.nik;
    }
    
    public void setNik(int nik) {
        this.nik = nik;
    }
    public int getUmur() {
        return this.umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNoTelepon() {
        return this.noTelepon;
    }
    
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getMetodePembayaran() {
        return this.metodePembayaran;
    }
    
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public String getStatusTiket() {
        return this.statusTiket;
    }
    
    public void setStatusTiket(String statusTiket) {
        this.statusTiket = statusTiket;
    }
    public String getKodeJadwal() {
        return this.kodeJadwal;
    }
    
    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }




}


