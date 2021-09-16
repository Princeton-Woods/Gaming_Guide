import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  public isLoggedIn: boolean = false;

  constructor(public service: AuthService) {}

  ngOnInit(): void {
    this.isLoggedIn = this.service.loggedIn();
  }

  logout(){
    this.service.logout();
    this.isLoggedIn = false;
  }
}