import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Router} from '@angular/router';


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
  isValid:boolean = false;  //True = Move to next page | Only true if iMail == jPass
  ;

  constructor(private httpClient: HttpClient, private router : Router){}
  ngOnInit(){
    this.httpClient.get("assets/users.json").subscribe(users =>{console.log("Database accessed"); //Accesses the json database | console.log(users); to display the json DB
      this.products = users; //products stores the json database
    })
  }


  onClick(){ //When the button is clicked
    var val = (document.getElementById('lemail')as HTMLInputElement).value; //Receives input from the HTML email field

    for(this.i=0; this.i< this.products.length; this.i++) //For each user in database
      if (this.products[this.i].email == val) //If input email matches a user's email in databse
      {
        this.iMail = this.i;
        console.log("True"); //for test purpose
      }
      else{
      }

    var val2 = (document.getElementById('lepass')as HTMLInputElement).value; //Receives input from the HTML password field

    for(this.j=0; this.j< this.products.length; this.j++) //For each user in database
      if (this.products[this.j].password == val2) //If input password matches a user's password in databse
      {
        this.jPass = this.j;
        console.log("True");  //for test purpose
      }
      else{
      }

      //console.log(this.iMail); console.log(this.jPass);  //Check if iMail & jPass are affected

      if (this.iMail == this.jPass){this.isValid = true; //If the email & the password both match the same user
      console.log("Succés. Vous êtes un utilisateur classé: " + this.products[this.jPass].class);  //Success + displays user's class | this.products[this.jPass].class = to catch user's class
      this.router.navigateByUrl("/vide");
    }

      else{console.log("Le mot de passe ne correspond pas à l'email.");} //If the email & the password don't match the same user
  }
}

