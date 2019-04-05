import { html, PolymerElement } from './node_modules/@polymer/polymer/polymer-element.js';
/**
 * `artist-element`
 * 
 *
 * @customElement
 * @polymer
 * @demo demo/index.html
 */

class ArtistElement extends PolymerElement {
  static get template() {
    return html`
      <style xmlns="http://www.w3.org/1999/html">
        :host {
          display: block;
          color: white;
          font-family: Arial, Helvetica, sans-serif;
        }
        .artist-container{
          position: relative;
          background: linear-gradient(to right, transparent , #000000) no-repeat, url("./resources/Adele.jpg") no-repeat, black;
          background-size: 200px;
          height: 100px;
          padding: 20px 20px 20px 200px;
        }
        .artist-alias{
          font-weight: bold;
          font-size: 2em;
        }
        .artist-genre{
          font-weight: bold;
          font-size: 1.24em;
        }
        .socialmedia-bar{
          position: absolute;
          right: 20px;
          bottom: 20px;
        }
        .socialmedia-icon{
          width: 20px;
        }
      </style>
      <div class="artist-container">
        <div class="artist-alias">[[artist.alias]]</div>
        <div class="artist-genre">[[artist.genre]]</div>
        <div class="socialmedia-bar">
          <a href="[[artist.facebookURI]]">
            <img class="socialmedia-icon" src="./resources/flogo-HexRBG-Wht-58.png" alt="facebook">
          </a>
          
          <a href="[[artist.twitterURI]]">
            <img class="socialmedia-icon" src="./resources/Twitter_Social_Icon_Square_White.png" alt="twitter">
          </a>
          <a href="[[artist.mtvURI]]">
            <img class="socialmedia-icon" src="./resources/mtv-icon-white-200px.png" alt="mtv">
          </a>
        </div>
      </div>
    `;
  }

  static get properties() {
    return {
      artist: {
        type: Object
      }
    };
  }

}

window.customElements.define('artist-element', ArtistElement);