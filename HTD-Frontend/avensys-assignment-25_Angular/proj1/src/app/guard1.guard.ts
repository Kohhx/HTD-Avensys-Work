import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const guard1Guard: CanActivateFn = (route, state) => {
  const router = inject(Router);
  // return router.navigate(['comp0']);
  return true;
};
