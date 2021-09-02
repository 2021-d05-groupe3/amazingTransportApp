import { Covoiturage } from '../models/covoiturage';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RessourceService } from './ressource.service';

@Injectable({
  providedIn: 'root'
})
export class CovoiturageService extends RessourceService<Covoiturage> {
  endPoint(): string {
    return 'reservationCovoits';
  }


  constructor( http: HttpClient) {
    super(http)
   }

  

}
