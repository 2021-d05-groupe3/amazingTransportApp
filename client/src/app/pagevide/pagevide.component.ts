import { LoggerService } from './../logger.service';
//    --------------------------------------------------------------------------------------------
//    PAGEVIDE.COMPONENT IS ONLY FOR TEST PURPOSES AND SHOULD NOT BE USED IN THE FINAL APPLICATION
//    --------------------------------------------------------------------------------------------

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pagevide',
  templateUrl: './pagevide.component.html',
  styleUrls: ['./pagevide.component.css']
})
export class PagevideComponent implements OnInit {

  constructor(private log : LoggerService) { }

  ngOnInit(): void {
  }

  onClick(){
    this.log.loggedUser();
  }

  onClick2(){
    this.log.logoutUser();
  }

}
