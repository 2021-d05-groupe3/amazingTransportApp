import { RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { PagevideComponent } from './pagevide/pagevide.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    PagevideComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule
    //Ajouter ici le module Route
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
