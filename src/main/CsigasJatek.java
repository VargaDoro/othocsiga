package main;

import java.util.Random;
import java.util.Scanner;

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
            valasztott.setGyorsito(true);  // Beállítjuk a gyorsítót, ha kiválasztottuk a csigát.
        }
        return valasztott;
    }
    
    public void verseny() {
        for (Csiga csiga : csigak) {
            csiga.megy();
            System.out.println(csiga.getSzin() + " csiga (" + csiga.getEmoji() + ") útja: " + csiga.getMegtettUt());
        }
    }

    public void fogadas() {
        // Felhasználói fogadás kérése
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik csigára fogadsz? (piros, zold, kek): ");
        String fogadottCsiga = scanner.nextLine().toLowerCase();

        Csiga fogadott = null;
        for (Csiga csiga : csigak) {
            if (csiga.getSzin().equals(fogadottCsiga)) {
                fogadott = csiga;
                break;
            }
        }

        csigagyorsitas();  
        verseny();  

        Csiga nyertes = csigak[0];
        for (Csiga csiga : csigak) {
            if (csiga.getMegtettUt().length() > nyertes.getMegtettUt().length()) {
                nyertes = csiga;
            }
        }

        System.out.println("A nyertes csiga: " + nyertes.getSzin() + " (" + nyertes.getEmoji() + ")");
        if (nyertes.getSzin().equals(fogadottCsiga)) {
            System.out.println("Gratulálunk, nyertél a " + nyertes.getSzin() + " csigára tett fogadásoddal!");
        } else {
            System.out.println("Sajnáljuk, a " + nyertes.getSzin() + " csiga nyert. Jobb szerencsét legközelebb!");
        }
    }
}
