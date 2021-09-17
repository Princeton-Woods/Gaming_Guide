import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { MainComponent } from './components/main/main.component';
import { MobsComponent } from './components/mobs/mobs.component';
import { PotionsComponent } from './components/potions/potions.component';
import { CraftingComponent } from './components/crafting/crafting.component';
import { ArmorComponent } from './components/armor/armor.component';
import { GalleryComponent } from './components/gallery/gallery.component';
import { ForumComponent } from './components/forum/forum.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    NavbarComponent,
    MainComponent,
    MobsComponent,
    PotionsComponent,
    CraftingComponent,
    ArmorComponent,
    GalleryComponent,
    ForumComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}