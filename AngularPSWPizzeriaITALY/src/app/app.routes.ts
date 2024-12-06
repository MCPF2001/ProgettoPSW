import { Routes } from '@angular/router';
import { OrdiniComponent } from './ordine/ordini.component';
import { HomeComponent } from './home/home.component';  // Supponendo tu abbia una HomeComponent

export const appRoutes: Routes = [
  { path: '', component: HomeComponent },  // La home page
  { path: 'ordini', component: OrdiniComponent },  // La pagina degli ordini
];
