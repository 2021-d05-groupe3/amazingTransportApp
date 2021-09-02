import { HttpClient, HttpClientModule, HttpErrorResponse } from '@angular/common/http';
import { Ressource } from '../models/ressource';

import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

export abstract class RessourceService<T> {

    private readonly url = 'http://localhost:8080/' + this.endPoint();

    constructor(private http: HttpClient) { }

    abstract endPoint(): string; 

    public get(): Observable<T[]> {
        return this.http.get<T[]>(`${this.url}`)
        .pipe(
            catchError(this.errorCatcher)
        );
    }

    public getById(id: number | string): Observable<T> {
        return this.http.get<T>(`${this.url}/${id}`)
        .pipe(
            catchError(this.errorCatcher)
        );
    }

    public add(toAdd: T): Observable<T> {
        return this.http.post<T>(`${this.url}`, toAdd)
        .pipe(
            catchError(this.errorCatcher)
        );
    }

    private errorCatcher(error: HttpErrorResponse) {
        return throwError("These aren't the droids you're looking for.")
    };
    
/*
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
*/
}
