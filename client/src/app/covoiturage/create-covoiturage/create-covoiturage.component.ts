import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CovoiturageService } from 'src/app/services/covoiturage.service';

@Component({
  selector: 'app-create-covoiturage',
  templateUrl: './create-covoiturage.component.html',
  styleUrls: ['./create-covoiturage.component.css']
})
export class CreateCovoiturageComponent implements OnInit {

title = 'Créer un covoiturage';

  constructor(private fb: FormBuilder, private covoitService: CovoiturageService) { }

  createForm!: FormGroup;
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

}
