package com.example.disturbingparadox.reservationVehiculeEntreprise;

import java.util.List;
import java.util.Optional;

import com.example.disturbingparadox.collaborateur.Collaborateur;
import com.example.disturbingparadox.collaborateur.CollaborateurRepository;
import com.example.disturbingparadox.vehiculeSociete.VehiculeSociete;
import com.example.disturbingparadox.vehiculeSociete.VehiculeSocieteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReservationVehiculeEntrepriseService {
    @Autowired
    ReservationVehiculeEntrepriseRepository reservationVehiculeEntrepriseRepository;
    @Autowired
    CollaborateurRepository collaborateurRepository;
    @Autowired
    VehiculeSocieteRepository vehiculeSocieteRepository;

    public List<ReservationVehiculeEntreprise> getReservationVehiculeEntreprises(){
		return reservationVehiculeEntrepriseRepository.findAll();
	}



    public ReservationVehiculeEntreprise addReservationVehiculeEntreprise(ReservationVehiculeEntrepriseDto nouvelleReservationVehiculeEntreprise) {
        ReservationVehiculeEntreprise reservationVehiculeEntreprise = new ReservationVehiculeEntreprise();
        reservationVehiculeEntreprise.setDateDeparture(nouvelleReservationVehiculeEntreprise.getDateDeparture());
        reservationVehiculeEntreprise.setDateArrival(nouvelleReservationVehiculeEntreprise.getDateArrival());
        reservationVehiculeEntreprise.setHasDriver(nouvelleReservationVehiculeEntreprise.isHasDriver());

        Optional<Collaborateur> oCollaborateur = collaborateurRepository.findById(nouvelleReservationVehiculeEntreprise.getIdCollaborateur());
        if(oCollaborateur.isPresent()){
            reservationVehiculeEntreprise.setCollaborateur(oCollaborateur.get());
        }

        Optional<VehiculeSociete> oVehiculeSociete = vehiculeSocieteRepository.findById(nouvelleReservationVehiculeEntreprise.getIdVehiculeSociete());
        if(oVehiculeSociete.isPresent()){
            reservationVehiculeEntreprise.setVehiculeSociete(oVehiculeSociete.get());
        }

        
        
          return reservationVehiculeEntrepriseRepository.save(reservationVehiculeEntreprise);
      }
}
