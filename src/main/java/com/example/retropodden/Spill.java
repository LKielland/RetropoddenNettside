package com.example.retropodden;

public class Spill {
    String tittel;
    String tekst;

    public Spill(String tittel, String tekst) {
        this.tittel = tittel;
        this.tekst = tekst;
    }

    public String getTittel() {return tittel;}
    public void setTittel(String tittel) {this.tittel = tittel;}
    public String getTekst() {return tekst;}
    public void setTekst(String tekst) {this.tekst = tekst;}


}
