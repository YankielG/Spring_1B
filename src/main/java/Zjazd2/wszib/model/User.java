package Zjazd2.wszib.model;


import java.util.List;

public class User {

    private String name;
    private String nazwisko;
    private String wiek;

    private List<String> uprawnienia;
    private User zona;


    public String getName() {
        return name;
    }

    public List<String> getUprawnienia() {
        return uprawnienia;
    }

    public void setUprawnienia(List<String> uprawnienia) {
        this.uprawnienia = uprawnienia;
    }

    public User getZona() {
        return zona;
    }

    public void setZona(User zona) {
        this.zona = zona;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getWiek() {
        return wiek;
    }

    public void setWiek(String wiek) {
        this.wiek = wiek;
    }
}
