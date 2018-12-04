import { Component } from '@angular/core';

@Component({
  selector: 'my-custom-element',
  template: `
    <!--The content below is only a placeholder and can be replaced.-->
    <style>
      
    </style>
    <div id="angularcontainer">
      <h2>
      <img height="20" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAyNTAgMjUwIj4KICAgIDxwYXRoIGZpbGw9IiNERDAwMzEiIGQ9Ik0xMjUgMzBMMzEuOSA2My4ybDE0LjIgMTIzLjFMMTI1IDIzMGw3OC45LTQzLjcgMTQuMi0xMjMuMXoiIC8+CiAgICA8cGF0aCBmaWxsPSIjQzMwMDJGIiBkPSJNMTI1IDMwdjIyLjItLjFWMjMwbDc4LjktNDMuNyAxNC4yLTEyMy4xTDEyNSAzMHoiIC8+CiAgICA8cGF0aCAgZmlsbD0iI0ZGRkZGRiIgZD0iTTEyNSA1Mi4xTDY2LjggMTgyLjZoMjEuN2wxMS43LTI5LjJoNDkuNGwxMS43IDI5LjJIMTgzTDEyNSA1Mi4xem0xNyA4My4zaC0zNGwxNy00MC45IDE3IDQwLjl6IiAvPgogIDwvc3ZnPg==">
      Angular Elements
      </h2>
      <h1>
        Welcome to {{title}}!
      </h1>
      <h3>Here are some links to help you start: </h3>
      <ul>
        <li>
          <h3><a target="_blank" rel="noopener" href="https://angular.io/tutorial">Tour of Heroes</a></h3>
        </li>
        <li>
          <h3><a target="_blank" rel="noopener" href="https://github.com/angular/angular-cli/wiki">CLI Documentation</a></h3>
        </li>
        <li>
          <h3><a target="_blank" rel="noopener" href="https://blog.angular.io/">Angular blog</a></h3>
        </li>
      </ul>
    </div>
    
  `,
  styles: [
  '#angularcontainer { border: solid black; border-radius: 25px; padding: 20px; display: inline-block;}',
  ':host{ font-family: \'Avenir\', Helvetica, Arial, sans-serif; }'
]
})
export class AppComponent {
  title = 'my-custom-element';
}
