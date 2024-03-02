import { Routes } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ProductCardComponent } from './product-card/product-card.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'product-card', component: ProductCardComponent},
    {path: 'book', component: ProductCardComponent},
    {path: '', redirectTo:'/home', pathMatch: 'full'},
    { path: '**', component: PageNotFoundComponent }
];
