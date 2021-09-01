import { Time } from '@angular/common';
import { Vehicule } from './vehicule';
import { Ressource } from './ressource';
export interface VehiculeDetail extends Ressource {
  id: number;
  startDate: Date ;
  startHour: Time;
  finishDate: Date;
  vehicleType: Vehicule;
  name: string;
}
