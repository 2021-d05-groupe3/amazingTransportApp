//interface pour organiser les donnée de mon covoiturage
import { Time } from "@angular/common";

export interface Covoiturage {
  id: number;
  startDate: Date ;
  startHour: Time;
  startAdress: string;
  finishAdress: number;
  passengersNumber:number;
  vehicleType: string;
  organizer: string;
}
