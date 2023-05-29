import { Component } from '@angular/core';

@Component({
  selector: 'app-comp1',
  templateUrl: './comp1.component.html',
  // template: `<h1>Hello World!</h1>
  //   <p>This is my first component!</p>`,
  styleUrls: ['./comp1.component.css'],
})
export class Comp1Component {
  r = 'red'
  g = 'green'
  sentence = "I need a break!"
  class="c1 c2"
  istrue = true
  superpower='superman'
  h = 'Heading'
  valSpan = 2;

  clickMe(){
    console.log("button has been clicked!")
  }

  sum(x:string, y:string, z:number){
    console.log(x+y+z)
  }

  check(e: MouseEvent) {
    console.log(e)
  }
}
