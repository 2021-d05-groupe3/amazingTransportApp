import { Router } from '@angular/router';
import { LoggerService } from './logger.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  title = 'Client Amazing Transport';

  constructor(private log : LoggerService) { }

  onClick(){ //Verify if the user is logged in before giving him access to next page
      this.log.loadIfLogged();
    }

  onClick2(){ //Logout user
      this.log.logoutUser();
    }

  }
