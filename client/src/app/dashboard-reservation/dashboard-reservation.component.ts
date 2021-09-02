import { Vehicule } from './../models/vehicule';
import { VehiculeService } from './../services/vehicule.service';
import { CovoiturageService } from 'src/app/services/covoiturage.service';
import { Covoiturage } from '../models/covoiturage';
import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';


@Component({
  selector: 'app-dashboard-reservation',
  templateUrl: './dashboard-reservation.component.html',
  styleUrls: ['./dashboard-reservation.component.css']
})
export class DashboardReservationComponent implements OnInit, OnDestroy {


  constructor(
    private covoiturageService: CovoiturageService
  ) { }

  covoiturages: any = [];
  trajetSociete: any = [];

  ngOnInit(): void {

    this.loadReservationCovoiturage()

   // this.loadReservationSociete()

  }

  ngOnDestroy(): void {

  }

  //Get list covoiturage
  
  loadReservationCovoiturage() {
    return this.covoiturageService.get().subscribe((data: {}) => {
      this.covoiturages = data;
    })
  }
/*
  loadReservationSociete() {
    return this.vehiculeSociete.get().subscribe((data: {}) => {
      this.trajetSociete = data;
    })
  }
*/

}


/**


  constructor(private covoiturageService: CovoiturageService, private vehiculeService: VehiculeService){}
  covoiturages! : Covoiturage[];
  vehicules! : Vehicule[];

  @Input() id?: string;
  @Input() covoiturage?: Covoiturage;
  @Input() vehicule?: Vehicule;


  private covoiturageSubscription?: Subscription; vehiculeSubscription?: Subscription;
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

          if (!this.vehicule) {
              if (this.id) {
                  //on va le chercher via notre service grâce à son id
                  this.vehiculeSubscription = this.vehiculeService
                      .getById(this.id)
                      .subscribe((vehicule) => {
                          this.vehicule = vehicule;
                      });
              }
          }


  }


  ngOnDestroy(): void {
    if (this.covoiturageSubscription) {
        this.covoiturageSubscription.unsubscribe();
    }
    if (this.vehiculeSubscription) {
      this.vehiculeSubscription.unsubscribe();
  }
}



//on prépare un tableau liant un covoiturage et un mode d'édition
/**public covoiturage: { covoiturage:Covoiturage; editMode: boolean }[] = [];
public covoituragesResults: { covoiturage: Covoiturage; editMode: boolean }[] = [];
public createMode: boolean = false;


public covoiturageSearchControlSub?: Subscription;
public covoiturageSearchControl: FormControl = new FormControl(['']);

private covoiturageSubscription?: Subscription;
    ngOnInit(): void {
        this.covoiturageSubscription = this.covoiturageService
            .get()
            .subscribe((covoiturages: Covoiturage[]) => {
                this.covoiturages = covoiturages.map((covoiturage) => {
                    return { covoiturage: covoiturage, editMode: false };
                });
                this.covoituragesResults = Array.from(this.covoiturages);
            });

**/
/**covoiturages! : Covoiturage[];

  constructor(private covoiturageService : CovoiturageService) { }

  ngOnInit(): void {
    this.getCovoiturages();
  }

getCovoiturages(): void {
  this.covoiturageService.getCovoiturages().subscribe( (data) => this.covoiturages = data)
}**/


