package main;

import java.util.Random;

public class Csiga {
    private static final Random RND = new Random();
    
    private String szin, megtettUt = "", szinKod;
    private boolean gyorsito = false;
    private static final String ABRA = "🐌";
    private static final char UTJEL_1 = '-' ;
    private static final char UTJEL_2 = '~' ;
    
    public Csiga(String szin){
        this.szin = szin;
    }
    
    private void setSzinkod(String szinKod){
        this.szinKod = szinKod;
    } 
    
    public void megy(){
        int utacska = RND.nextInt(0, 4);
        if (this.gyorsito) {
            for (int i = 0; i < utacska; i++) {
                this.megtettUt += "" + UTJEL_2 + UTJEL_2;
            }
        }else {
            for (int i = 0; i < utacska; i++) {
                this.megtettUt += UTJEL_1;
            } 
        }
    }
    public String getMegtettUt() {
        return megtettUt;
    }

    public String getSzin() {
        return szin;
    }

    public String getSzinKod() {
        return szinKod;
    }

    public String getEmoji() {
        return ABRA;  // Csiga emoji hozzáadása
    }

    public void setGyorsito(boolean gyorsito) {
        this.gyorsito = gyorsito;
    }
}
