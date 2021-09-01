import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Collab } from './collab';
import { RessourceService } from '../services/ressource.service';

@Injectable({
  providedIn: 'root'
})

export class RestApiService extends RessourceService<Collab>{
  endPoint(): string {
    return 'afficherCollaborateur';
  }
  
  // Define API
 /* API_URL = 'http://localhost:8080';*/

  constructor(http: HttpClient) {
    super(http)
   }

  // Http Options
/*
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:4200'
    })
  }  
*/
  // HttpClient API get() method => Fetch Collabs list

  



/*  
  getCollabs(): Observable<Collab> {
    return this.http.get<Collab>(this.API_URL + '/afficherCollaborateur')
    
  }
*/
  // HttpClient API get() method => Fetch Collab
/*
  getCollab(name: string): Observable<Collab> {
    return this.http.get<Collab>(this.API_URL + '/collaborateur/' + name)
  }
*/
  // HttpClient API post() method => Create Collab  
/*
  addCollab(collab: Collab): Observable<Collab> {
    return this.http.post<Collab>(this.API_URL + '/ajouterCollaborateur', JSON.stringify(collab), this.httpOptions)
  }
*/
  // HttpClient API put() method => Update Collab

  // HttpClient API delete() method => Delete Collab
  

}
