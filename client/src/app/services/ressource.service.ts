import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Ressource } from '../models/ressource';

import { Observable } from 'rxjs';
import { environment } from './../../environments/environment';

export abstract class RessourceService<T extends Ressource> {

  private url: string = `${environment.api.url}:${environment.api.port}`;

  constructor(private http: HttpClient, private endPoint: string) { }

  public get(): Observable<T[]> {
    return this.http.get<T[]>(`${this.url}/${this.endPoint}`);
}

public getById(id: string): Observable<T> {
    return this.http.get<T>(`${this.url}/${this.endPoint}/${id}`);
}

public add(toAdd: T): Observable<T> {
    return this.http.post<T>(`${this.url}/${this.endPoint}`, toAdd);
}

public delete(toDelete: T): Observable<any> {
    return this.http.delete<any>(
        `${this.url}/${this.endPoint}/${toDelete._id}`
    );
}

public edit(toEdit: T): Observable<T> {
    return this.http.put<T>(
        `${this.url}/${this.endPoint}/${toEdit._id}`,
        toEdit
    );
}

}
