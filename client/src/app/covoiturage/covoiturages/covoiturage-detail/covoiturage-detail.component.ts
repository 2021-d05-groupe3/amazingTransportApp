import { CovoiturageService } from './../../../services/covoiturage.service';
import { Covoiturage } from '../../../models/covoiturage';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-covoiturage-detail',
  templateUrl: './covoiturage-detail.component.html',
  styleUrls: ['./covoiturage-detail.component.css']
})
export class CovoiturageDetailComponent implements OnInit {

  id!: number;
  covoiturage!: Covoiturage;

  constructor(private route : ActivatedRoute, private covoiturageService : CovoiturageService) { }

  ngOnInit(): void {
    //this.id = +!this.route.snapshot.paramMap.get('id');
    //on va chercher le covoit dont l'id correspond à l'id récupéré

  }


}
