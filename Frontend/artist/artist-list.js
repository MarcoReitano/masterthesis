import {html, PolymerElement} from './node_modules/@polymer/polymer/polymer-element.js';
import './node_modules/@polymer/polymer/lib/elements/dom-repeat.js'
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
  constructor(){
    super();
  }

  _handleResponse(event, request){
    console.log("Response!");
  }

  static get template() {
    return html`
      <style>
        .artist-list {
          display: block;
          color: white;
          font-family: Arial, Helvetica, sans-serif;
        }
        .list-title {
          color:black
        }
      </style>
      <div class="artist-list">
        <h1 class="list-title">Artist list</h1>

        <template is="dom-repeat" items="[[responseData._embedded.artists]]">
          <artist-element artist="{{item}}"></artist-element>
        </template>

        <iron-ajax 
          auto 
          url="http://localhost/artists/"
          handle-as="json"
          last-Response="{{responseData}}"
          on-response="_handleResponse"
          debounce-duration="300">
        </iron-ajax>
      </div>
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
