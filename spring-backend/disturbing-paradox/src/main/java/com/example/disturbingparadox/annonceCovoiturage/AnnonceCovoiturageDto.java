package com.example.disturbingparadox.annonceCovoiturage;

import java.time.LocalDateTime;

public class AnnonceCovoiturageDto {
    int nbrDePlaceRestante;
    LocalDateTime dateHDepart;
    String adresseDepart;
    String adresseArrivée;


    public AnnonceCovoiturageDto() {
    }


    public int getNbrDePlaceRestante() {
        return nbrDePlaceRestante;
    }


    public void setNbrDePlaceRestante(int nbrDePlaceRestante) {
        this.nbrDePlaceRestante = nbrDePlaceRestante;
    }


    public LocalDateTime getDateHDepart() {
        return dateHDepart;
    }


    public void setDateHDepart(LocalDateTime dateHDepart) {
        this.dateHDepart = dateHDepart;
    }


    public String getAdresseDepart() {
        return adresseDepart;
    }


    public void setAdresseDepart(String adresseDepart) {
        this.adresseDepart = adresseDepart;
    }


    public String getAdresseArrivée() {
        return adresseArrivée;
    }


    public void setAdresseArrivée(String adresseArrivée) {
        this.adresseArrivée = adresseArrivée;
    }


    @Override
    public String toString() {
        return "AnnonceCovoiturageDto [adresseArrivée=" + adresseArrivée + ", adresseDepart=" + adresseDepart
                + ", dateHDepart=" + dateHDepart + ", nbrDePlaceRestante=" + nbrDePlaceRestante + "]";
    }

    

    
    
}
