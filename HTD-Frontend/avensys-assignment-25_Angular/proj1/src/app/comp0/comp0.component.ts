import { Component } from '@angular/core';

@Component({
  selector: 'app-comp0',
  templateUrl: './comp0.component.html',
  styleUrls: ['./comp0.component.css']
})
export class Comp0Component {
  title = 'proj1';
  msg = true;
  print1 = "Hello Everyone";

  contacts = [
    { fn: 'John', ln: 'dance center', ID: 1234 },
    { fn: 'Koh', ln: 'book center', ID: 5678 },
    { fn: 'Leon', ln: 'toy center', ID: 9098 },
    { fn: 'Li', ln: 'karate center', ID: 2578 },
  ];

}
