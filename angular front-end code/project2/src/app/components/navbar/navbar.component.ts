import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  public isLoggedIn: boolean = false;

  constructor(public service: DataService) {}

  ngOnInit(): void {
    this.isLoggedIn = this.service.loggedIn();
  }

  logout(){
    this.service.logout();
    if(this.isLoggedIn){
      this.isLoggedIn = false;
    }
  }
}