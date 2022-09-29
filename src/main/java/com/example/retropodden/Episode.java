package com.example.retropodden;

public class Episode {
    int nummer;
    String tittel;
    String beskrivelse;
    String dato;
    String url;

    public Episode(int nummer, String tittel, String beskrivelse, String dato, String url) {
        this.nummer = nummer;
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.url = url;
    }

    public Episode() {}

    public int getNummer() {return nummer;}
    public void setNummer(int nummer) {this.nummer = nummer;}
    public String getTittel() {return tittel;}
    public void setTittel(String tittel) {this.tittel = tittel;}
    public String getBeskrivelse() {return beskrivelse;}
    public void setBeskrivelse(String beskrivelse) {this.beskrivelse = beskrivelse;}
    public String getDato() {return dato;}
    public void setDato(String dato) {this.dato = dato;}
    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}


    @Override
    public String toString() {
        return "Episode {" +
                "nummer= " + nummer + '\n' +
                "tittel= '" + tittel + "'\n" +
                ", beskrivelse= '" + beskrivelse + "'\n" +
                ", dato= '" + dato + "'\n" +
                ", url= '" + url + "'\n" +
                '}';
    }

}
