/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3;

/**
 *
 * @author Thole
 */
public class TugasModul3Mhs {
    private String nim;
    private String nama;
    private String jurusan;
 
    public TugasModul3Mhs(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
 
    public String getJurusan() {
        return jurusan;
    }
 
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getNim() {
        return nim;
    }
 
    public void setNim(String nim) {
        this.nim = nim;
    }
}
