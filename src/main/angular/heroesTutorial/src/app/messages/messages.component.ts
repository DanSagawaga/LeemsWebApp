import { Component, OnInit } from '@angular/core';
import { MessageService} from "../service/message.service";

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.css']
})
export class MessagesComponent implements OnInit {

  // Message service needs to be public to bind to the template
  constructor(public messageService:MessageService) { }

  ngOnInit(): void {
  }

}
