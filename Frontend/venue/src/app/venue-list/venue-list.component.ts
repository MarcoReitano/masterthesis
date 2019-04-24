import { Component, OnInit } from '@angular/core';
import {VenueService} from "../venue.service";

@Component({
  selector: 'venue-list',
  template: `    
    <div>
      venue-list works!
      <div *ngFor="let venue of venues; let i = index">
        {{venue['name']}}
      </div>
    </div>
  `,
  styles: []
})
export class VenueListComponent implements OnInit {

  venues:any = [];

  constructor(public venueService:VenueService) { }

  ngOnInit() {
    this.getVenues();
  }

  getVenues() {
    this.venues = [];
    this.venueService.getVenues().subscribe((data: {}) => {
      console.log(data);
      this.venues = data;
      console.log(this.venues);
    });
  }

}
