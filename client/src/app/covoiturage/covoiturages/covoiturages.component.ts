import { CovoiturageService } from './../../services/covoiturage.service';
import { Covoiturage } from '../../models/covoiturage';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-covoiturages',
  templateUrl: './covoiturages.component.html',
  styleUrls: ['./covoiturages.component.css']
})
export class CovoituragesComponent implements OnInit {

  covoiturages!: Covoiturage[];

  constructor(private covoiturageService: CovoiturageService) { }

  ngOnInit(): void {
    this.getCovoiturages();
  }
getCovoiturages(): void{
  this.covoiturageService.getCovoiturages().subscribe((data) => this.covoiturages = data);
}
addCovoiturage(covoit: Covoiturage): void {

  if (!covoit) {
    return;
  }
  this.covoiturageService.createCovoiturage(covoit).subscribe(
    covoiturage => this.covoiturages.push( covoiturage) //lorsque le covoit est créé il nous revient, on l'ajoute a la liste pour mise à jour
  );
}



}
