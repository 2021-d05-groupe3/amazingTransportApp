import { Vehicule } from './vehicule';
import { Time } from '@angular/common';
import { Ressource } from './ressource';

export interface Covoiturages extends Ressource {
  id: number;
  startDate: Date ;
  startHour: Time;
  finishDate: Date;
  vehicleType: Vehicule;
  name: string;
}
