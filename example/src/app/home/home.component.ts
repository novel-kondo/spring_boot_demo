import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of, Subject } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  apiData: any = [];

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.getApiData();
    setInterval(() => this.getApiData(), 5000);
  }

  getApiData() {
    this.http
      .get("http://localhost:8080/api")
      .subscribe((data) => {
        this.apiData = data;
      });
  }
}