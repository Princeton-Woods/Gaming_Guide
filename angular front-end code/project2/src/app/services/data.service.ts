import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  public URL = 'http://localhost:8080/user'

  constructor(private http: HttpClient){}

  getUsers(): Observable<User[]>{
    return this.http.get<User[]>(this.URL);
  }

  saveUser(data: User): Observable<User>{
    return this.http.post<User>(`${this.URL}/signup`, data);
  }

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