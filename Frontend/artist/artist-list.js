import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import 'http://localhost/artistwebcomponent/artist-element.js';

/**
 * `artist-list`
 * 
 *
 * @customElement
 * @polymer
 * @demo demo/index.html
 */
class ArtistList extends PolymerElement {
  constructor() {
    super();

    this.artists = [
      {"alias":"Adele", "genre":"Singer/Songwriter", "facebookuri":"http://www.facebook.com/9189674485"},
      {"alias":"Ed Sheeran", "genre":"Singer/Songwriter", "facebookuri":"http://www.facebook.com/9189674485"},
      {"alias":"Michael Jackson", "genre":"Singer/Songwriter", "facebookuri":"http://www.facebook.com/9189674485"},
      {"alias":"Eminem", "genre":"Singer/Songwriter", "facebookuri":"http://www.facebook.com/9189674485"}
    ]
  }
  static get template() {
    return html`
      <style>
        :host {
          display: block;
        }
      </style>
      <div>Artist list: </div>
      <template is="dom-repeat" items="{{artists}}">
        <artist-element artist="{{item}}"></artist-element>
      </template>
    `;
  }
  static get properties() {
    return {
      prop1: {
        type: String,
        value: 'artist-list',
      },
    };
  }
}

window.customElements.define('artist-list', ArtistList);
