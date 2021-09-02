package com.example.disturbingparadox.vehiculeSociete;


public class VehiculeSocieteDto  { 
    String immatriculation;
    Long vehiculeMarque;
    Long vehiculeModel;
    String statut;
    Long idCategorie;
    Long idVehicule;
    public VehiculeSocieteDto() {
        
    }

    





    public Long getIdCategorie() {
        return idCategorie;
    }



    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }



    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }



    public String getImmatriculation() {
        return immatriculation;
    }



    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }



    public Long getVehiculeMarque() {
        return vehiculeMarque;
    }



    public void setVehiculeMarque(Long vehiculeMarque) {
        this.vehiculeMarque = vehiculeMarque;
    }



    public Long getVehiculeModel() {
        return vehiculeModel;
    }



    public void setVehiculeModel(Long vehiculeModel) {
        this.vehiculeModel = vehiculeModel;
    }



  
    



    public Long getIdVehicule() {
        return idVehicule;
    }







    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }







    @Override
    public String toString() {
        return "VehiculeSocieteDto [idCategorie=" + idCategorie + ", idVehicule=" + idVehicule + ", immatriculation="
                + immatriculation + ", statut=" + statut + ", vehiculeMarque=" + vehiculeMarque + ", vehiculeModel="
                + vehiculeModel + "]";
    }







  







 












 







  


  


  






 
   

    
    
}
