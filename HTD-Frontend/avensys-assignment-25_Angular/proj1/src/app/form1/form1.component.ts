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
  dropdown = "";
  val1 = "default";
  textArea = "";

  fun1(formValue: NgForm) {
    console.log(formValue.value);
  }

  resetForm(formValue: NgForm) {
    formValue.resetForm();
  }

  setForm(formValue: NgForm) {
    let details ={
      firstName: "what!!!",
      checkbox: true,
      dropdown: "Option 1",
      val1: "default",
      textarea: "This is a text area"
    }
    formValue.setValue(details)
  }

}
