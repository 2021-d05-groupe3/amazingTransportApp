import { Vehicule } from './../../../models/vehicule';
import { VehiculeService } from './../../../services/vehicule.service';
import { Subscription } from 'rxjs';
import { Component, OnInit, OnDestroy, Input } from '@angular/core';

@Component({
  selector: 'app-vehicules',
  templateUrl: './vehicules.component.html',
  styleUrls: ['./vehicules.component.css']
})
export class VehiculesComponent implements OnInit{



  constructor(private VehiculeService: VehiculeService){}
  vehicules! : Vehicule[];
  @Input() id?: string;
  @Input() Vehicule? : Vehicule;



  private vehiculeSubscription?: Subscription;
  ngOnInit(): void {

    if (!this.vehicules) {
      if (this.id) {
          //on va le chercher via notre service grâce à son id
          this.vehiculeSubscription = this.VehiculeService
              .getById(this.id)
              .subscribe((vehicule) => {
                  this.Vehicule = vehicule;
              });
      }
  }

  }


 // ngOnDestroy(): void {
   // if (this.covoiturageSubscription) {
      //  this.covoiturageSubscription.unsubscribe();
   // }

//}

}
