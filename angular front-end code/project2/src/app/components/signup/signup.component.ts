import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  public user = new User();

  constructor(private service: DataService){}

  ngOnInit(): void {}

  signUpUser(){
    this.service.saveUser(this.user).subscribe((response) => {
      console.log(response);
    });
  }
}