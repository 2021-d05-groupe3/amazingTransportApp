import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { FormControl, FormGroup } from '@angular/forms'
import { ReactiveFormsModule } from '@angular/forms';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],


  template: `<button (click)="compare()">Login</button> {{clickMessage}}`
})

export class AppComponent implements OnInit {
  title = 'Angular Example';
  products: any = [];

  email = new FormControl();
  password = new FormControl();

  constructor(private httpClient: HttpClient){}
  ngOnInit(){
    this.httpClient.get("assets/users.json").subscribe(users =>{console.log(users); //CONSOLE LOG TO REMOVE, FOR TEST PURPOSE ONLY
      this.products = users;
    })
  }
  onClick(){
    this.ngOnInit;
    console.log(this.email);
  }


}

