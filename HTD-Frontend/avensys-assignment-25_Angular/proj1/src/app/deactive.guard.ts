import { CanDeactivateFn } from '@angular/router';
import { ProductComponent } from './product/product.component';

export const deactiveGuard: CanDeactivateFn<ProductComponent>= (component:ProductComponent, currentRoute, currentState, nextState) => {
  if (component.isAllowed) {
    return confirm ("Are you sure you want to leave this page?");
  }
  alert("You are not allowed to leave this page")
  return false;
};
