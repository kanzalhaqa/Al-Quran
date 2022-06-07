package com.example.al_quran;

public class main_item_solo {
    private String surahNameArab;
    private String surahNameEnglish;
    private String surahNumber;


    public String getSurahNumber() {
        return surahNumber;
    }

    public void setSurahNumber(String surahNumber) {
        this.surahNumber = surahNumber;
    }




    public main_item_solo(String surahNameArab, String surahNameEnglish, String surahNumber) {
        this.surahNameArab = surahNameArab;
        this.surahNameEnglish = surahNameEnglish;
        this.surahNumber = surahNumber;

    }

    public String getSurahNameArab() {
        return surahNameArab;
    }

    public void setSurahNameArab(String surahNameArab) {
        this.surahNameArab = surahNameArab;
    }

    public String getSurahNameEnglish() {
        return surahNameEnglish;
    }

    public void setSurahNameEnglish(String surahNameEnglish) {
        this.surahNameEnglish = surahNameEnglish;
    }
}
