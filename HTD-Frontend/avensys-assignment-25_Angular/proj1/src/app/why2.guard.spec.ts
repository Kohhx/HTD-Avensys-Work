import { TestBed } from '@angular/core/testing';
import { CanDeactivateFn } from '@angular/router';

import { why2Guard } from './why2.guard';

describe('why2Guard', () => {
  const executeGuard: CanDeactivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => why2Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
