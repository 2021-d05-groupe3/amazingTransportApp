
import { VehiculeService } from './../../../services/vehicule.service';
import { Subscription } from 'rxjs';
import { Component, OnInit, OnDestroy, Input } from '@angular/core';

@Component({
  selector: 'ngbd-carousel-basic',
  templateUrl: './vehicules.component.html',
  styleUrls: ['./vehicules.component.css']
})
export class VehiculesComponent implements OnInit{

  images = [1071, 111, 133, 364].map((n) => `https://picsum.photos/id/${n}/900/500`);


  constructor(private VehiculeService: VehiculeService) { }

  private vehiculeSubscribtion?: Subscription;
  @Input() id?: string;

  ngOnInit(): void {
   /** if (!this.vehicule) {
      if (this.id) {
          //on va le chercher via notre service grâce à son id
          this.vehiculeSubscribtion = this.VehiculeService
              .getById(this.id)
              .subscribe((vehicule) => {
                  this.vehicule = vehicule;
              });
      }
  }

  }


  ngOnDestroy(): void {
    if (this.vehiculeSubscription) {
        this.vehiculeSubscription.unsubscribe();
    }*/

}
}
