import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public users: User[] = [];

  constructor(private service: DataService, private router: Router){}

  ngOnInit(): void {
    this.service.getUsers().subscribe(data => {
      this.users = data;
    })
  }

  loginUser(data: any){
    for(let i=0; i <= this.users.length; i++){
      if(this.users[i].username === data.username && this.users[i].password === data.password){
        alert('Login Successful!');
        localStorage.setItem('credentials', data.username + "," + data.password);
        this.router.navigate(['']);
      }
    }
  }
}