import { CovoiturageService } from 'src/app/services/covoiturage.service';
import { Covoiturage } from '../models/covoiturage';
//import { CovoiturageService, covoiturageService } from './../services/covoiturage.service';
import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-dashboard-reservation',
  templateUrl: './dashboard-reservation.component.html',
  styleUrls: ['./dashboard-reservation.component.css']
})
export class DashboardReservationComponent implements OnInit, OnDestroy {

  constructor(private covoiturageService: CovoiturageService){}

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
  }

  ngOnDestroy(): void {
    if (this.covoiturageSubscription) {
        this.covoiturageSubscription.unsubscribe();
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


}

