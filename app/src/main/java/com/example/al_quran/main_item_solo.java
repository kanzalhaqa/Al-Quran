package com.example.al_quran;

public class main_item_solo {
    private String surahNameArab;
    private String surahNameEnglish;

    public main_item_solo(String surahNameArab, String surahNameEnglish) {
        this.surahNameArab = surahNameArab;
        this.surahNameEnglish = surahNameEnglish;
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
