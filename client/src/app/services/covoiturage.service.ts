import { Covoiturage } from './../covoiturage';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CovoiturageService {


  constructor(private http: HttpClient) { }

  getCovoiturages(): Observable<Covoiturage[]>{
    return this.http.get<Covoiturage[]>("Api/coivoiturages")
  }

  getCovoiturage(id: number): Observable<Covoiturage>{
    return this.http.get<Covoiturage>(`api/covoiturages/${id}`);
  }

  updateCovoiturage(hero: Covoiturage): Observable<any>{

    return this.http.put("api/covoiturages", hero);
  }

  createCovoiturage(covoiturage: Covoiturage): Observable<Covoiturage>{

    return this.http.post<Covoiturage>("api/covoiturage", covoiturage);
  }

  deleteCovoiturage(covoiturage: Covoiturage ): Observable<any> {
    return this.http.delete(`api/covoiturages/${covoiturage.id}`);
  }



}
