import { Component, OnInit } from '@angular/core';
import { Collab } from '../shared/collab';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-collaborateur-list',
  templateUrl: './collaborateur-list.component.html',
  styleUrls: ['./collaborateur-list.component.css']
})
export class CollaborateurListComponent implements OnInit {

  Collab: any = [];

  constructor(
    public restApi: RestApiService
  ) { }

  ngOnInit(): void {

    this.loadEmployees()
  }

  // Get employees list
  loadEmployees() {
    return this.restApi.getCollabs().subscribe((data: {}) => {
      this.Collab = data;
    })
  }
}
