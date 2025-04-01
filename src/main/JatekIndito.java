package main;

public class JatekIndito {
    public static void main(String[] args) {
        Jatek csigas = new CsigasJatek();
        Jatek kitalalos = new KitalalosJatek();
        Jatek[] jatekok = {csigas, kitalalos, new Jatek()};
        
        for (Jatek jatek : jatekok) {
            jatek.start();
        }

        // Csigás játék indítása
        CsigasJatek csigaJatek = (CsigasJatek) csigas;
        csigaJatek.verseny();  // Csigás verseny elindítása
        csigaJatek.csigagyorsitas();  // Egy csiga gyorsítása
        csigaJatek.verseny();  // Újabb verseny, hogy lássuk a gyorsítást
    }
}
