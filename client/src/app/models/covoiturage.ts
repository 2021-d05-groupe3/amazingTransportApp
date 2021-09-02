import { Ressource } from './ressource';
//interface pour organiser les donnée de mon covoiturage
import { Time } from "@angular/common";
import { Vehicule } from "./vehicule";
import { Collab } from '../shared/collab';

export interface Covoiturage extends Ressource {

  id: number;
  dateDeparture: Date ;
  dateArrival: Date;
  annonceCovoiturage: any;
  collaborateur: Collab;


  /**
   * 
   * ================================
   * Removed for testing purpose
   * ================================
   * 
   * startAdress: string;
   * finishAdress: string;
   * passengersNumber:number;
   * vehicleType: Vehicule;
   * organizer: string;  
   * 
   *  
  
  */
}
