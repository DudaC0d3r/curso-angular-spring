import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Course } from '../../model/course';


@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrl: './courses-list.component.scss'
})
export class CoursesListComponent {

  @Input() courses: Course[] = [];
  @Output() add = new EventEmitter(false);
  @Output() edit = new EventEmitter(false);
  @Output() remove = new EventEmitter(false);


  readonly displayedColumns = ['name', 'category', 'actions'];



  constructor() {

  }

  ngOnInit(): void {

  }

  onAdd() {
    //console.log("onAdd funciona")
    this.add.emit(true);
  }

  onEdit(course: Course) {
    this.edit.emit(course);
  }

  onDelete(course: Course) {
    this.remove.emit(course);
  }


}

