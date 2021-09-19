import { Component, OnInit } from '@angular/core';
import { Mob } from 'src/app/models/mob.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-mobs',
  templateUrl: './mobs.component.html',
  styleUrls: ['./mobs.component.css']
})
export class MobsComponent implements OnInit {

  public mobs: Mob[] = [];
  public mobsFiltered: Mob[] = [];
  public classCSS: string = "cardAll";

  constructor(private service: DataService) {}

  ngOnInit(): void {
    this.service.getMobs().subscribe(data => {
      this.mobs = data;
      this.mobsFiltered = data;
    }, error => {
      console.log(error);
    });
  }

  openCat(choice: number){
    if(choice === 1){
      this.classCSS = "cardHos";
    } else if(choice === 2){
      this.classCSS = "cardPass";
    } else if(choice === 3){
      this.classCSS = "cardNeut";
    } else {
      this.classCSS = "cardAll";
    }
    this.mobsFiltered = [];
    // this.mobs.filter(mob => mob.status === choice);
    this.mobs.forEach(mob => { 
      switch(choice){
        case 0:
          this.mobsFiltered.push(mob);
          break;
        default:
          if(mob.status === choice){
            this.mobsFiltered.push(mob);
          }
          break;
      } 
    });
  }
  // function openCat(evt, mobName) {
  //   // Declare all variables
  //   var i, tabcontent, tablinks;
  
  //   // Get all elements with class="tabcontent" and hide them
  //   tabcontent = document.getElementsByClassName("tabcontent");
  //   for (i = 0; i < tabcontent.length; i++) {
  //     tabcontent[i].style.display = "none";
  //   }
  
  //   // Get all elements with class="tablinks" and remove the class "active"
  //   tablinks = document.getElementsByClassName("tablinks");
  //   for (i = 0; i < tablinks.length; i++) {
  //     tablinks[i].className = tablinks[i].className.replace(" active", "");
  //   }
  
  //   // Show the current tab, and add an "active" class to the button that opened the tab
  //   document.getElementById(mobName).style.display = "block";
  //   evt.currentTarget.className += " active";
  // }
}