import { Covoiturage } from '../models/covoiturage';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RessourceService } from './ressource.service';

@Injectable({
  providedIn: 'root'
})
export class CovoiturageService extends RessourceService<Covoiturage> {


  constructor( http: HttpClient) {
    super(http, 'covoiturage')
   }

}
