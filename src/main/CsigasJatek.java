package main;

import java.util.Random;

public class CsigasJatek extends Jatek {
    private static final Random RND = new Random();
    private Csiga[] csigak;

    public CsigasJatek() {
        csigak = new Csiga[3];
        csigakLetrehozasa();
    }

    public void csigakLetrehozasa(){
        csigak[0] = new Csiga("piros");
        csigak[1] = new Csiga("zold");
        csigak[2] = new Csiga("kek");
    } 

    public Csiga csigagyorsitas(){
        Csiga valasztott = null;
        int eselySzam = RND.nextInt(0, 100);
        boolean esely = false;
        if (eselySzam < 20) {
            esely = true;
            int csigaSzam = RND.nextInt(0, csigak.length);
            valasztott = csigak[csigaSzam];
            valasztott.gyorsito = true;  // Beállítjuk a gyorsítót, ha kiválasztottuk a csigát.
        }
        return valasztott;
    }
    
    public void verseny() {
        // Csigák mozgása
        for (Csiga csiga : csigak) {
            csiga.megy();
            System.out.println(csiga.getSzin() + " csiga útja: " + csiga.getMegtettUt());
        }
    }
}
