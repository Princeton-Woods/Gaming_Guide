import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArmorComponent } from './components/armor/armor.component';
import { CraftingComponent } from './components/crafting/crafting.component';
import { ForumComponent } from './components/forum/forum.component';
import { GalleryComponent } from './components/gallery/gallery.component';
import { LoginComponent } from './components/login/login.component';
import { MainComponent } from './components/main/main.component';
import { MobsComponent } from './components/mobs/mobs.component';
import { PotionsComponent } from './components/potions/potions.component';
import { SignupComponent } from './components/signup/signup.component';

const routes: Routes = [
  { path: '', component: MainComponent},
  { path: 'login', component: LoginComponent},
  { path: 'signup', component: SignupComponent},
  { path: 'recipes', component: CraftingComponent},
  { path: 'mobs', component: MobsComponent},
  { path: 'potions', component: PotionsComponent},
  { path: 'weapons_armor', component: ArmorComponent},
  { path: 'gallery', component: GalleryComponent},
  { path: 'forum', component: ForumComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}