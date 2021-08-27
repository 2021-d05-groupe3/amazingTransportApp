import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Collab } from './collab';

@Injectable({
  providedIn: 'root'
})

export class RestApiService {
  
  // Define API
  API_URL = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:4200'
    })
  }  

  // HttpClient API get() method => Fetch Collabs list
  getCollabs(): Observable<Collab[]> {
    return this.http.get<Collab[]>(this.API_URL + '/afficherCollaborateur')
    
  }

  // HttpClient API get() method => Fetch Collab

  // HttpClient API post() method => Create Collab  

  // HttpClient API put() method => Update Collab
  

}
