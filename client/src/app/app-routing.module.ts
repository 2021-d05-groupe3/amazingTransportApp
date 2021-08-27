import { CovoituragesComponent } from './covoiturage/covoiturages/covoiturages.component';
import { CovoiturageDetailComponent } from './covoiturage/covoiturages/covoiturage-detail/covoiturage-detail.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardReservationComponent } from './dashboard-reservation/dashboard-reservation.component';
import { CollaborateurListComponent } from './collaborateur-list/collaborateur-list.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full'},
  { path: 'covoiturages', component: CovoituragesComponent},
  { path: 'dashboard', component: DashboardReservationComponent},
  { path: 'detail/:id', component: CovoiturageDetailComponent},
  { path: 'dashboardcollabs', component: CollaborateurListComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
