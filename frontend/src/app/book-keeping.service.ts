import { Injectable } from '@angular/core';
import { Book } from './interfaces/book';

@Injectable({
  providedIn: 'root'
})
export class BookKeepingService {

  url = "http://localhost:5000/books"

  constructor() { }

  async getAllBooks(): Promise<Book[]> {
    const data = await fetch(this.url);
    return await data.json() ?? [];
  }

  async getBookById(id: number): Promise<Book> {
    const b = await fetch(this.url +"/"+ id);
    return await b.json();
  }
 
  //TODO: Add save, delete and edit book
  deleteBook (id: number): void {

  }

  editBook(id: number, book: Book) {

  }
}
