import { VehiculeDetail } from './../../models/vehicule-detail';
import { VehiculeDetailService } from './../../services/vehicule-detail.service';
import { Subscription } from 'rxjs';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { Component, OnInit, OnDestroy, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-vehicule-detail',
  templateUrl: './vehicule-detail.component.html',
  styleUrls: ['./vehicule-detail.component.css']
})
export class VehiculeDetailComponent implements OnInit {


  title = 'Réserver mon véhicule de Société';

  createForm!: FormGroup;
  private vehiculeDetailSubscription? : Subscription;

  constructor(private fb: FormBuilder, private VehiculeDetailService: VehiculeDetailService) { }

  ngOnInit(): void {
    this.createForm = this.fb.group(
      {
        startDate: ['', Validators.required],
        startHour: ['', Validators.required],
        finishDate: ['', Validators.required],
        name: ['', Validators.required]
    })
  }
  @Output() newVehiculeDetail = new EventEmitter<VehiculeDetail>();


 // ngOnDestroy(): void {
   // if (this.createvehiculeDetailSubscription) {
      //  this.createvehiculeDetailSubscription.unsubscribe();
   // }
  //}
}
