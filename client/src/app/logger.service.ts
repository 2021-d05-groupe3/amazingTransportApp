import { Router } from '@angular/router';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor(private router : Router) { }

  isLogged:boolean = false;
  name:string = "0";
  mail:string = "0";
  type:string = "0";


  loggedUser(){
    console.log("Name: " + this.name + " | Mail: " + this.mail + " | Type: " + this.type + "| Logged=" + this.isLogged);
  }
  logoutUser(){
    this.isLogged = false;
    this.mail = "0";
    this.name = "0";
    this.type = "0";
    this.router.navigateByUrl("/login");
  }
}
