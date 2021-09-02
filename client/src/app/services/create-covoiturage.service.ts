import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CreateCovoiturage } from '../models/create-covoiturage';
import { RessourceService } from './ressource.service';

@Injectable({
  providedIn: 'root'
})
export class CreateCovoiturageService extends RessourceService<CreateCovoiturage> {

  endPoint(): string {
    return 'annonce_covoiturage';
  }

  constructor(http: HttpClient) { 
    super(http)
  }
}
