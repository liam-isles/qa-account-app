import { Component, OnInit } from '@angular/core';
import { AccountService } from '../shared/account/account.service';

@Component({
  selector: 'app-account-list',
  templateUrl: './account-list.component.html',
  styleUrls: ['./account-list.component.css']
})
import { AccountService } from '../shared/account/account.service';

export class AccountListComponent implements OnInit {
  accounts: Array<any>;

  constructor(private accountService: AccountService, private giphyService: GiphyService) { }

  ngOnInit() {
    this.accountService.getAll().subscribe(data => {
      this.accounts = data;
      for (const account of this.accounts) {
        this.giphyService.get(car.name).subscribe( next: url
      => account.giphyUrl = url);
      }
    });
  }
}
