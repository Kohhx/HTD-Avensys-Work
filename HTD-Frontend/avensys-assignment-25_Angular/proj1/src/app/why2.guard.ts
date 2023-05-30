import { CanDeactivateFn } from '@angular/router';

export const why2Guard: CanDeactivateFn<unknown> = (component, currentRoute, currentState, nextState) => {
  return true;
};
