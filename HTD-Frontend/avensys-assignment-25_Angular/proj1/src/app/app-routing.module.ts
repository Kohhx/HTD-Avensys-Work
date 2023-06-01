import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Comp0Component } from './comp0/comp0.component';
import { Comp1Component } from './comp1/comp1.component';
import { Comp2Component } from './comp2/comp2.component';
import { Comp3Component } from './comp3/comp3.component';
import { Comp4Component } from './comp4/comp4.component';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { Pg404Component } from './pg404/pg404.component';
import { guard1Guard } from './guard1.guard';
import { guard2Guard } from './guard2.guard';
import { guard3Guard } from './guard3.guard';
import { pay2guardGuard } from './pay2guard.guard';
import { deactiveGuard } from './deactive.guard';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { guardMatchGuard } from './guard-match.guard';

const routes: Routes = [
  { path: 'comp0', component: Comp0Component },
  // { path: "comp1", component: Comp1Component, outlet: "channel1"},
  // { path: "comp2", component: Comp2Component, outlet: "channel2" },
  { path: 'form1', component: Form1Component },
  { path: 'form2', component: Form2Component },
  {
    path: 'main',
    component: AppComponent,
    canActivate: [guard1Guard, guard2Guard], // All guard must be true for it to pass
  },

  {
    path: 'main',
    canActivate: [guard1Guard],
    children: [
      { path: 'comp1', component: Comp1Component },
      {
        path: 'comp2',
        component: Comp2Component,
        canActivateChild: [guard3Guard],
        children: [
          { path: 'comp3', component: Comp3Component },
          { path: 'comp4', component: Comp4Component },
        ],
      },
    ],
  },
  { path: 'home', redirectTo: '/main', pathMatch: 'full' }, // Redirect

  { path: 'Automobile', redirectTo: '/Car and Bike' },
  { path: 'Car and Bike', component: Comp3Component },
  {
    path: 'products/:id',
    component: ProductComponent,
    canDeactivate: [deactiveGuard],
  },
  { path: 'products/:id/discount/:discount', component: ProductComponent },
  {
    path: 'payment',
    loadChildren: () =>
      import('./payment/payment.module').then((m) => m.PaymentModule),
  },
  {
    path: 'pay2',
    // canLoad: [guardMatchGuard],
    canMatch: [guardMatchGuard],
    // canActivate: [guard2Guard],
    loadChildren: () => import('./pay2/pay2.module').then((m) => m.Pay2Module),
  },
  { path: '**', component: Pg404Component }, // Wildcard route for a 404 page
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
