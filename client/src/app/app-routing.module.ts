import { PagevideComponent } from './pagevide/pagevide.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { CreateCovoiturageComponent } from './covoiturage/create-covoiturage/create-covoiturage.component';
import { CovoituragesComponent } from './covoiturage/covoiturages/covoiturages.component';
import { CovoiturageDetailComponent } from './covoiturage/covoiturages/covoiturage-detail/covoiturage-detail.component';
import { RouterModule, Routes, CanLoad } from '@angular/router';
import { DashboardReservationComponent } from './dashboard-reservation/dashboard-reservation.component';
import { VehiculesComponent } from './vehiculeSociete/vehicules/vehicules/vehicules.component';
import { CollaborateurListComponent } from './collaborateur-list/collaborateur-list.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full'},
  { path: 'covoiturages', component: CovoituragesComponent},
  { path: 'dashboard', component: DashboardReservationComponent},
  { path: 'detail/:id', component: CovoiturageDetailComponent},
  { path: 'create-covoiturage', component: CreateCovoiturageComponent},
  { path: 'vehicules', component:VehiculesComponent},
  { path: 'dashboardcollabs', component: CollaborateurListComponent},
  { path: 'login', component: LoginComponent}, //default page
  { path: 'vide', component: PagevideComponent} //vide is for test purposes
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
