import { TestBed } from '@angular/core/testing';

import { VehiculeDetailService } from './vehicule-detail.service';

describe('VehiculeDetailService', () => {
  let service: VehiculeDetailService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VehiculeDetailService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
