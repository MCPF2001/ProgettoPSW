import { Component } from '@angular/core';
import {Router, RouterLink, RouterLinkActive, RouterModule, RouterOutlet} from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: true,
  imports: [
    RouterOutlet,
    RouterLinkActive,
    RouterLink
  ],
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router: Router) {}

  navigateToOrdini() {
    this.router.navigate(['/ordine']);  // Naviga alla rotta "ordini"
  }
  title = 'Gestione Ordini';
}
