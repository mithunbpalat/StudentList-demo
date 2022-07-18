import { Component, OnInit } from '@angular/core';
import { Course } from '../course';
import { Search } from '../search';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-studentregistration',
  templateUrl: './studentregistration.component.html',
  styleUrls: ['./studentregistration.component.css']
})
export class StudentregistrationComponent implements OnInit {

  student : any = new Student(0,"","","","");
  students : any;
  course : any = new Course(0,"");
  courses : any;
  search :any =new Search(0);
  constructor(private service: StudentService) { }

  ngOnInit(): void {
    let resp = this.service.getAllStudents();
    resp.subscribe((data)=>this.students=data);


    let respon = this.service.getCourse();
    respon.subscribe((data)=>this.courses=data);
  }

  
  public postStudent(){
    let resp = this.service.postStudent(this.student);
    resp.subscribe((data)=>this.students=data);
  }


  public delStudent(a: number){
    let resp = this.service.deleteStudent(a);
    resp.subscribe((data)=>this.students=data);
    
  }

  public searchById(a:number){
    let resp = this.service.getStudentById(a);
    resp.subscribe((data)=>this.student=data);
  }


}
