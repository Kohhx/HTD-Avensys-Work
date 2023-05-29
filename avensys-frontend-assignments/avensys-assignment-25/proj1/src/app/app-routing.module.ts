import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Comp0Component } from './comp0/comp0.component';
import { Comp1Component } from './comp1/comp1.component';
import { Comp2Component } from './comp2/comp2.component';
import { Comp3Component } from './comp3/comp3.component';
import { Comp4Component } from './comp4/comp4.component';

const routes: Routes = [
  { path: 'comp0', component: Comp0Component },
  // { path: "comp1", component: Comp1Component, outlet: "channel1"},
  // { path: "comp2", component: Comp2Component, outlet: "channel2" },
  { path: 'comp1', component: Comp1Component },
  { path: 'comp2', component: Comp2Component },
  { path: 'comp3', component: Comp3Component },
  { path: 'comp4', component: Comp4Component },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
