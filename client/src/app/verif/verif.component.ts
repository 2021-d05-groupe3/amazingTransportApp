import { LoginComponent } from './../login/login.component';
import { Injectable }       from '@angular/core';
import { CanLoad, Route, Router } from '@angular/router';

@Injectable()
export class VerifComponent implements CanLoad {

  constructor(private router: Router) {
  }

  canLoad(route: Route): boolean {
    return false;
  }
}
