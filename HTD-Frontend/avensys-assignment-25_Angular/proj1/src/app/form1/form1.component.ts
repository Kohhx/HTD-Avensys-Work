import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component {

  firstName= "cool";
  checkbox = false;

  fun1(formValue: NgForm) {
    console.log(formValue.value);
  }

}
