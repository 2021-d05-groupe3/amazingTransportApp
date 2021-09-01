package com.example.disturbingparadox.vehicule;

public class VehiculeDto {
    String immatriculation;
    Long idMarque;
    Long idModel;
    Long idCategorie;

    public VehiculeDto() {
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    

    public Long getIdMarque() {
        return idMarque;
    }

    

    public Long getIdModel() {
        return idModel;
    }

  

    public Long getIdCategorie() {
        return idCategorie;
    }

    

    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public void setIdModel(Long idModel) {
        this.idModel = idModel;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public String toString() {
        return "VehiculeDto [idCategorie=" + idCategorie + ", idMarque=" + idMarque + ", idModel=" + idModel
                + ", immatriculation=" + immatriculation + "]";
    }

  

    

    
}
