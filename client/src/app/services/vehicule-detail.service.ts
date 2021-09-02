import { VehiculeDetail } from './../models/vehicule-detail';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RessourceService } from './ressource.service';


@Injectable({
  providedIn: 'root'
})
export class VehiculeDetailService  extends RessourceService<VehiculeDetail>{

  endPoint(): string {
    return 'vehicule-detail'
  }

  constructor(http: HttpClient) {
    super(http)
   }
}
