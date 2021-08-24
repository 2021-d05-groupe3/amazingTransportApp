import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateCovoiturageComponent } from './create-covoiturage.component';

describe('CreateCovoiturageComponent', () => {
  let component: CreateCovoiturageComponent;
  let fixture: ComponentFixture<CreateCovoiturageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateCovoiturageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateCovoiturageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
