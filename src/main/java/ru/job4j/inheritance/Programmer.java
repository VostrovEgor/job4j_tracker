package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int degree, boolean experienc) {
        super(degree, experienc);
        this.programLang = programLang;
    }
}