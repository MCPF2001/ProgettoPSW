import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HttpHeaders } from '@angular/common/http';
import { OAuthService } from 'angular-oauth2-oidc';

export interface Prodotto {
    id: number;
    nome: string;
    prezzo: number;
    disponibilita: boolean;
    TipoProdotto: string;
    quantita: number;

}


@Injectable({
    providedIn: 'root'
})
export class ProdottoService {

    private baseUrl = 'http://localhost:8081/prodotto';

    constructor(private httpClient: HttpClient, private oauthService: OAuthService) { }

    getProdottiDisponibili(): Observable<Prodotto[]> {
        const token = this.oauthService.getAccessToken();
        const headers = new HttpHeaders({
            'Authorization': `Bearer ${token}`
        });

        return this.httpClient.get<Prodotto[]>(`${this.baseUrl}/getall`, { headers });
    }}
