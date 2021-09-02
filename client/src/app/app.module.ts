import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { DashboardReservationComponent } from './dashboard-reservation/dashboard-reservation.component';
import { CovoituragesComponent } from './covoiturage/covoiturages/covoiturages.component';
import { CovoiturageDetailComponent } from './covoiturage/covoiturages/covoiturage-detail/covoiturage-detail.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CreateCovoiturageComponent } from './covoiturage/create-covoiturage/create-covoiturage.component';
import { VehiculesComponent } from './vehiculeSociete/vehicules/vehicules/vehicules.component';
import { VehiculeDetailComponent } from './vehiculeSociete/vehicule-detail/vehicule-detail.component';
import { CollaborateurComponent } from './collaborateur/collaborateur.component';
import { CollaborateurListComponent } from './collaborateur-list/collaborateur-list.component';
import { AppRoutingModule } from './app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardReservationComponent,
    CovoituragesComponent,
    CovoiturageDetailComponent,
    CreateCovoiturageComponent,
    VehiculesComponent,
    VehiculeDetailComponent,
    CollaborateurComponent,
    CollaborateurListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]

})
export class AppModule { }
