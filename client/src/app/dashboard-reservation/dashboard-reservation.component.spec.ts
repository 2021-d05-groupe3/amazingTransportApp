import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardReservationComponent } from './dashboard-reservation.component';

describe('DashboardReservationComponent', () => {
  let component: DashboardReservationComponent;
  let fixture: ComponentFixture<DashboardReservationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DashboardReservationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DashboardReservationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
