import { Subscription } from 'rxjs';
import { Covoiturage } from '../../models/covoiturage';
import { Component, EventEmitter, OnInit, Output, OnDestroy } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CovoiturageService } from 'src/app/services/covoiturage.service';

@Component({
  selector: 'app-create-covoiturage',
  templateUrl: './create-covoiturage.component.html',
  styleUrls: ['./create-covoiturage.component.css']
})
export class CreateCovoiturageComponent implements OnInit, OnDestroy  {

  title = 'Créer une annonce de covoiturage';

  createForm!: FormGroup;

  private createcovoiturageSubscription?: Subscription;

  ngOnInit(): void {
    this.createForm = this.fb.group(
      {
        startDate: ['', Validators.required],
        startHour: ['', Validators.required],
        startAdress: ['', Validators.required],
        finishAdress: ['', Validators.required],
        passengerNumber: ['', Validators.required],
        vehicleType: ['', Validators.required],
        organizer: ['', Validators.required]
    })
  }
  @Output() newCovoiturage = new EventEmitter<Covoiturage>();

  constructor(private fb: FormBuilder, private covoiturageService: CovoiturageService) { }

  ngOnDestroy(): void {
    if (this.createcovoiturageSubscription) {
        this.createcovoiturageSubscription.unsubscribe();
    }
  }

}
