import { Component, OnInit } from '@angular/core';
import { Collab } from '../shared/collab';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-collaborateur-list',
  templateUrl: './collaborateur-list.component.html',
  styleUrls: ['./collaborateur-list.component.css']
})
export class CollaborateurListComponent implements OnInit {

  collabTable: any = [];

  constructor(
    public restApi: RestApiService
  ) { }

  ngOnInit(): void {

    this.loadCollabs()
  }

  // Get collabs list
  
  loadCollabs() {
    return this.restApi.get().subscribe((data: {}) => {
      this.collabTable = data;
    })
  }

}
