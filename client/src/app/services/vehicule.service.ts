import { HttpClient } from '@angular/common/http';
import { Vehicule } from '../models/vehicule';

import { Injectable } from '@angular/core';

import { RessourceService } from './ressource.service';

@Injectable({
  providedIn: 'root'
})
export class VehiculeService extends RessourceService<Vehicule> {

  constructor(http: HttpClient) {
    super(http, 'vehicule')
   }
}
