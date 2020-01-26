package Zjazd2.wszib.model;


import java.util.ArrayList;
import java.util.List;

public class User {
    private String imie;
    private String nazwisko;
    private int wiek;
    private List<String> uprawnienia;


    public User(String name, String nazwisko, int wiek) {
        this.imie = name;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.uprawnienia = new ArrayList<>();
    }

    public String getImie() {
        return imie;
    }

    public List<String> getUprawnienia() {
        return uprawnienia;
    }

    public void addUprawnienie(String uprawnienienie) {
        this.uprawnienia.add(uprawnienienie);
    }

    public void removeUprawnienie(String uprawnienienie) {
        this.uprawnienia.remove(uprawnienienie);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
