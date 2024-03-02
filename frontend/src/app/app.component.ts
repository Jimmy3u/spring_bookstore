import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductCardComponent } from "./product-card/product-card.component";
import { NavbarComponent } from "./navbar/navbar.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, ProductCardComponent, NavbarComponent]
})
export class AppComponent {
  title = 'frontend';
}
