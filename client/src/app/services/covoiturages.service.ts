import { Covoiturages } from './../models/covoiturages';
import { Ressource } from './../models/ressource';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RessourceService } from './ressource.service';

@Injectable({
  providedIn: 'root'
})
export class CovoituragesService extends RessourceService<Covoiturages>{

  constructor(http: HttpClient) {
    super( http, 'covoiturages' )
   }
}
