import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';
import { HttpClientModule } from '@angular/common/http';
import { StudentService } from './student.service';

@NgModule({
  declarations: [
    AppComponent,
    StudentregistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
