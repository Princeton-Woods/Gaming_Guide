import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() {}

  loggedIn(): boolean{
    if(localStorage.getItem('username') !== null && localStorage.getItem('password') !== null){
      return true;
    }else{
      return false;
    }
  }

  logout(){
    localStorage.clear();
  }
}