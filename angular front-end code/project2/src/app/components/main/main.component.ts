import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  constructor(private service: AuthService, private router: Router) {}

  ngOnInit(): void {}

  checkUser(page: any){
    if(this.service.loggedIn()){
      this.router.navigate([page]);
    } else {
      this.router.navigate(['login']);
    }
  }
}