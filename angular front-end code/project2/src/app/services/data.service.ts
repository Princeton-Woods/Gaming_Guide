import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Armor } from '../models/armor.model';
import { Forum } from '../models/forum.model';
import { Mob } from '../models/mob.model';
import { Potion } from '../models/potion.model';
import { Recipe } from '../models/recipe.model';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  public URL = 'http://localhost:8080'

  constructor(private http: HttpClient){}

  getUsers(): Observable<User[]>{
    return this.http.get<User[]>(this.URL);
  }

  saveUser(data: User): Observable<User>{
    return this.http.post<User>(`${this.URL}/signup`, data);
  }

  getRecipes(): Observable<Recipe[]>{
    return this.http.get<Recipe[]>(`${this.URL}/recipes`);
  }

  getMobs(): Observable<Mob[]>{
    return this.http.get<Mob[]>(`${this.URL}/mobs`);
  }

  getPotions(): Observable<Potion[]>{
    return this.http.get<Potion[]>(`${this.URL}/potions`);
  }

  getWeaponsArmor(): Observable<Armor[]>{
    return this.http.get<Armor[]>(`${this.URL}/weapons_armor`);
  }

  getForums(): Observable<Forum[]>{
    return this.http.get<Forum[]>(`${this.URL}/forums`);
  }
  
  savePost(data: Forum): Observable<Forum>{
    return this.http.post<Forum>(`${this.URL}/forums`, data);
  }
}