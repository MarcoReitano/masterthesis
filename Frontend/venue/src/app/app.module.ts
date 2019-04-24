import { BrowserModule } from '@angular/platform-browser';
import {Injector, NgModule} from '@angular/core';

// import { AppComponent } from './app.component';
import {createCustomElement} from "@angular/elements";
import { VenueComponent } from './venue/venue.component';
import { VenueListComponent } from './venue-list/venue-list.component';

@NgModule({
  declarations: [
    // AppComponent,
    VenueComponent,
    VenueListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  entryComponents: [VenueComponent, VenueListComponent]
})
export class AppModule {
  constructor(private injector: Injector) {}

  ngDoBootstrap() {

    const venueelement = createCustomElement(VenueComponent, {injector: this.injector});
    customElements.define('venue-list-item', venueelement);

    const venueListElement = createCustomElement(VenueListComponent, {injector: this.injector});
    customElements.define("venue-list", venueListElement)

  }
}
