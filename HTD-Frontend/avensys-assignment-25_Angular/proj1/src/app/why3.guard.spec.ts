import { TestBed } from '@angular/core/testing';
import { CanMatchFn } from '@angular/router';

import { why3Guard } from './why3.guard';

describe('why3Guard', () => {
  const executeGuard: CanMatchFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => why3Guard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
