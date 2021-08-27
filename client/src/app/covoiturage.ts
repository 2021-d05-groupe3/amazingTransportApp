//interface pour organiser les donnée de mon covoiturage
import { Time } from "@angular/common";
import { Vehicule } from "./vehicule";

export interface Covoiturage {
  id: number;
  startDate: Date ;
  startHour: Time;
  startAdress: string;
  finishAdress: number;
  passengersNumber:number;
  vehicleType: Vehicule;
  organizer: string;
}
