import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  public isLoggedIn: boolean;

  constructor(public service: DataService){
    this.isLoggedIn = service.loggedIn();
  }

  ngOnInit(): void {}

  logout(){
    this.service.logout();
    if(this.isLoggedIn){
      this.isLoggedIn = false;
    } else {
      this.isLoggedIn = true;
    }
  }
}