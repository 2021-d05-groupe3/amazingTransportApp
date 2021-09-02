import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { CovoiturageService } from './../../services/covoiturage.service';
import { Covoiturage } from '../../models/covoiturage';
import { Component, OnInit, OnDestroy, Input } from '@angular/core';

@Component({
  selector: 'app-covoiturages',
  templateUrl: './covoiturages.component.html',
  styleUrls: ['./covoiturages.component.css']
})
export class CovoituragesComponent implements OnInit, OnDestroy{

  title = 'Réserver mon covoiturage';

  createForm!: FormGroup;


  private vehiculeDetailSubscription? : Subscription;
  constructor(private fb: FormBuilder, private covoiturageService: CovoiturageService){}

  covoiturages! : Covoiturage[];
  @Input() id?: string;
  @Input() covoiturage?: Covoiturage;


  private covoiturageSubscription?: Subscription;
  ngOnInit(): void {
      //si on a pas reçu l'objet en entier
      if (!this.covoiturage) {
          if (this.id) {
              //on va le chercher via notre service grâce à son id
              this.covoiturageSubscription = this.covoiturageService
                  .getById(this.id)
                  .subscribe((covoiturage) => {
                      this.covoiturage = covoiturage;
                  });
          }
      }
      this.createForm = this.fb.group(
        {
          startDate: ['', Validators.required],

          finishDate: ['', Validators.required],
          organizer: ['', Validators.required]
      })
  }


  ngOnDestroy(): void {
    if (this.covoiturageSubscription) {
        this.covoiturageSubscription.unsubscribe();
    }

}}
