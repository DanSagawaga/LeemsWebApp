import { Component } from '@angular/core';
import { ImageService } from "../service/image-service.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss', '../assets/css/material-kit.css','../assets/demo/demo.css']
})
export class AppComponent {
  title = 'Lima (Leems)';
  subTitle = 'Fwee-me-fwuam'

  profileBio = 'Not only the cutest dog in the entire world, but also the sweetest funniest and TIRED-est. ';
  profileBioLine2 = 'Loves to licky-lick and stretchy-stretch.';

  constructor(public imageService:ImageService) {}

}
