import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';

const routes: Routes = [
  {path:"",redirectTo:"home",pathMatch:"full"},
  {path:"home",component:StudentregistrationComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
