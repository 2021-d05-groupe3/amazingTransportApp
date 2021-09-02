import { TestBed } from '@angular/core/testing';

import { CovoituragesService } from './covoiturages.service';

describe('CovoituragesService', () => {
  let service: CovoituragesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CovoituragesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
