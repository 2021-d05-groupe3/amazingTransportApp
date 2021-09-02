import { Vehicule } from './../../../models/vehicule';
import { VehiculeService } from './../../../services/vehicule.service';
import { Subscription } from 'rxjs';
import { Component, OnInit, OnDestroy, Input } from '@angular/core';

@Component({
  selector: 'ngbd-carousel-basic',
  templateUrl: './vehicules.component.html',
  styleUrls: ['./vehicules.component.css']
})
export class VehiculesComponent implements OnInit {

  images = [1071, 111, 133, 364].map((n) => `https://picsum.photos/id/${n}/900/500`);

  vehicule: any = [];




  constructor(private VehiculeService: VehiculeService){}
  vehicules! : Vehicule[];

  ngOnInit(): void {
    
    this.loadVehicule()

  }

  loadVehicule() {
    return this.VehiculeService.get().subscribe((data: {}) => {
      this.vehicule = data;
    })
  }
  
  
}



 // ngOnDestroy(): void {
   // if (this.covoiturageSubscription) {
      //  this.covoiturageSubscription.unsubscribe();
   // }

//}

/*

        =========== 
          old subscription
        ===========

private vehiculeSubscribtion?: Subscription;
  @Input() id?: string;


        =======================
              OLD ngOnInit
        =======================

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
     }
*/
 