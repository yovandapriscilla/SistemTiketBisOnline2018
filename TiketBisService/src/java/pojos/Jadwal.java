package pojos;
// Generated Dec 13, 2018 1:35:07 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Jadwal generated by hbm2java
 */
public class Jadwal  implements java.io.Serializable {


     private String kodeJadwal;
     private Date tanggalBerangkat;
     private Date tanggalSampai;
     private String jamBerangkat;
     private String jamSampai;
     private String nomorBus;
     private String terminalAsal;
     private String terminalTujuan;
     private String hargaTiket;
     private String kotaAsal;
     private String kotaTujuan;

    public Jadwal() {
    }

    public Jadwal(String kodeJadwal, Date tanggalBerangkat, Date tanggalSampai, String jamBerangkat, String jamSampai, String nomorBus, String terminalAsal, String terminalTujuan, String hargaTiket, String kotaAsal, String kotaTujuan) {
       this.kodeJadwal = kodeJadwal;
       this.tanggalBerangkat = tanggalBerangkat;
       this.tanggalSampai = tanggalSampai;
       this.jamBerangkat = jamBerangkat;
       this.jamSampai = jamSampai;
       this.nomorBus = nomorBus;
       this.terminalAsal = terminalAsal;
       this.terminalTujuan = terminalTujuan;
       this.hargaTiket = hargaTiket;
       this.kotaAsal = kotaAsal;
       this.kotaTujuan = kotaTujuan;
    }
   
    public String getKodeJadwal() {
        return this.kodeJadwal;
    }
    
    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }
    public Date getTanggalBerangkat() {
        return this.tanggalBerangkat;
    }
    
    public void setTanggalBerangkat(Date tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }
    public Date getTanggalSampai() {
        return this.tanggalSampai;
    }
    
    public void setTanggalSampai(Date tanggalSampai) {
        this.tanggalSampai = tanggalSampai;
    }
    public String getJamBerangkat() {
        return this.jamBerangkat;
    }
    
    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }
    public String getJamSampai() {
        return this.jamSampai;
    }
    
    public void setJamSampai(String jamSampai) {
        this.jamSampai = jamSampai;
    }
    public String getNomorBus() {
        return this.nomorBus;
    }
    
    public void setNomorBus(String nomorBus) {
        this.nomorBus = nomorBus;
    }
    public String getTerminalAsal() {
        return this.terminalAsal;
    }
    
    public void setTerminalAsal(String terminalAsal) {
        this.terminalAsal = terminalAsal;
    }
    public String getTerminalTujuan() {
        return this.terminalTujuan;
    }
    
    public void setTerminalTujuan(String terminalTujuan) {
        this.terminalTujuan = terminalTujuan;
    }
    public String getHargaTiket() {
        return this.hargaTiket;
    }
    
    public void setHargaTiket(String hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    public String getKotaAsal() {
        return this.kotaAsal;
    }
    
    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }
    public String getKotaTujuan() {
        return this.kotaTujuan;
    }
    
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }




}


