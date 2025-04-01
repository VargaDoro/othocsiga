package main;

import java.util.Scanner;

public class JatekIndito {
    public static void main(String[] args) {
        Jatek csigas = new CsigasJatek();
        Jatek kitalalos = new KitalalosJatek();
        Jatek[] jatekok = {csigas, kitalalos, new Jatek()};
        
        for (Jatek jatek : jatekok) {
            jatek.start();
        }

        CsigasJatek csigaJatek = (CsigasJatek) csigas;
        csigaJatek.fogadas();  
    }
}
