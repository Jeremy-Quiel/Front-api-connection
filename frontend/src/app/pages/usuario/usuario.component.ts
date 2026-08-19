import { HttpClient } from '@angular/common/http';
import { Component, inject, signal } from '@angular/core';

@Component({
  selector: 'app-usuario',
  imports: [],
  templateUrl: './usuario.component.html',
})
export class UsuarioComponent {
  http = inject(HttpClient)

  username = signal("")

  printUsername(){
    console.log(this.username())
  }

  getUsuario(){
    this.http.get("http://localhost:8080/api/usuarios", {
      params: {
        name: this.username()
      }
    }).subscribe(
      (r) => {
        console.log({"Response": r})
      }
    )
  }
}
