import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Forum } from 'src/app/models/forum.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-forum',
  templateUrl: './forum.component.html',
  styleUrls: ['./forum.component.css']
})
export class ForumComponent implements OnInit {

  public username: any = localStorage.getItem('username');
  public date: Date = new Date();
  public forum = new Forum();
  public forums: Forum[] = [];

  constructor(private service: DataService, private router: Router) {}

  ngOnInit(): void {
    this.service.getForums().subscribe(data => {
      this.forums = data;
    }, error => {
      console.log(error);
    });
  }

  postForum(){
    this.forum.dateTime = this.date;
    this.forum.username = this.username;
    this.service.savePost(this.forum).subscribe(data => {
      console.log(data);
      this.router.navigate(['home']);
    }, error => {
      console.log(error);
    });
  }
}