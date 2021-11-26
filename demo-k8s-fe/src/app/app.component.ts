import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../environments/environment";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  number: number = 0;
  message: string = "";

  constructor(private httpClient: HttpClient) {
  }

  calc() {
    this.httpClient.get(`${environment.apiUrl}/api/fib/${this.number}`, {responseType: 'text'})
      .subscribe(value => this.message = value)
  }

}
