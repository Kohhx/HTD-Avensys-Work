import { CanMatchFn } from '@angular/router';

export const guardMatchGuard: CanMatchFn = (route, segments) => {
  return false;
};
