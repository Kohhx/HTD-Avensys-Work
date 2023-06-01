import { Component, OnInit } from '@angular/core';
import {
  FormArray,
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.css'],
})
export class Form2Component implements OnInit {
  addForm!: FormGroup;

  // Way of using multiple validators
  between3and5 = [
    Validators.required,
    Validators.minLength(3),
    Validators.maxLength(5),
  ];
  between3and5_2 = Validators.compose([
    Validators.required,
    Validators.minLength(3),
    Validators.maxLength(5),
  ]);

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    // let users = new FormArray([
    //   new FormControl('firstone'),
    //   new FormControl('secondone'),
    //   new FormControl('thirdone'),
    // ])

    // console.log(users)

    // First method of creating a reactive form
    // this.addForm = new FormGroup({
    //   firstName: new FormControl(''),
    //   description: new FormControl(''),
    //   type: new FormControl(''),
    // });

    // Second method of creating a reactive form using a form builder
    this.addForm = this.fb.group({
      firstName: [
        '',
        [
          Validators.required,
          Validators.minLength(3),
          Validators.maxLength(10),
        ],
      ],
      type: ['...'],
      // description: ['...', this.between3and5_2],
      // description: ['...', [...this.between3and5]],
      description: ['...', [Validators.minLength(3)]],
      users: new FormArray([
        new FormControl('firstone'),
        new FormControl('secondone'),
        new FormControl('thirdone'),
      ]),
      users2: new FormArray([
        this.fb.group({
          name: new FormControl(''),
          marks: new FormControl(''),
          branch: new FormControl(''),
        }),
      ]),
    });

    //Get values of form everytime it changes
    this.addForm.valueChanges.subscribe((data) => {
      console.log(data);
    });
  }

  addVal() {
    console.log(this.addForm);
    console.log(this.addForm.value);
    console.log(this.addForm.get('firstName')?.value);
    console.log('Valid: ' + this.addForm.valid);
    console.log('Invalid: ' + this.addForm.invalid);
    console.log('Touched: ' + this.addForm.touched);
    console.log('Untouched: ' + this.addForm.untouched);
    console.log('Dirty: ' + this.addForm.dirty);
    console.log('Pristine: ' + this.addForm.pristine);
  }

  setForm() {
    // Set value to the form
    // Have to set all fields
    let obj = {
      firstName: 'Koh',
      description: 'I need a break',
      type: 'Spring',
    };
    this.addForm.setValue(obj);
  }

  patchForm() {
    // Patch value to the form
    // Can set selected number of fields
    let obj1 = {
      firstName: 'Leon',
      description: 'Wheeee!',
    };
    this.addForm.patchValue(obj1);
  }

  resetForm() {
    this.addForm.reset();
  }

  onSubmit() {}

  get userFormArray() {
    return this.addForm.get('users') as FormArray;
  }

  get user2FormArray() {
    return this.addForm.get('users2') as FormArray;
  }

  addUser() {
    let userArr = this.addForm.get('users2') as FormArray;
    let newUser = this.fb.group({
      name: '',
      marks: '',
      branch: '',
    });
    userArr.push(newUser);
  }

  removeElement(i: number) {
    this.user2FormArray.removeAt(i);
  }

  assign(i: number) {
    if (this.user2FormArray.value[i].marks > 60) {
      this.user2FormArray.value[i].branch = 'CSE';
      this.user2FormArray.setValue(this.user2FormArray.value);
    }
  }
}
