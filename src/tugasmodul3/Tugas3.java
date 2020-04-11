/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thole
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tugas3 serial = new Tugas3();
        serial.writeObject();
        serial.readObject();
 
    }
    //membaca objek ke dalam file
   private void writeObject(){
       TugasModul3Mhs [] mhs = new TugasModul3Mhs[2];
       mhs[0] = new TugasModul3Mhs("001", "makrifa", "informatika");
       mhs[1] = new TugasModul3Mhs("002", "jannah", "informatika");
        try {
            ObjectOutputStream writeStream = new ObjectOutputStream(new FileOutputStream("file.mhs"));
            writeStream.writeObject(mhs);
            writeStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Tugas3.class.getName()).log(Level.SEVERE, null, ex);
        }
 
   }
   //membaca objek ke dalam file
   private void readObject(){
        try {
            ObjectInputStream readStream = new ObjectInputStream(new FileInputStream("file.mhs"));
                 for(TugasModul3Mhs m : (TugasModul3Mhs[])readStream.readObject()){
                    //menampilkan data yang di miliki
                    System.out.println("nama : "+m.getNama());
                    System.out.println("nim : "+m.getNim());
                    System.out.println("nama : "+m.getJurusan());
                 }
                 readStream.close();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Tugas3.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
}
