import { Component, OnInit } from '@angular/core';
import { Recipe } from 'src/app/models/recipe.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-crafting',
  templateUrl: './crafting.component.html',
  styleUrls: ['./crafting.component.css']
})
export class CraftingComponent implements OnInit {

  public recipes: Recipe[] = [];

  constructor(private service: DataService) {}

  ngOnInit(): void {
    this.service.getRecipes().subscribe(data => {
      this.recipes = data;
    }, error => {
      console.log(error);
    });
  }
}