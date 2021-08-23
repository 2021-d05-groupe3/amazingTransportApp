import { Covoiturage } from './../covoiturage';
import { CovoiturageService } from './../services/covoiturage.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard-reservation',
  templateUrl: './dashboard-reservation.component.html',
  styleUrls: ['./dashboard-reservation.component.css']
})
export class DashboardReservationComponent implements OnInit {

covoiturages! : Covoiturage[];

  constructor(private covoiturageService : CovoiturageService) { }

  ngOnInit(): void {
    this.getCovoiturages();
  }

getCovoiturages(): void {
  this.covoiturageService.getCovoiturages().subscribe( (data) => this.covoiturages = data)
}
}
