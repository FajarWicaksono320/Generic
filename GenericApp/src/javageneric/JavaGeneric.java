/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javageneric;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class JavaGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Mahasiswa> listV = new ArrayList();
        for (int i = 1; i <= 50; i++) {
            Mahasiswa m = new Mahasiswa();
            m.setNim(i);
            m.setNama("Fajar Wicaksono"+i);
            m.setEmail("jarr.com");
            listV.add(m);
        }
        for (Mahasiswa mhs : listV) {
            var nim = mhs.getNim();
            var nama = mhs.getNama();
            var email = mhs.getEmail();
            System.out.println("nim="+nim);
            System.out.println("nama="+nama);
            System.out.println("email="+email);
            System.out.println("==========");
        }
    }

}
