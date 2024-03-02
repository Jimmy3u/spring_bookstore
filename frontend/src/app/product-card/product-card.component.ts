import { Component, Input } from '@angular/core';
import { Book } from '../interfaces/book';

@Component({
  selector: 'app-product-card',
  standalone: true,
  imports: [],
  templateUrl: './product-card.component.html',
  styleUrl: './product-card.component.css'
})
export class ProductCardComponent {
  @Input() book!: Book;
}
