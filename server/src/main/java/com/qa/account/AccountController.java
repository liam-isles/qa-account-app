package com.qa.account;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class AccountController {
    private AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all-accounts")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Account> AccountCont() {
    	return repository.findAll().stream()
//    			.filter(this::isCool)
    			.collect(Collectors.toList());
    }
}
/*
    private boolean isCool(Account account) {
        return !account.getfirstName().equals("Gary") &&
                !account.getfirstName().equals("Phil") &&
                !account.getfirstName().equals("Liam") &&
                !account.getfirstName().equals("Tom");
    }
}
*/