import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { pay2guardmatchGuard } from './pay2guardmatch.guard';

describe('pay2guardmatchGuard', () => {
  const executeGuard: CanActivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => pay2guardmatchGuard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
