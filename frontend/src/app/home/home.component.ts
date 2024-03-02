import { Component, inject } from '@angular/core';
import { ProductCardComponent } from "../product-card/product-card.component";
import { CommonModule } from '@angular/common';
import { BookKeepingService } from '../book-keeping.service';
import { Book } from '../interfaces/book';

@Component({
    selector: 'app-home',
    standalone: true,
    templateUrl: './home.component.html',
    styleUrl: './home.component.css',
    imports: [CommonModule,ProductCardComponent]
})
export class HomeComponent {
    bookList: Book[] = []
    bookKeepingService: BookKeepingService = inject(BookKeepingService)

    constructor(){
        this.bookKeepingService.getAllBooks().then((
            bookList:Book[]) => this.bookList = bookList)
    }
}
