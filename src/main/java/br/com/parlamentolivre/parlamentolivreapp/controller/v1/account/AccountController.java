package br.com.parlamentolivre.parlamentolivreapp.controller.v1.account;

import br.com.parlamentolivre.parlamentolivreapp.service.account.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasRole('Administrator')")
@RequestMapping("api-parlamento-livre/v1/account/")
public class AccountController {

    AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    };

    @Operation(summary = "Return hello cabra", description = "Teste retorno String")
    @SecurityRequirement(name = "Bearer Authenticantion")
    @GetMapping("getHelloWorld")
    public String getHelloWorld(){
        return accountService.getHelloWorld();
    }
}
