import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  public user = new User();

  constructor(private service: DataService, private router: Router){}

  ngOnInit(): void {}

  signUpUser(data: any){
    if(data.username !== null || data.password !== null || data.email !== null){
      this.service.saveUser(this.user).subscribe(response => {
        console.log(response);
        alert('Sign Up Successful!');
        this.router.navigate(['login']);
      }, error => {
        console.log(error);
      });
    } else {
      alert('Missing Fields...');
    }
  }
}