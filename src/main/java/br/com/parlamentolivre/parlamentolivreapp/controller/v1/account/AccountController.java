package br.com.parlamentolivre.parlamentolivreapp.controller.v1.account;

import br.com.parlamentolivre.parlamentolivreapp.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-parlamento-livre/v1/account/")
public class AccountController {

    AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    };

    @GetMapping("getHelloWorld")
    public String getHelloWorld(){
        return accountService.getHelloWorld();
    }
}
