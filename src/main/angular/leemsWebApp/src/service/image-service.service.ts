import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class ImageService {

  numBackgroundPics = 7
  numLimaPics = 30;
  numLimaProfilePics = 16;

  backgroundPicsArr = []
  generalLimaPicsArr = [];
  limaProfilePicsArr = []

  constructor() {
    this.initLimaPics();
    this.initLimaProfilePics();
    this.initBackgroundPics();
  }

  getBackgroundPic(): string {
    const randomIndex = Math.floor(Math.random() * Math.floor(this.backgroundPicsArr.length));
    return this.backgroundPicsArr[randomIndex];
  }

  getRandomProfilePic(): string {
    const randomIndex = Math.floor(Math.random() * Math.floor(this.limaProfilePicsArr.length));
    return this.limaProfilePicsArr[randomIndex];
  }

  getRandomPic() : string {
    const randomIndex = Math.floor(Math.random() * Math.floor(this.generalLimaPicsArr.length));
    let limaPicName = this.generalLimaPicsArr[randomIndex]
    this.generalLimaPicsArr.splice(randomIndex, 1);
    return limaPicName;
  }

  /**
   * Init functionality
   *
   */
  initLimaPics(): void {
    for (let i = 0; i < this.numLimaPics; i++) {
      this.generalLimaPicsArr.push("IMG_" + i + ".JPG")
    }
  }

  initLimaProfilePics(): void {
    for(let i = 0; i < this.numLimaProfilePics; i++){
      this.limaProfilePicsArr.push("IMG_" + i + ".JPG")
    }
  }

  initBackgroundPics(): void {
    for (let i = 0; i < this.numBackgroundPics; i++) {
      this.backgroundPicsArr.push("bg" + i + ".jpg")
    }
  }
}
