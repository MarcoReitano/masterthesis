import { PolymerElement, html } from '@polymer/polymer/polymer-element.js';
import '@polymer/iron-icons/iron-icons.js';
import './icon-toggle.js';

class DemoElement extends PolymerElement {
  static get template() {
    return html`
      <style>
        :host {
          font-family: sans-serif;
          --icon-toggle-color: lightgrey;
          --icon-toggle-outline-color: black;
          --icon-toggle-pressed-color: red;
        }
        #polymercontainer {
            border: solid black;
            border-radius: 25px;
            padding: 20px;
            display: inline-block;
        }
      </style>
      <div id="polymercontainer">            
        <h2>
            <img src="https://www.polymer-project.org/images/logos/p-logo.png" alt="Polymer Logo" height="20">
            Polymer
        </h2>
        
        <h3>Statically-configured icon-toggles</h3>
        <icon-toggle toggle-icon="star"></icon-toggle>
        <icon-toggle toggle-icon="star" pressed></icon-toggle>
          
        <h3>Data-bound icon-toggle</h3>
        <!-- use a computed binding to generate the message -->
        <div><span>[[_message(isFav)]]</span></div>
        <!-- curly brackets ({{}}} allow two-way binding --> 
        <icon-toggle toggle-icon="favorite" pressed="{{isFav}}"></icon-toggle>
        
        <h3>My own icon-toggles</h3>
        <icon-toggle toggle-icon="add"></icon-toggle>
        <icon-toggle toggle-icon="add" pressed></icon-toggle>
        <icon-toggle toggle-icon="menu"></icon-toggle>
        <icon-toggle toggle-icon="menu" pressed></icon-toggle>
        <icon-toggle toggle-icon="settings"></icon-toggle>
        <icon-toggle toggle-icon="settings" pressed></icon-toggle>
      </div>
    `;
  }
  _message(fav) {
    if (fav) {
      return 'You really like me!';
    } 
    else {
      return 'Do you like me?';
    }
  }
}
customElements.define('demo-element', DemoElement);
