import { Router } from '@angular/router';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor(private router : Router) { }

  isLogged:boolean = false; //False by default, changes to True when logging in
  name:string = "0";  //Name
  mail:string = "0";  //Email
  type:string = "0";  //User, Driver, or Admin


  loggedUser(){ //Function to display data about the user (name, mail & type)
    console.log("Name: " + this.name + " | Mail: " + this.mail + " | Type: " + this.type + "| Logged=" + this.isLogged);
  }
  logoutUser(){ //Function to logout: Resets values to "0" and route to login page
    this.isLogged = false;
    this.mail = "0";
    this.name = "0";
    this.type = "0";
    this.router.navigateByUrl("/login");
  }
  loadIfLogged(){ //Verify if the user is logged in before giving him access to next page
    if (this.isLogged==true){}
    else{
      const currentRoute = this.router.routerState;
      this.router.navigateByUrl(currentRoute.snapshot.url, { skipLocationChange: true })
      this.logoutUser();
    }
  }
}
