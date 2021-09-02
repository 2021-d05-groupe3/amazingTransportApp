package com.example.disturbingparadox.annonceCovoiturage;

import java.time.LocalDateTime;

public class AnnonceCovoiturageDto {
    int nbrDePlaceRestante;
    LocalDateTime dateHDepart;
    String adresseDepart;
    String adresseArrivee;
    


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


    public String getAdresseArrivee() {
        return adresseArrivee;
    }


    public void setAdresseArrivee(String adresseArrivee) {
        this.adresseArrivee = adresseArrivee;
    }


    @Override
    public String toString() {
        return "AnnonceCovoiturageDto [adresseArrivee=" + adresseArrivee + ", adresseDepart=" + adresseDepart
                + ", dateHDepart=" + dateHDepart + ", nbrDePlaceRestante=" + nbrDePlaceRestante + "]";
    }

    


   


  


   

    

    
    
}
