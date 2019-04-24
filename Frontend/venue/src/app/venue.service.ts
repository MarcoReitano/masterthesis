import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

const venueEndpoint = "/venues/";
const httpOptions = {
  headers: new HttpHeaders(
    {'Content-Type': 'application/json'
    })
};

@Injectable({
  providedIn: 'root'
})
export class VenueService {

  constructor(private http: HttpClient) { }

  private extractVenues(res: Response){
    console.log(res);
    let venues = res['_embedded'].venues;
    return venues || { };
  }

  getVenues(): Observable<any> {
    return this.http.get(venueEndpoint, httpOptions).pipe(
      map(this.extractVenues));
  }
}
