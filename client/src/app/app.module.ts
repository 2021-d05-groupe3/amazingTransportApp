

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardReservationComponent } from './dashboard-reservation/dashboard-reservation.component';
import { CovoituragesComponent } from './covoiturage/covoiturages/covoiturages.component';
import { CovoiturageDetailComponent } from './covoiturage/covoiturages/covoiturage-detail/covoiturage-detail.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CreateCovoiturageComponent } from './covoiturage/create-covoiturage/create-covoiturage.component';
import { VehiculesComponent } from './vehiculeSociete/vehicules/vehicules/vehicules.component';
import { VehiculeDetailComponent } from './vehiculeSociete/vehicule-detail/vehicule-detail.component';



@NgModule({
  declarations: [
    AppComponent,
    DashboardReservationComponent,
    CovoituragesComponent,
    CovoiturageDetailComponent,
    CreateCovoiturageComponent,
    VehiculesComponent,
    VehiculeDetailComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
