/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifrovac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author ACER
 */
public class load {
 // public load() {
 // }
  public static void main(String[] args) {
    if (args.length<2) {
      System.out.println("copy soubor1 do soubor2");
      return;
    }
    InputStream vstup = null;
    OutputStream vystup = null;
    // otevření prvního souboru pro čtení a založení vstupního proudu
    try {
      vstup = new FileInputStream(args[0]);
    } catch (IOException e) {
      System.out.println("Soubor "+args[0]+" se nepodarilo otevrit!");
      return;
    }
      // otevření druhého souboru pro zápis a založení výstupního proudu
    try {
      vystup = new FileOutputStream(args[1]);
      } catch (IOException e) {
        System.out.println("Soubor "+args[1]+" se nepodarilo vytvorit!");
        return;
      }
    // kopírování obsahu souboru
    byte data[] = new byte[1024];
    int pocet;
    try {
      while (vstup.available()>0) {
        pocet = vstup.read(data);
        vystup.write(data, 0, pocet);
      }
    }
    catch (IOException ex) {
      System.out.println("Nastala chyba pri kopirovani souboru!");
    }
  }  
}
