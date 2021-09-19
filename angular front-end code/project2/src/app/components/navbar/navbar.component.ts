import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  public isLoggedIn: boolean;

  constructor(public service: AuthService, private router: Router) {
    this.isLoggedIn = this.service.loggedIn();
  }

  ngOnInit(): void {}

  logout(){
    this.service.logout();
    this.isLoggedIn = false;
    // this.router.navigate(['login']);
  }

  checkUser(page: any){
    if(this.service.loggedIn()){
      this.router.navigate([page]);
    } else {
      this.router.navigate(['']);
    }
  }
}