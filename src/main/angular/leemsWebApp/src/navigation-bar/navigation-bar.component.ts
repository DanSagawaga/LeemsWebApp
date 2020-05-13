import {Component, OnInit} from '@angular/core';
import {DOCUMENT} from '@angular/common';
import {$} from "protractor";

@Component({
  selector: 'app-navigation-bar',
  templateUrl: './navigation-bar.component.html',
  styleUrls: ['./navigation-bar.component.scss', '../assets/css/material-kit.css','../assets/demo/demo.css']
})
export class NavigationBarComponent implements OnInit {

  isTransparent = true;
  colorOnScroll=100;
  navbar_initialized: false;

  constructor(
   // @Inject(DOCUMENT) private document: Document)
  ){ }

  ngOnInit(): void {
  }

  checkScrollForTransparentNavbar(): void {}

   // @HostListener('scroll', ['$event']) // for scroll events of the current element
/*

  @HostListener('window:scroll', ['$event']) onScrollEvent(event){

    if(this.document.body.scrollTop > this.colorOnScroll){
      if(this.isTransparent){
        this.isTransparent = false;
        $('.navbar-color-on-scroll').removeClass('navbar-transparent');
      }
    } else {
      if (!this.isTransparent) {
        this.isTransparent = true;
        $('.navbar-color-on-scroll').addClass('navbar-transparent');
      }
    }


  }
*/

  /**
   checkScrollForTransparentNavbar: debounce(function() {
    if ($(document).scrollTop() > scroll_distance) {
      if (materialKit.misc.transparent) {
        materialKit.misc.transparent = false;
        $('.navbar-color-on-scroll').removeClass('navbar-transparent');
      }
    } else {
      if (!materialKit.misc.transparent) {
        materialKit.misc.transparent = true;
        $('.navbar-color-on-scroll').addClass('navbar-transparent');
      }
    }
  }, 17)
   */

}
