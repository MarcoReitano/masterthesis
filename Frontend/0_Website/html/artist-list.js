import { html, PolymerElement } from './node_modules/@polymer/polymer/polymer-element.js';
import './node_modules/@polymer/polymer/lib/elements/dom-repeat.js';
import './node_modules/@polymer/iron-ajax/iron-ajax.js';
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
    this["JSON.stringify"] = JSON.stringify;
  }

  static get template() {
    return html`
      <style>
        :host {
          display: block;
        }
      </style>
      <h1>Artist list: </h1>
      <iron-ajax 
        auto 
        url="http://localhost/artists/"
        handle-as="json"
        last-Response="{{responseData}}"
        debounce-duration="300">
      </iron-ajax>
      <template is="dom-repeat" items="[[responseData._embedded.artists]]">
        <artist-element artist="{{item}}"></artist-element>
      </template>
    `;
  }

  static get properties() {
    return {
      artists: {
        type: Array
      }
    };
  }

}

window.customElements.define('artist-list', ArtistList);