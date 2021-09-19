import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() {}

  loggedIn(): boolean{
    if(localStorage.getItem('credentials') !== null){
      return true;
    }else{
      return false;
    }
  }

  logout(){
    localStorage.clear();
  }
}