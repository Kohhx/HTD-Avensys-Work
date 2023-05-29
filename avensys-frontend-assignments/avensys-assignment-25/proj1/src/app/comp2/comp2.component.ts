import { Component } from '@angular/core';

@Component({
  selector: 'app-comp2',
  templateUrl: './comp2.component.html',
  styleUrls: ['./comp2.component.css']
})
export class Comp2Component {

  lowerCase = "THIS USED TO BE IN UPPERCASE"

  upperCase = "This used to be in lowercase"

  dateExample =  Date.now();

  obj ={
    v1: "ship1",
    v2: "ship2",
    v3: "ship3",
  }

  numVal = 100;

  numVal2 = 0.20356;

}
