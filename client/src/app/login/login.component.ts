import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Router} from '@angular/router';
import {LoggerService} from "../logger.service"


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  template: `<button (click)="compare()">Login</button> {{clickMessage}}`
})

export class LoginComponent implements OnInit {
  title = 'Angular Example';
  products: any = [];
  i = 0;  //Increment for mail
  j = 0;  //Increment for password
  iMail = -1; //Stores which user matches the mail
  jPass = -2; //Stores which user matches the password
  //isValid:boolean = false;  //True = Move to next page, only true if iMail == jPass || DEPRICATED, NOW USING LOGGER.SERVICE
  ;

  constructor(private httpClient: HttpClient, private router : Router, private log : LoggerService){}
  ngOnInit(){
    this.httpClient.get("assets/users.json").subscribe(users =>{console.log("Database accessed"); //Accesses the json database | console.log(users); to display the json DB
      this.products = users; //products stores the json database in a table
    })
  }

  onClick(){ //When the login button is clicked

    var val = (document.getElementById('lemail')as HTMLInputElement).value; //Receives input from the HTML email field

    for(this.i=0; this.i< this.products.length; this.i++) //For each user in database
      if (this.products[this.i].email == val) //If input email matches a user's email in databse
      {
        this.iMail = this.i;
        console.log("Email found."); //for test purpose
      }
      else{console.log("-> no result"); //for test purpose
      }

    var val2 = (document.getElementById('lepass')as HTMLInputElement).value; //Receives input from the HTML password field

    for(this.j=0; this.j< this.products.length; this.j++) //For each user in database
      if (this.products[this.j].password == val2) //If input password matches a user's password in database
      {
        this.jPass = this.j;
        console.log("Password found.");  //for test purpose
      }
      else{console.log("-> no result"); //for test purpose
      }

      console.log("Comparing Email with Password...");  //Makes the console easier to understand

      if (this.iMail == this.jPass){  //If the email & the password both match the same user
      //this.isValid = true; // DEPRICATED, NOW USING LOGGER.SERVICE

      //Now we send the user's data to logger.service
      this.log.mail = this.products[this.jPass].email;
      this.log.name = this.products[this.jPass].name;
      this.log.type = this.products[this.jPass].class;
      if (this.log.mail !== "0" && this.log.name !== "0" && this.log.type !=="0") //Security to make sure an user is fully logged in
      {
        this.log.isLogged = true;
        console.log("Succés. Vous êtes un utilisateur classé: " + this.products[this.jPass].class);  //Success + displays user's class
        this.router.navigateByUrl("/dashboard"); //Allows navigation to next page using its URL (/dashboard or /vide for test purposes)
      }
      else {this.log.logoutUser(); console.log("Une erreur s'est produite.")} //Reset data if the user isn't fully logged in
    }

      else{console.log("Le mot de passe ne correspond pas à l'email.");} //If the email & the password don't match the same user

  }
}

