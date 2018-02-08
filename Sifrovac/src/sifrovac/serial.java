package sifrovac;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class serial {
    public static void main(String[] args) {
        int x;
        //int y;
        
        int[] file = new int[x];
     //   file[0] = ?;
        
        try {
            ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("vstupni_retezec.dat"));    
            out.writeObject(file);
            out.close();
        } catch (Exception e) {
            System.out.println("Neco vyhod:" + e);
        }
    }
}
